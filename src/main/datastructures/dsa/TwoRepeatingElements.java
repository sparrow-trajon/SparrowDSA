package dsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoRepeatingElements {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 5, 2, 3, 4 };
		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		int[] bb=new int[arr.length];
		//printDuplicateHashing(arr,0,bb);
		//printTwoDuplicates(arr, 0, m);
		printDuplicateUsingArrayElementIndexing(arr,0);
	}
	private static void printDuplicateUsingArrayElementIndexing(int[] arr, int i) {
		
		if(i>arr.length-1) {
			return;
		}
		int index=Math.abs(arr[i]);
		if(arr[index]>0) {
			arr[index]=-arr[index];
		}
		else {
			System.out.println(Math.abs(arr[i]));
		}
		printDuplicateUsingArrayElementIndexing(arr, i+1);
	}
	private static void printDuplicateHashing(int[] arr, int i, int[] bb) {
		
		if(i>arr.length-1) {
			return;
		}
		if(bb[arr[i]]>0) {
			System.out.println(arr[i]);
		}
		else {
			bb[arr[i]]++;
		}
		printDuplicateHashing(arr, i+1, bb);
	}
	private static void printTwoDuplicates(int[] arr, int i, Map<Integer, Integer> m) {
		if (i > arr.length - 1) {
			return;
		}
		if (m.containsKey(arr[i])) {
			System.out.println(Math.abs(arr[i]));
		} else {
			m.put(arr[i], arr[i]);
		}
		printTwoDuplicates(arr, i + 1, m);
	}
}
