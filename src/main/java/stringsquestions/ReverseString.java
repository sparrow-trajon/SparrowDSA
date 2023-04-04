package stringsquestions;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("Enter Your String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// String rs=reverseString(s);
		// System.out.println(rs);

		/*
		 * s=reverseUsingStack(s); System.out.println(s.toString());
		 */
		/*
		 * s = reverseStringUsingTwoPointer(s.toCharArray()); System.out.println(s);
		 */
		char[] ch = s.toCharArray();
		reverseStringUsingRecursion(ch, 0);
		System.out.println(ch);
	}
/**
 * 
 * this is the recursive call of the function 
 * 
 * 
 * reverseStringUsingRecursion(ch, 0)
  |
  | swap(ch, 0, n-1)
  |
  | reverseStringUsingRecursion(ch, 1)
  |   |
  |   | swap(ch, 1, n-2)
  |   |
  |   | reverseStringUsingRecursion(ch, 2)
  |   |   |
  |   |   | swap(ch, 2, n-3)
  |   |   |
  |   |   | reverseStringUsingRecursion(ch, 3)
  |   |   |   .
  |   |   |   .
  |   |   |   .
  |   |   |   |
  |   |   |   | reverseStringUsingRecursion(ch, n/2)
  |   |   |   |
  |   |   |   | return
  |   |   |   |
  |   |   |   .
  |   |   |   .
  |   |   |   .
  |   |   |
  |   |   | return
  |   |   |
  |   |   .
  |   |   .
  |   |   .
  |   |
  |   | return
  |   |
  |   .
  |   .
  |   .
  |
  | return
  |
  .
  .
  .

 * @param ch
 * @param i
 */
	private static void reverseStringUsingRecursion(char[] ch, int i) {
		int n = ch.length;

		if (i == n / 2) {
			return;
		}
		swap(ch, i, n - i - 1);
		reverseStringUsingRecursion(ch, i + 1);
	}

	private static void swap(char[] ch, int i, int l) {

		char temp = ch[i];
		ch[i] = ch[l];
		ch[l] = temp;
	}

	private static String reverseStringUsingTwoPointer(char[] charArray) {
		int fIndex = 0;
		int lIndex = charArray.length - 1;
		while (fIndex < lIndex || fIndex == lIndex) {
			char temp = charArray[fIndex];
			charArray[fIndex] = charArray[lIndex];
			charArray[lIndex] = temp;
			fIndex++;
			lIndex--;
		}
		return String.valueOf(charArray);
	}

	private static String reverseUsingStack(String s) {

		Stack<Character> ss = new Stack<Character>();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			ss.push(arr[i]);

		}
		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = ss.peek();
			ss.pop();
		}
		return String.valueOf(arr);

	}

	private static String reverseString(String s) {
		StringBuffer buffer = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			buffer.append(s.charAt(i));
		}

		return buffer.toString();
	}
}
