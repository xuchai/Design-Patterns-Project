package Iterator;

import java.util.ArrayList;

import Animal.Animal;

public class AnimalContainer implements Container {
	
	public ArrayList<Animal> animalList;
	public AnimalIterator itr;
	
	public Iterator generateIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public AnimalContainer(){
		animalList = new ArrayList<Animal>();
		itr = new AnimalIterator();
	}
	
	public class AnimalIterator implements Iterator {
		
		
		Integer index;
		
		public AnimalIterator(){
			this.index = 0;
			
		}

		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (index < animalList.size()){
				return true;
			}
			else{
				return false;		
			}
		}

		@Override
		public Animal next() {
			
			System.out.printf("[Iterator]	Using iterator to access the next animal\n");
			
			if (index < animalList.size()){
				index ++;
				return animalList.get(index - 1);
			}
			else{
				return null;		
			}
		}
		
		public void reset(){
			index = 0;
		}
	}
}
