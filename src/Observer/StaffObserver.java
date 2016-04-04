package Observer;

public class StaffObserver implements Observer {

	private Integer _staffNum;
	
	public StaffObserver(){
		
		_staffNum = 0;
	}
	
	public void Update(Object newVal) {
		
		_staffNum = (Integer)newVal;
	}
	
	public Integer GetObserver(){
		
		System.out.printf("[Observer] 	The number of staff is %d\n", _staffNum);
		return _staffNum;
	}

}