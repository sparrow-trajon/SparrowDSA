package sortingalgorithm;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr= {64,25,-12,22,11};
		
		//arr=sortWithSelectionSort(arr);
		arr=sortWithRecursion(arr,0);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] sortWithRecursion(int[] arr, int i) {
			
		if(i>arr.length-1)
			return arr;
		int j=i+1;
		int min=i;
		while(j<=arr.length-1) {
			min=(arr[min]>arr[j])?j:min;
			j++;
		}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
		return sortWithRecursion(arr, i+1);
	}

	private static int[] sortWithSelectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
					if(arr[min]>arr[j])
							min=j;
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		
		return arr;
	}

	
}
