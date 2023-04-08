package searchingalgorithms;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int k = 50;
		int index = -1;
		index = findElement(arr, k, index, 0, arr.length-1);
		System.out.println(index);
	}

	private static int findElement(int[] arr, int k, int index, int f, int l) {
		int mid=(f+l)/2;
		
		if(f>l ) {
			return index;
		}
		if(arr[mid]==k) {
			return mid;
		}
		if(arr[mid]>k){
			l=mid-1;
		}
		else {
			f=mid+1;
		}
		return findElement(arr, k, index, f, l);
	}
}
