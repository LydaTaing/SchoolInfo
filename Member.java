/**
 * 
 * This class consists of members of the 
 * South Seattle College
 * 
 */

package chapter9;

public class Member {
	private String firstName;
	private String lastName;
	private int id;
	/**
	 * @param firstName
	 * @param lastName
	 * @param id
	 */
	public Member(String firstName, String lastName, int id) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	public String toString() {
		return ( "Name: " + lastName + ", " + firstName +"; "+" ID: " + id);
	}

}
