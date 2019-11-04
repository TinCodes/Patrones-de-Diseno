package Memento.exercise2;

public class Originator {
	private Tesis state;
	public void setMemento(Tesis state) {
		this.state = state;
	
	}

	public Memento createMemento() {
		System.out.println("Originator: Creating memento...");
		state.show();
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento m) {
		state = m.getSavedState();
		System.out.println("Originator: State after restoring from Memento: " + state.getState());
		state.show();
	}
}
