package Animal;

public class Bird extends Animal {

	public Bird() {
		this.animalType = "Bird";
		this.soundType = new Tweet(); 
		
		System.out.printf("A new bird in the zoo!\n");
	}
}
