package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee implements Comparable{
	private int id;
	private String name;
	private int salary;
	private String emailId;


	public static void main(String[] args) {
		Employee e1= new Employee(1110,"manish",100,"manish@gmail.com");
		Employee e2= new Employee(1232,"rakesh",200,"rakesh@gmail.com");
		Employee e3= new Employee(1113,"lokesh",300,"lokesh@gmail.com");
		Employee e4= new Employee(112349,"pihu",400,"pihu@gmail.com");
		Employee e5= new Employee(15,"ram",500,"ram@gmail.com");
		Employee e6= new Employee(126,"shyam",600,"shyam@gmail.com");
		Employee e7= new Employee(117,"krishna",700,"krishna@gmail.com");
		Employee e8= new Employee(168,"anjana",800,"anjana@gmail.com");
		Employee e9= new Employee(129,"bhim",900,"bhim@gmail.com");
		Employee e10= new Employee(1210,"arjun",1000,"arjun@gmail.com");
		Employee e11= new Employee(2153,"Lakshman",1100,"Lakshman@gmail.com");

		List<Employee> empList= new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		empList.add(e9);
		empList.add(e10);
		empList.add(e11);

		List<Employee> sortedList= empList.stream().sorted().collect(Collectors.toList());
		System.out.println(Arrays.toString(sortedList.toArray()));


		}
	
	
	public Employee(int id, String name, int salary, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.emailId = emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", emailId=" + emailId + "]";
	}


	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		return this.id-e.getId();
	}
}
