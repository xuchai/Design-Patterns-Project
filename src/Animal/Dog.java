package Animal;

public class Dog extends Animal {

	public Dog() {
		this.animalType = "Dog";
		this.soundType = new Woof(); 
		
		System.out.printf("A new dog in the zoo!\n");
	}
}
