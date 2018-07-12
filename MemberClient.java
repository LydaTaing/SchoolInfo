package chapter9;

public class MemberClient {


	public static void main(String[] args) {
		//Member SH = new Member ("Sehun", "Oh", 940412);
		//SH.setFirstName("Luhan");
		//System.out.println(SH);
		
		Employee JT = new Employee ("Lee", "hun", 9990);
		JT.setFirstName("JR");
		//System.out.println(JT);
		
		//Student SE = new Student ("Skylar", "Erickson", 9912, 15);
		//System.out.println (SE);
		
		MemberClass allOfUs= new MemberClass();
		//System.out.println(allOfUs);
		
		//allOfUs.community[0] =SH;
		allOfUs.community[1]= JT;
		//allOfUs.community[2]= SE;
		
		for (Member name : allOfUs.community) {
			if (name != null) {
				System.out.println(name);
			}
		}
		 Academic BBH= new Academic ("Byun", "Beak", 9912, 15) ; 
		 System.out.println(BBH);
		 
		 ProTech PCY = new ProTech ("Yeol", "Park", 9913, 35, 50);
		 System.out.println(PCY);
		
		Aviation JD = new Aviation ("JongDae", "Kim", 9914, 12, 30, "Screwers");
		System.out.println(JD);
	}
}

