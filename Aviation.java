package chapter9;

public class Aviation extends ProTech{
	private String Cerf;
	

	public Aviation(String firstName, String lastName, int id, int credit, int hour, String Cerf) {
		super(firstName, lastName, id, credit, hour);
		this.Cerf = Cerf;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Aviation: "+ super.toString() + "; "+ Cerf + " Certifcate";
	}
	

}
