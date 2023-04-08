package interviewquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

public class ConcurentModificationError {

	public static void main(String[] args) {

		byte a=13;
		System.out.println(a);

	}

	private int d() {
		

		{

		for(;;)

		

		d();

		//return 10;

		}		
	}

	public void r() {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		l.stream().forEach(x -> {
			

				System.out.println(x);
				l.add(90 + x);

			

		});
			

		/*
		 * Iterator<Integer> i=l.iterator(); synchronized (l) { while(i.hasNext()) {
		 * Integer x= i.next(); System.out.println(x); if(x==30) { i.remove();
		 * //l.add(12122); System.out.println("no removed"); }
		 * 
		 * } }
		 */
		System.out.println(Arrays.toString(l.toArray()));

		/*
		 * for(Iterator<Integer> i=l.iterator(); i.hasNext();System.out.println("hi")) {
		 * if(i.next()==30) { i.remove(); } }
		 */
	}

}
