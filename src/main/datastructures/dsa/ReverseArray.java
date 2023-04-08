package dsa;

import java.util.Arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int[] arr= {1, 2, 3,4,9};
		
		arr=reverse(arr,arr.length);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] reverse(int[] arr, int N) {
			int i=0;
		while(i<=arr.length/2) {
			int temp=arr[N-i-1];
			int t1=arr[i];
			arr[N-i-1]= t1;
			arr[i]=temp;
			i++;
		}
		
		return arr;
	}

}
