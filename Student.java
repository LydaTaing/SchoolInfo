package chapter9;

public abstract class Student extends Member implements Graduate {
	private int credit;
	public Student (String firstName , String lastName, int id, int credit){
		super(firstName, lastName, id);
		this.credit = credit;
	}
	
	public int getCredit() {
		return (credit);
	}
	
/**
 * Initially assume students are not ready to graduate.
 */
	public boolean ReadyToGraduate() {
		return false;
	}
	
	
	
	public String toString(){
		return ("Student: " + super.toString()+ "; " + credit + " Credits");
	}

}
