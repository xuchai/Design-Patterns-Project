package Team;

import Animal.Animal;

public class CleanTeam implements Team {
	
	private Team NextTeam;
	
	public void SetNextTeam(Team NextTeam) {
		this.NextTeam=NextTeam;

	}

	
	public void Task(Animal TargetAnimal, String Order) {
		if (Order=="Clean"){
			System.out.println("[Chain of Responsibility]  "+TargetAnimal.animalType+" is cleaned");
		}else{
			NextTeam.Task(TargetAnimal, Order);
		}

	}

}
