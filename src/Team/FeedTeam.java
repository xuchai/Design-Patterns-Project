package Team;

import Animal.Animal;

public class FeedTeam implements Team {
	
	private Team NextTeam;
	
	public void SetNextTeam(Team NextTeam) {
		this.NextTeam=NextTeam;

	}

	
	public void Task(Animal TargetAnimal, String Order) {
		if (Order=="Feed"){
			System.out.println("[Chain of Responsibility]  "+TargetAnimal.animalType+" is fed");
		}else{
			NextTeam.Task(TargetAnimal, Order);
		}

	}

}


