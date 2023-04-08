package searchingalgorithms;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6,7};
		int k=7;
		
		int index=-1;
				index=searchElement(arr,k,0,index);
		System.out.println(index);
	}

	private static int searchElement(int[] arr, int k, int i, int index) {
			
		if(i>arr.length-1) 
			return index;
		if(arr[i]==k) {
			index=i;
			return index;
		}
		return searchElement(arr, k, i+1, index);
	}

}
