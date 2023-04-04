package sortingalgorithm;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
			
		int[] arr= {11,4,15,8,2,-1};
		
		//arr=sortAlgorithm(arr);
			arr=sortWithRecursion(arr,0);
		System.out.println(Arrays.toString(arr));
	}

	private static int[] sortWithRecursion(int[] arr, int i) {
			
		if(i>arr.length-1)
			return arr;
		int j=0;
//		int[] arr= {11,4,15,8,2,-1};
		while(j<arr.length-1) {
			if(arr[j]>arr[j+1]) {
				int temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			j++;
		}
		return sortWithRecursion(arr,i+1);
	}

	private static int[] sortAlgorithm(int[] arr) {
			
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}	
	
	

}
