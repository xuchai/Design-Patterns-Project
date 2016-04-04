package Iterator;

import java.util.ArrayList;

import Animal.Animal;

public interface Iterator {
	public boolean hasNext();
	public Object next();
	public void reset();
}

