package arrayquestion;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 6, 3, 6, 1 };
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		printDuplicates(arr, 0, map);
	}

	private static void printDuplicates(int[] arr, int i, Map<Integer, Integer> map) {

		if (i > arr.length - 1) {
			return;
		}

		if (map.containsKey(arr[i])) {
			System.out.println(arr[i]);
		} else {
			map.put(arr[i], arr[i]);
		}
		
		printDuplicates(arr, i+1, map);
	}
}
