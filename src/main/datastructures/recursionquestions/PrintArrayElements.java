package recursionquestions;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayElements {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Printing in reverse order\n");
		printReverse(arr, 0);
		System.out.println("\nprinting in insertion order\n");
		print(arr, 0);

	}

	private static void print(int[] arr, int i) {

		if (i > arr.length - 1)
			return;
		System.out.print(arr[i] + " ");
		print(arr, i + 1);

	}

	private static void printReverse(int[] arr, int i) {

		if (i > arr.length - 1)
			return;
		printReverse(arr, i + 1);
		System.out.print(arr[i] + " ");
	}

}
