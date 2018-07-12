package chapter9;

public class ProTech extends Student {
	private int hour;
	

	public ProTech(String firstName, String lastName, int id, int credit, int hour) {
		super(firstName, lastName, id, credit);
		this.hour = hour;
		
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProTech: " +super.toString() + "; " + hour + " hours" ;
	}

	
}
