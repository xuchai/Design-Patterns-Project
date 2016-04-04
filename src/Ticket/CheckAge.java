package Ticket;

public class CheckAge {
	private Integer age =12;
	public Integer GetAge()
	{
		return age;
	}
	public boolean IsChildren(Integer visitorAge)
	{
		if (visitorAge>GetAge())
		{
			return false;
		}
		{
			System.out.println("[Facade]	Child: child ticket");
			return true;
		}
	}
}
