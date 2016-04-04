package Animal;

import Subject.Factory;

public class AnimalFactory implements Factory{
	
	public Animal AddAnimal(Integer i){
		
		System.out.printf("[Factory] 	Add a new animal using factory: ");
		
		switch(i){
			case 0:
				return new Bird();
			case 1:
				return new Cat();
			case 2:
				return new Dog();
			case 3:
				return new Rabbit();
			case 4:
				return new Seal();
			default:
				System.out.println("[ERROR] 	We dont have that kind of animal");
				return null;
		}
		
	}
	
	public Animal Add(boolean isPeople, boolean isStaff, String tempName, Integer tempAge, String tempGender,
			Integer tempID,String tempTask) {
		if(!isPeople){
			
			System.out.println("[Bridge] 	Animal factory is called using a bridge pattern");
			return AddAnimal(tempID%5);
		}else{
			return null;
		}
		
	}
}
