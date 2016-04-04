package Observer;

public class AnimalObserver implements Observer {

	private Integer _animalNum;
	
	public AnimalObserver(){
		
		_animalNum = 0;
	}
	
	public void Update(Object newVal) {
		
		_animalNum = (Integer)newVal;
	}
	
	public Integer GetObserver(){
		
		System.out.printf("[Observer] 	The number of animals is %d\n", _animalNum);
		return _animalNum;
	}
	
}
