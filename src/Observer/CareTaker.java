package Observer;

import java.util.ArrayList;
import java.util.List;

import Subject.Zoo;

public class CareTaker {
   private List<Memento> mementoList = new ArrayList<Memento>();

   public void add(Memento memo){
      mementoList.add(memo);
   }

   public Memento get(int index){
      return mementoList.get(index);
   }
   
   public void saveState(Zoo instance, Originator originator){
	   State temp = new State(instance);
	   originator.setState(temp);
	   this.add(originator.saveStateToMemento());
   }
}