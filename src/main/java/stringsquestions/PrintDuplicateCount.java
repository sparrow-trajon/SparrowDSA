	package stringsquestions;

import java.util.Scanner;

public class PrintDuplicateCount {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String input= sc.nextLine();
		
		
	//	printDuplicate(input);
		int[] arr= new int[26];
		printDuplicateUsingRecursion(input, 0,arr);
		for(int j=0;j<26;j++) {
			if(arr[j]>0) {
				System.out.println((char)(j+97)+"  "+arr[j]);
			}
		}
	}

	private static void printDuplicate(String input) {
		
		int[] arr= new int[26];
		for(int i=0;i<input.length();i++) {
			arr[input.toLowerCase().charAt(i)-97]++;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]>0) {
				System.out.println((char)(i+97)+"  "+arr[i]);
			}
		}
		
	}
	
	private static int[] printDuplicateUsingRecursion(String input,int  i, int[] arr) {
		
		if(i>input.length()-1) {
			return arr;
		}
		arr[input.toLowerCase().charAt(i)-97]++;
		return printDuplicateUsingRecursion(input, i+1, arr);
	}
}
