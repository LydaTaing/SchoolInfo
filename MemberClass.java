package chapter9;

import java.util.Arrays;

/**
 * 
 * @author tainglyda
 * CSC142
 *  4/3/18
 *  
 *  Class that contain an
 *  Array of community Members.
 */
public class MemberClass {
	public Member[] community;
	
	public MemberClass(){
		this.community= new Member[5];
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MemberClass [community= " + Arrays.toString(community) + "]";
	}

	
}
