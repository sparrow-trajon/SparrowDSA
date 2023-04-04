package recursionquestions;

public class BalancedBrackets {

	public static void main(String[] args) {

		int n = 3;
		int o = 0;
		int c = 0;
		char[] arr = new char[n * 2];
		printBalancedBrackets(n, o, c, "", 0);
	}

	private static void printBalancedBrackets(int n, int o, int c, String arr, int i) {

		if (arr.length() == n * 2) {
			System.out.println(arr);
			return;
		}
		if (o < n) {
			
			printBalancedBrackets(n, o+1, c, arr+"(", i + 1);

		}
		if (c < o) {
		
			printBalancedBrackets(n, o, c+1, arr+")", i + 1);
		}

		// System.out.println(arr);
	}

}
