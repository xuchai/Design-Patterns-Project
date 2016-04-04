package People;

import Subject.Factory;

public class PeopleFactory implements Factory{
	
	public People AddPeople(boolean isStaff, 
			String tempName, Integer tempAge, String tempGender, Integer tempID, String tempTask){
		
		System.out.printf("[Factory] 	Add a new person using factory: ");
		
		if(isStaff){
			return new Staff(tempName, tempAge, tempGender, tempID, tempTask);
		}else{
			return new Visitor(tempName, tempAge, tempGender);
		}
	}

	public People Add(boolean isPeople, boolean isStaff, String tempName, Integer tempAge, String tempGender,
			Integer tempID, String tempTask) {
		if(isPeople){
			System.out.println("[Bridge] 	People factory is called using a bridge pattern");
			return AddPeople(isStaff, tempName, tempAge, tempGender, tempID, tempTask);
		}else{
			return null;
		}
	}
}
