package sortingalgorithm;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
			
		int[] arr= {12,11,13,6,5,8,10};
//		arr=sort(arr);
		arr=sortWithRecursion(arr,0);
		System.out.println(Arrays.toString(arr));
		
	}

	private static int[] sortWithRecursion(int[] arr, int i) {
		
		if(i>arr.length-1)
			return arr;
		int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			
			return sortWithRecursion(arr, i+1);
	}

	public static int[] sort(int[] a) {
		
		for(int i=1;i<a.length;i++) {
			
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {  
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
			
		}
			
		return a;
	}
	
	
}
