package dynamicprogramming1d;

/**
 * We are given N items where each item has some weight and profit associated
 * with it. We are also given a bag with capacity W, [i.e., the bag can hold at
 * most W weight in it]. The target is to put the items into the bag such that
 * the sum of profits associated with them is the maximum possible.
 */

public class KnapSack {

	/**
	 * Input: N = 3, W = 4, profit[] = {1, 2, 3}, weight[] = {4, 5, 1} Output: 3
	 * Explanation: There are two items which have weight less than or equal to 4.
	 * If we select the item with weight 4, the possible profit is 1. And if we
	 * select the item with weight 1, the possible profit is 3. So the maximum
	 * possible profit is 3. Note that we cannot put both the items with weight 4
	 * and 1 together as the capacity of the bag is 4.
	 * 
	 * Input: N = 3, W = 3, profit[] = {1, 2, 3}, weight[] = {4, 5, 6} Output: 0
	 * 
	 * @author DELL
	 *
	 */
	public static int[][] t = null;

	public static void main(String args[]) {
		int profit[] = new int[] {60, 100, 120 };
		int weight[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = profit.length;
		t = new int[W + 1][n + 1];
		for (int i = 0; i <= W; i++) {
			for (int j = 0; j <= n; j++) {
				t[i][j] = 0;
			}
		}
	//	System.out.println(maxProfitUsingMemoization(W, weight, profit, n));
		
		System.out.println(maxProfitDp(W,n,weight, profit));
	}

	private static int maxProfitDp(int w,int n, int[] wt, int[] pt) {
		int[][] t= new int[n+1][w+1];
		
		//initialize the dp matrix  or base condition for recursive solution
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=w;j++) {
				if(i==0 || j==0)
					t[i][j]=0;
			}
		}
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=w;j++) {
				
				// condition changed to acommodate the dplookup
				if (j < wt[i - 1]) {
					t[i][j]= t[i-1][j];
				} else
					t[i][j]= Math.max(pt[i - 1] + t[i-1][j-wt[i-1]],
							t[i-1][j]);
			}
		}
		
		return t[n][w];
	}

	private static int maxProfit(int W, int wt[], int profit[], int n) {

		if (W == 0 || n == 0)
			return 0;
		if (W < wt[n - 1])
			return maxProfit(W, wt, profit, n - 1);
		else
			return Math.max(profit[n - 1] + maxProfit(W - wt[n - 1], wt, profit, n - 1),
					maxProfit(W, wt, profit, n - 1));
	}

	private static int maxProfitUsingMemoization(int W, int wt[], int profit[], int n) {

		if (n == 0 || W == 0)
			return 0;
		if (t[W][n - 1] != -1) {
			return t[W][n - 1];
		} else {
			if (W < wt[n - 1]) {
				return maxProfitUsingMemoization(W, wt, profit, n - 1);
			} else
				return Math.max(profit[n - 1] + maxProfitUsingMemoization(W - wt[n - 1], wt, profit, n - 1),
						maxProfitUsingMemoization(W, wt, profit, n - 1));
		}

	}

}
