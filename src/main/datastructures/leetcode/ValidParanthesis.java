package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
	
	public static void main(String[] args) {
		String s="(){}[]()";
		System.out.println(checkIfValidParanthesis(s));
	}
	
	public static boolean checkIfValidParanthesis(String s){
			
		Map<Character, Character> map= new HashMap<Character, Character>();
		map.put(')', '(');
		map.put('}', '{');
		map.put(']', '[');
		Stack<Character> st= new Stack<Character>();
		
		for(char c : s.toCharArray()) {
			if( !(st.isEmpty())  && (st.peek() == map.get(c))) {
				st.pop();
			}
			else {
				st.push(c);
			}
		}
		
		return st.isEmpty()?true:false;
	}

}
