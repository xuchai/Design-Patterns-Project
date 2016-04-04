
package Animal;

public abstract class Animal {

	public String animalType;
	public Sound soundType;
	
	public void makeSound(){
		
		System.out.printf("[Stategy]	%s goes %s\n", animalType, soundType.sound());
	}
}

