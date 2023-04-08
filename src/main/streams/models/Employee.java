package models;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String emailId;
	
	
	
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
	

}
