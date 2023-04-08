package hashing;

import java.util.HashMap;

/**
 * 
 * @author Manish
 *
 */
public class TripletsInGp {

	public static void main(String[] args) {

		int[] arr = { 2, 10, 4, 8, 20, 40 };
		int r = 2;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		findTriplets(arr, r, map);
	}

	private static void findTriplets(int[] arr, int r, HashMap<Integer, Integer> map) {

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] * r) && map.containsKey(arr[i] * r * r)) {
				if (map.get(arr[i] * r) < map.get(arr[i] * r * r) && map.get(arr[i]) < map.get(arr[i] * r)) {
					System.out.println(arr[i]);
					System.out.println(arr[map.get(arr[i] * r)]);
					System.out.println(arr[map.get(arr[i] * r * r)]);
				}
			}

		}
	}
}
