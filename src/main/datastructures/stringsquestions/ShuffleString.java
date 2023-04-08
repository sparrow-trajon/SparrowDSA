package stringsquestions;

import java.util.Scanner;

public class ShuffleString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		String n = sc.nextLine();
		System.out.println("Enter String 1");
		String n1 = sc.nextLine();
		System.out.println("Enter String 2");
		String n2 = sc.nextLine();

		boolean isPuzzleString = checkIfStringIsPuzzleString(n, n1, n2, 0);
		System.out.println(isPuzzleString);
	}

	private static boolean checkIfStringIsPuzzleString(String n, String n1, String n2, int i) {

		String temp = n + n1;
		if (i > temp.length() - 1) {
			return true;
		}
		if (n2.length() != temp.length() || !n2.contains(String.valueOf(temp.charAt(i)))) {
			return false;
		}
		return checkIfStringIsPuzzleString(n, n1, n2, i + 1);
	}

}
