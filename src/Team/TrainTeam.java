package Team;

import Animal.Animal;

public class TrainTeam implements Team {
	
	private Team NextTeam;
	
	public void SetNextTeam(Team NextTeam) {
		this.NextTeam=NextTeam;

	}

	
	public void Task(Animal TargetAnimal, String Order) {
		if (Order=="Train"){
			System.out.println("[Chain of Responsibility]  "+TargetAnimal.animalType+" is trained");
		}else{
			System.out.println("[Chain of Responsibility]  Allowed tasks: Clean, Feed, Train");
		}

	}

}

