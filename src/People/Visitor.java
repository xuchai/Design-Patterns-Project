package People;

public class Visitor extends People {
	
	public Visitor(String tempName, Integer tempAge, String tempGender){
		
		this.name = tempName;
		this.age = tempAge;
		this.gender = tempGender;
		
		System.out.printf("New visitor name %s!\n", tempName);
	}
	public Integer GetAge()
	{
		return this.age;
	}
	public String GetSex()
	{
		return this.gender;
	}
}
