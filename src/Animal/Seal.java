package Animal;

public class Seal extends Animal {

	public Seal() {
		this.animalType = "Seal";
		this.soundType = new Owowow(); 
		
		System.out.printf("A new seal in the zoo!\n");
	}
}
