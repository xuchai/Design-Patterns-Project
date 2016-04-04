package Observer;

public class Originator {
	   private State state;

	   public void setState(State state){
	      this.state = state;
	   }

	   public State getState(){
	      return state;
	   }

	   public Memento saveStateToMemento(){
	      return new Memento(state);
	   }

	   public void getStateFromMemento(Memento Memento){
	      state = Memento.getState();
	   }
	   
	   public void printState(String s){
		   
		   System.out.printf("[Memento] 	%s State: Staff number is %d\n", s, this.getState().getStf());
		   System.out.printf("[Memento] 	%s State: Staff number is %d\n", s, this.getState().getVis());
		   System.out.printf("[Memento] 	%s State: Staff number is %d\n", s, this.getState().getAnm());
	   }
	}