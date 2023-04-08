package stringsquestions;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter your String.");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		/*
		 * boolean ifStringPalindorme=isPalindrome(str);
		 * System.out.println(ifStringPalindorme);
		 */
		char[] arr = str.toCharArray();
		boolean isPalindrome = isPalindromeWithRecursion(arr, 0);
		System.out.println(isPalindrome);
	}

	private static boolean isPalindromeWithRecursion(char[] ch, int i) {

		if ((ch[i] != ch[ch.length - i - 1])) {
			return false;
		}
		if (i == ch.length/2) {
			return true;
		} else {
			return isPalindromeWithRecursion(ch, i + 1);
		}

	}

	private static boolean isPalindrome(String str) {

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}
}
