package Subject;

import Animal.Animal;
import People.People;
import People.Staff;

public interface Factory {

	public Object Add(boolean isPeople, boolean isStaff, String tempName, Integer tempAge, String tempGender,
			Integer tempID, String tempTask);

}
