package Ticket;

public class CheckSex {
	private String sex ="Female";
	public String GetSex()
	{
		return sex;
	}
	public boolean IsFemale(String visitorSex)
	{
		if (visitorSex==GetSex())
		{
			System.out.println("[Facade]	Female: discount ticket");
			return false;
		}
		{
			System.out.println("[Facade]	Male: regular ticket");
			return true;
		}
	}
}
