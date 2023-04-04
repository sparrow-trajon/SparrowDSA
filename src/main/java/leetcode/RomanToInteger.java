package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RomanToInteger {

	public static void main(String[] args) {
		String number = "LVIII";

		int res = romanToInt(number);
		System.out.println(res);
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		char[] arr= s.toCharArray();
		Stack<Character> stack= new Stack<Character>();
		for(char c: s.toCharArray()) {
			stack.push(c);
		}
		int lastValue=-1;
		int sum=0;
		
			
			while(!stack.isEmpty()) {
				char sValue=stack.peek();
				System.out.println("value for "+ s+" >>>"+map.get(sValue));
				if(lastValue>map.get(sValue)) {
					sum-=map.get(sValue);
				}else {
					sum=sum+map.get(sValue);
				}
				lastValue=map.get(sValue);
				stack.pop();
			}
		
		System.out.println(sum);
		return sum;
	}

}
