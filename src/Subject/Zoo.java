package Subject;

import java.util.ArrayList;

import Animal.Animal;
import Animal.AnimalFactory;
import Iterator.AnimalContainer;
import Observer.AnimalObserver;
import Observer.Observer;
import Observer.StaffObserver;
import Observer.VisitorObserver;
import People.People;
import People.PeopleFactory;
import People.Staff;
import People.Visitor;

public class Zoo implements Subject {
	
	private String name;
	private String address;
	private String description;
	
	private Integer staffNum;
	private Integer visitorNum;
	private Integer animalNum;
	
	private ArrayList<Staff> staff;
	private ArrayList<Visitor> visitors;
	AnimalContainer animals;
	//private ArrayList<Animal> animals;
	
	public ArrayList<Observer> observers;
	
	public Factory pplFactory;
	public Factory anmFactory;
	
	public Zoo(){
		
		this.name = new String();
		this.address = new String();
		this.description = new String();
		
		this.staffNum = new Integer(0);
		this.visitorNum = new Integer(0);
		this.animalNum = new Integer(0);
	}

	public void Attach(Observer o) {
		observers.add(o);
	}

	public void Notify() {
		
		observers.get(0).Update(staffNum);
		observers.get(1).Update(visitorNum);
		observers.get(2).Update(animalNum);
	}

	public void SetName(String newName){this.name = newName;}
	public void SetAddress(String newAddress){this.address = newAddress;}
	public void SetDescription(String newDescription){this.address = newDescription;}
	
	public void AllocateStaff(Integer newStaffNum){
		this.staffNum = newStaffNum;
		this.staff = new ArrayList<Staff>();
	}
	
	public void AllocateVisitor(Integer newVisitorNum){
		this.visitorNum = newVisitorNum;
		this.visitors = new ArrayList<Visitor>();
	}
	
	public void AllocateAnimal(Integer newAnimalNum){
		this.animalNum = newAnimalNum;
		this.animals = new AnimalContainer();
	}
	
	public void AllocateObservers(){
		observers = new ArrayList<Observer>();
		this.Attach(new StaffObserver());
		this.Attach(new VisitorObserver());
		this.Attach(new AnimalObserver());
	}
	
	public void AllocateFactories(){
		this.pplFactory = new PeopleFactory();
		this.anmFactory = new AnimalFactory();
	}
	
	public void AddAnimal(Animal a){
		animalNum ++;
		this.animals.animalList.add(a);
		
		this.Notify();
	}
	
	public void AddStaff(Staff s){
		staffNum ++;
		this.staff.add(s);
		
		this.Notify();
	}
	
	public void AddVisitor(Visitor v){
		visitorNum ++;
		this.visitors.add(v);
		
		this.Notify();
	}
	
	public void AnimalSound(){
		while(animals.itr.hasNext()){
			animals.itr.next().makeSound();
		}
	}
	
	public void PrintObserver(){
		for (Observer o : this.observers) {
			o.GetObserver();
		}
	}
	
	public ArrayList<Animal> GetAnimalList(){
		return this.animals.animalList;
	}
	public ArrayList<Visitor> GetVisitorList(){
		return this.visitors;
	}
}
