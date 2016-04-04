package Iterator;

import Animal.Bird;
import Animal.Cat;
import Animal.Dog;
import Animal.Rabbit;

public class IteratorTest {
	public static void main(String Args[]){
		
		
		AnimalContainer instance = new AnimalContainer();
		
		instance.animalList.add(new Bird());
		instance.animalList.add(new Bird());
		instance.animalList.add(new Cat());
		instance.animalList.add(new Dog());
		instance.animalList.add(new Rabbit());
		
		while(instance.itr.hasNext()){
			instance.itr.next().makeSound();
		}
		
	}
}
