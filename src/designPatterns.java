import java.util.ArrayList;
import java.util.Random;

import Animal.*;
import Observer.*;
import People.*;
import Subject.*;
import Team.*;
import Ticket.TicketOffice;


public class designPatterns {

	public static void main(String Args[]) {
		
		ZooBuilder tempZooBuilder = new ZooBuilder();
		Zoo instance = tempZooBuilder.BuildingZoo("Crazy Zoo", 
				"Crazy town", "This is crazy", 0, 0, 0);
	    
		instance.PrintObserver();
		
		Random temp = new Random();
		for (int i = 0; i < 10; i ++){
			instance.AddAnimal((Animal) instance.anmFactory.Add(false, false, "", 0, "", temp.nextInt(5), ""));
		}
		
		// Initialize an Originator and a CareTaker
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		ArrayList<Animal> AnimalList = instance.GetAnimalList();
		 
		Team Team1= new CleanTeam();
		Team Team2= new FeedTeam();
		Team Team3= new TrainTeam();
		 
		Team1.SetNextTeam(Team2);
		Team2.SetNextTeam(Team3);
		 
		Animal TempAnimal=AnimalList.get(0);
		Team1.Task(TempAnimal, "Feed");
		Team1.Task(TempAnimal, "Clean");
		Team1.Task(TempAnimal, "Train");
		Team1.Task(TempAnimal, "Sell");

		instance.AddStaff((Staff) instance.pplFactory.Add(true, true, "Amy", 21, "Female", 1000, "Feeding"));
		instance.AddStaff((Staff) instance.pplFactory.Add(true, true, "Bob", 25, "Male", 1001, "Feeding"));
		instance.AddStaff((Staff) instance.pplFactory.Add(true, true, "Mark", 30, "Male", 1002, "Cleaning"));
		careTaker.saveState(instance, originator);
		
		instance.AddStaff((Staff) instance.pplFactory.Add(true, true, "Chris", 35, "Male", 1003, "Cleaning"));
		instance.AddStaff((Staff) instance.pplFactory.Add(true, true, "Nancy", 41, "Female", 1004, "Training"));
		instance.AddStaff((Staff) instance.pplFactory.Add(true, true, "Steve", 23, "Male", 1005, "Training"));
		
		// Set originator in the further upgraded state, add it into the careTaker, and print current state
		careTaker.saveState(instance, originator);
		
		originator.printState("Current");
		
		instance.AddVisitor((Visitor) instance.pplFactory.Add(true, false, "Carl", 40, "Male", 0, ""));
		instance.AddVisitor((Visitor) instance.pplFactory.Add(true, false, "Julie", 10, "Female", 0, ""));
		instance.AddVisitor((Visitor) instance.pplFactory.Add(true, false, "Mary", 38, "Female", 0, ""));
		
		// Set originator in the final state, add it into the careTaker, and print final state
		careTaker.saveState(instance, originator);
		originator.printState("Final");
		
		// Retrieve the first state
		originator.getStateFromMemento(careTaker.get(0));
		originator.printState("First");
		
		// Retrieve the second state
	    	originator.getStateFromMemento(careTaker.get(1));
	    	originator.printState("Second");
		
		instance.PrintObserver();
		
		instance.AnimalSound();
		
		instance.PrintObserver();
		
		ArrayList<Visitor> VisitorList = instance.GetVisitorList();
		TicketOffice ticketOffice = new TicketOffice();
		while (!VisitorList.isEmpty())
		{
			ticketOffice.TicketType(VisitorList.get(0));
			VisitorList.remove(0);
		}
	}
}
