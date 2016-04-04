package Subject;

import Observer.Observer;

public interface Subject {
	
	public void Attach(Observer o);
	public void Notify();
	
}
