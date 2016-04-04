package People;

import java.io.PrintStream;

public class Staff extends People{
	private Integer WorkID;
	private String Task;
	public Staff(String tempName, Integer tempAge, String tempGender, Integer tempID, String tempTask){
		
		this.name = tempName;
		this.age = tempAge;
		this.gender = tempGender;
		this.WorkID = tempID;
		this.Task=tempTask;
		
		System.out.printf("New staff name %s, with sepcialization %s!\n", tempName, tempTask);
	}
}
