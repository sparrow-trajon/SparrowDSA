package recursionquestions;

import java.util.Arrays;

public class SubSetSum {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};
		int sum=10;
		
		findSumSubSet(a,0, sum);
	}

	private static int findSumSubSet(int[] a,int i, int sum) {
		if(i<=a.length-1) {
			System.out.println(Arrays.toString(a));
			System.out.println(sum);
			System.out.println(i);
			return 0;
		}
		
		int x= findSumSubSet(a, i+1, sum-a[i]);
		int y= findSumSubSet(a, i+1, sum);
		System.out.println(x);
		System.out.println(y);
		return x+y;
		  
		
	}        

}
