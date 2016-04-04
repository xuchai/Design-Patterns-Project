package Ticket;

import People.Visitor;

public class TicketOffice {
	CheckAge checkAge;
	CheckSex checkSex;
	public TicketOffice()
	{
		checkAge=new CheckAge();
		checkSex=new CheckSex();
	}

	public void TicketType(Visitor currentvisitor)
	{
		Integer age=currentvisitor.GetAge();
		String sex=currentvisitor.GetSex();
		if (checkAge.IsChildren(age))
			return;
		else 
		{
			checkSex.IsFemale(sex);
		}
		return;
	}
}