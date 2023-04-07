package dynamicprogramming1d;

public class SubSetSumDp {

	public static boolean[][] t;

	public static void main(String[] args) {
		int[] a = { 3, 34, 4, 12, 5, 2 };
		int sum = 61;
		int n = a.length;
		t = new boolean[n + 1][sum + 1];

		// boolean subSetPresent=subSetPresent(a,sum, 0);
		// int subSetPresent=subSetPresentWithMem(a,sum, 0);
		System.out.println(subsetDp(a, sum, n));

	}

	private static boolean subsetDp(int[] a, int sum, int n) {

		// initializing the dp array/matrix

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= sum; j++) {
				if (i == 0)
					t[i][j] = false;
				if (j == 0)
					t[i][j] = true;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {

				// condition if current element is grater than the sum, so excluding that

				if (j < a[i - 1]) {
					t[i][j] = t[i - 1][j];
				}
				/**
				 * current element is less than the sum, so we have two choices either I can include that or 
				 * not .
				 */
				else {
					t[i][j] = (t[i - 1][j - a[i - 1]]) || (t[i - 1][j]);
				}
			}
		}

		return t[a.length][sum];
	}

	private static boolean subSetPresent(int[] a, int sum, int i) {

		if (sum == 0) {
			return true;
		} else if (a.length - 1 == i)
			return false;
		boolean x = subSetPresent(a, sum - a[i], i + 1);
		boolean y = subSetPresent(a, sum, i + 1);

		return (x || y);
	}

}
