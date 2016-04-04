package Observer;

public class VisitorObserver implements Observer {

	private Integer _visitorNum;
	
	public VisitorObserver(){
		
		_visitorNum = 0;
	}
	
	public void Update(Object newVal) {
		
		_visitorNum = (Integer)newVal;
	}
	
	public Integer GetObserver(){
		
		System.out.printf("[Observer] 	The number of visitors is %d\n", _visitorNum);
		return _visitorNum;
	}

}
