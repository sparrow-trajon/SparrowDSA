package misc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Temp {
	
	public static void main(String[] args) {
		
		
		
		Map<Integer, String> map= new HashMap<Integer, String>();
		
		map.put(10, "RRR");
		map.put(10, "Kantara");
		map.put(10, "Bahubali");
		map.put(10, "KGF");
		map.put(10, "Drishyam");
			

			 Set<Integer> keys= map.keySet();
			 
			 for(Integer k:keys) {
				 System.out.println(k);
				 System.out.println(map.get(k));
			 }
			
		}
}
