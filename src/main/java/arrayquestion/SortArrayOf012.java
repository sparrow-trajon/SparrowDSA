package arrayquestion;

import java.util.Arrays;

public class SortArrayOf012 {
	
	public static void main(String[] args) {
		
		
		int[] a= {1,2,0,0,0,1,2,0,0,2};
			
		int[] ar=new int[3];
		ar=countValues(a,ar,0);
		int i=0;
		int j=0;
		for(i=0;i<ar[0];i++) {
			a[i]=0;
		}
		for( j=i;j<ar[1]+i;j++) {
			a[j]=1;
		}
		for(int k=j;k<ar[2]+j;k++) {
			a[k]=2;
		}
		System.out.println(Arrays.toString(a));
		
		
	}

	private static int[] countValues(int[] a, int[] ar, int i) {
		
		if(i>a.length-1) {
			return ar;
		}
		ar[a[i]]++;
		return countValues(a, ar, i+1);
	}

}
