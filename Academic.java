package chapter9;
/**
 * 
 * @author tainglyda
 * CSC 142
 * April 10, 2018
 * 
 * Sub class of Student.
 *
 */

public class Academic extends Student{

	public Academic(String firstName, String lastName, int id, int credit) {
		super(firstName, lastName, id, credit);
		
	}
	
	public boolean ReadyToGraduate() {
		return super.getCredit() >=90;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ( "Academic: "+ super.toString());
	}
	
	

}
