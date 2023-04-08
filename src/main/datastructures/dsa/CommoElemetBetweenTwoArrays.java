package dsa;

import java.util.HashMap;

public class CommoElemetBetweenTwoArrays {
	
	public static void main(String[] args) {
		int[] a1= {1,45,54,71,76,12};
		int[] a2= {1,7,5,4,6,12};
			
		printCommonElement(a1,a2);
	}

	private static void printCommonElement(int[] a1, int[] a2) {
		
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i=0;i<a1.length;i++) {
			map.put(a1[i], a1[i]);
		}
		for(int i=0;i<a2.length;i++) {
			if(map.containsKey(a2[i])) {
				System.out.println(a2[i]);
			}
		}
	}
}	

