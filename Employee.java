package chapter9;

public class Employee extends Member{
	//private int salary;

	public Employee(String firstName, String lastName, int id) {
		super(firstName, lastName, id);
	}
	
	public String toString (){
		return ("Employee: " + super.toString());
	}
	

}
