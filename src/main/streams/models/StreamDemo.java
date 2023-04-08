package models;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
			
		// creating the stream
		
		Employee e= new Employee(1, "manish", 1000, "man@gmail.com");
		Employee e1= new Employee(2, "kunal", 2000, "kunal@gmail.com");
		Employee e2= new Employee(3, "lokesh", 33000, "lokesh@gmail.com");
		Employee e3= new Employee(4, "pritesh", 4000, "pritesh@gmail.com");
		Employee e4= new Employee(5, "shivam", 5000, "shivam@gmail.com");
		Employee e5= new Employee(6, "alok", 6000, "alok@gmail.com");
		Employee e6= new Employee(7, "saurabh", 7000, "saurabh@gmail.com");
		Employee e7= new Employee(8, "chandan", 8000, "chandan@gmail.com");
		Employee e8= new Employee(9, "yogesh", 91000, "yogesh@gmail.com");
		Employee e9= new Employee(10, "brijesh", 51000, "brijesh@gmail.com");
		
		List<Employee> list= new ArrayList();
		list.add(e9);
		list.add(e8);
		list.add(e7);
		list.add(e6);
		list.add(e5);
		list.add(e4);
		list.add(e3);
		list.add(e2);
		list.add(e1);
		list.add(e);
		
		
		boxedExample();
		
		
	}
	
	/**
	 * In Java stream, the boxed() method is used 
	 * to convert a stream of primitive types (such as int, long, double, etc.) 
	 * to a stream of boxed types (such as Integer, Long, Double, etc.). 
	 * This is necessary because many of the stream operations, such as filter(),
	 *  map(), reduce(), etc., 
	 * work only with streams of reference types.
	 */
	public static void boxedExample() {
		
		
		double[] f= {100.212,34.132,314.46,98.242,3141.56,95.34143};
			
		double sum=Arrays.stream(f).boxed().filter(x->{
				return x>10.22;
		}).mapToDouble(Double ::doubleValue).sum();
		
		System.out.println(sum);
	}
}
