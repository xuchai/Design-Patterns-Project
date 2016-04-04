package Team;

import Animal.Animal;

public interface Team {
	public void SetNextTeam(Team NextTeam);
	public void	Task(Animal TargetAnimal, String Order);
}
