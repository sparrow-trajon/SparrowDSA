package arrayquestion;

public class KadaneAlgo {
	
	public static void main(String[] args) {
		
		int[] arr={ -2, -3, 4, -1, -2, 1, 5, -3 };
		
		int max_sum=Integer.MIN_VALUE;
		int max_end=0;
		
		max_sum=findMaxSum(arr,max_end, max_sum,0);
		System.out.println(max_sum);
		
	}

	private static int findMaxSum(int[] arr, int max_end, int max_sum, int i) {
		
		if(i>arr.length-1) {
			return max_sum;
		}
			
		max_end+=arr[i];
		if(max_sum<max_end) {
			max_sum=max_end;
		}
		if(max_end<0)
			max_end=0;
		return findMaxSum(arr, max_end, max_sum, i+1);
	}

}
