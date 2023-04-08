package dsa;

import java.util.Arrays;

public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		
		int [] arr= {1,3,5};
		int [] arr2= {2,4,6,8};
		int [] mergeArray= new int[arr.length+arr2.length];
		
		mergeArray=mergeTwoArray(arr,arr2, 0,mergeArray,0,0);
		System.out.println(Arrays.toString(mergeArray));
		
	}

	private static int[] mergeTwoArray(int[] arr, int[] arr2, int count, int[] mergeArray, int i, int j) {
		
		if(count>arr.length+arr2.length-1) {
			return mergeArray;
		}
		if(i<=arr.length-1 && j<=arr2.length-1) {
			if(arr[i]>arr2[j]) {
				mergeArray[count]=arr2[j];
				j++;
			}
			else {
				mergeArray[count]=arr[i];
				i++;
			}
			count++;
		}
		else {
			if(i<arr.length-1) {
				while(i<arr.length) {
					mergeArray[count]=arr[i];
					i++;
					count++;
				}
			}
			if(j<arr2.length-1) {
				while(j<arr2.length) {
					mergeArray[count]=arr2[j];
					j++;
					count++;
				}
			}
		}
		
			return mergeTwoArray(arr, arr2, count, mergeArray, i, j);
	}

}
