package stringsquestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RotationString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String..");
		String input = sc.nextLine();
		System.out.println("Enter Second String");
		String input2 = sc.nextLine();
		/*
		 * boolean isRotation= checkIfRotationUsingQ(input, input2);
		 * System.out.println(isRotation);
		 */

		/*
		 * boolean isRotation=checkRotation(input, input2);
		 * System.out.println(isRotation);
		 */

		boolean isRotation = checkIfRotationUsingRecursion(input, input2);
		System.out.println(isRotation);

	}

	private static boolean checkRotation(String input, String input2) {

		if (input2.concat(input2).indexOf(input) >= 0) {
			return true;
		}

		return false;
	}

	private static boolean checkIfRotationUsingQ(String input, String input2) {

		Queue<Character> q = new LinkedList<Character>();
		Queue<Character> q2 = new LinkedList<Character>();

		for (int i = 0; i < input.length(); i++) {
			q.add(input.charAt(i));
			q2.add(input2.charAt(i));
		}
		int count = 1;
		while (count <= input.length()) {
			char c = q.peek();
			q.remove();
			q.add(c);

			if (q.equals(q2)) {
				return true;
			}
			count++;
		}

		return false;
	}

	private static boolean checkIfRotationUsingRecursion(String input, String input2) {

		Queue<Character> q = new LinkedList<Character>();
		Queue<Character> q2 = new LinkedList<Character>();

		for (int i = 0; i < input.length(); i++) {
			q.add(input.charAt(i));
			q2.add(input2.charAt(i));
		}
		int count = 1;

		return checkRotation(input, input2, q, q2, count);
	}

	private static boolean checkRotation(String input, String input2, Queue<Character> q, Queue<Character> q2,
			int count) {
		if (count > input.length() - 1) {
			return false;
		}
		if (q.equals(q2)) {
			return true;
		}
		
		char c = q.peek();
		q.remove();
		q.add(c);

		return checkRotation(input, input2, q, q2, count + 1);
	}
}
