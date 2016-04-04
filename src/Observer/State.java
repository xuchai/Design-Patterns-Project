package Observer;

import Subject.Zoo;

public class State {
	private Integer stf_num;
	private Integer vis_num;
	private Integer anm_num;
	
	public State(Zoo z){
		stf_num = ((StaffObserver) z.observers.get(0)).GetObserver();
		vis_num = ((VisitorObserver) z.observers.get(1)).GetObserver();
		anm_num = ((AnimalObserver) z.observers.get(2)).GetObserver();
	}
	
	public Integer getStf(){
		return stf_num;
	}
	
	public Integer getVis(){
		return vis_num;
	}
	
	public Integer getAnm(){
		return anm_num;
	}
}
