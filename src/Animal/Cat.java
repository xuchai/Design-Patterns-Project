package Animal;

public class Cat extends Animal {

	public Cat() {
		this.animalType = "Cat";
		this.soundType = new Meow(); 
		
		System.out.printf("A new cat in the zoo!\n");
	}
}
