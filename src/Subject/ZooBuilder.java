package Subject;

public class ZooBuilder {
	
	public Zoo BuildingZoo(
			String newName, String newAddress, String newDescription, 
			Integer newStaffNum, Integer newVisitorNum, Integer newAnimalNum){
		
		System.out.println("[Builder]  build a new zoo step by step");
		
		Zoo ret = new Zoo();
		ret.SetName(newName);
		ret.SetAddress(newAddress);
		ret.SetDescription(newDescription);
		
		ret.AllocateStaff(newStaffNum);
		ret.AllocateVisitor(newVisitorNum);
		ret.AllocateAnimal(newAnimalNum);
		
		ret.AllocateObservers();
		ret.AllocateFactories();
		
		ret.Notify();
		
		return ret;
	}
}
