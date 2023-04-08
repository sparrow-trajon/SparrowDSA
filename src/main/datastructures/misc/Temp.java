package misc;

import java.util.LinkedList;
import java.util.Queue;

public class Temp {
	
	public static void main(String[] args) {
		String a="CASA";
		
		String b="BAHF";
		
		Queue< Character> q= new LinkedList<Character>();
		
		//All the values are inserted in the queue.
		for(int i=0;i<b.length();i++) {
			q.add(b.charAt(i));
			
		}
		
		System.out.println("added all the characters in the queue");
		
		boolean magicString=false;
		int i=b.length()-1;
		while(!magicString && i>=0) {
			char c= q.poll();
			q.add(c);
			
			if((getStringFromQueue(q)).equals(a)) {
				magicString=true;
				System.out.println(magicString);
				return;
			}
			i--;
		}
		System.out.println("fasle");
		
	}

	private static String  getStringFromQueue(Queue<Character> q) {
		Queue<Character> newQ= new LinkedList<Character>(q);
		String res="";
		int i=0;
		while(!newQ.isEmpty()) {
			res+=newQ.poll();
		}
		
	//	System.out.println(res);
	return res;
	}
}
