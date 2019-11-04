package Memento.exercise2;


public class Memento {
	private Tesis state;

	public Memento(Tesis stateToSave) {
		state = stateToSave;
	}

	public Tesis getSavedState() {
		return state;
	}
}
