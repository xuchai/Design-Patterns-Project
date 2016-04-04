package Animal;

public class Rabbit extends Animal {

	public Rabbit(){
		this.animalType = "Rabbit";
		this.soundType = new Silence();
		
		System.out.printf("A new rabbit in the zoo!\n");
	}
}