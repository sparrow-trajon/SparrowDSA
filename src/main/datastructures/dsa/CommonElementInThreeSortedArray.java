package dsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommonElementInThreeSortedArray {
	public static void main(String[] args) {
		int[] a= {1, 5, 10, 20, 40, 80};
		int[] b= {6, 7, 20, 80, 100};
		int[] c= {3, 4, 15, 20, 30, 70, 80, 120};
		/*
		 * Map<Integer, Boolean> map= new LinkedHashMap<Integer, Boolean>();
		 * 
		 * map=insertIntoMap(a,b,c,map); map.entrySet().stream().forEach(x->{
		 * if(x.getValue() == true) { System.out.println(x.getKey()); } });
		 */
		
		printCommonElements(a,b,c);
			
	}

	private static void printCommonElements(int[] a, int[] b, int[] c) {
		int i,j,k;
		i=0;j=0;k=0;
		int ip=Integer.MIN_VALUE;
		int jp=ip;
		int kp=ip;
		while(i<a.length  && j<b.length && k<c.length) {
			
			/**
			 * If we have to check if the array have duplicate elements then we can eliminte them by keep tracking 
			 * of the previous element.
			 * 
			 */
			while(i<a.length && ip==a[i]) {
				i++;
			}
			while(j<b.length && jp==b[j]) {
				j++;
			}
			while(k<c.length && kp==c[i]) {
				k++;
			}
			if(a[i]==b[j] && b[j]==c[k]) {
				System.out.println(a[i]);
				i++;
				j++;
				k++;
			}
			else if(a[i]<b[j]) {
				i++;
			}
			else if(b[j]<c[k]) {
				j++;
			}
			else {
				k++;
			}
		}
	}

	private static Map<Integer, Boolean> insertIntoMap(int[] a, int[] b, int[] c, Map<Integer, Boolean> map) {
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i]))
				map.replace(a[i], true);
			else
				map.put(a[i], false);
		}
		for(int i=0;i<b.length;i++) {
			if(map.containsKey(b[i]))
				map.replace(b[i], true);
			else
				map.put(b[i], false);
		}
		for(int i=0;i<c.length;i++) {
			if(map.containsKey(c[i]))
				map.replace(c[i], true);
			else
				map.put(c[i], false);
		}
		return map;
	}

}
