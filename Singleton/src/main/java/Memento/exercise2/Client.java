package Memento.exercise2;

public class Client {
	public static void main(String[] args) {
		Versionador caretaker = new Versionador();
		Originator originator = new Originator();
		Tesis tesis;

		tesis = new Tesis("State 1", "Borrador 1", "Cuate");
		originator.setMemento(tesis);
		caretaker.addMementoMap(0, originator.createMemento());
		
		tesis = new Tesis("State 2", "Borrador 2", "Cuate");
		originator.setMemento(tesis);
		caretaker.addMementoMap(1, originator.createMemento());

		tesis = new Tesis("State 3", "Limpio", "Cuate");
		originator.setMemento(tesis);
		caretaker.addMementoMap(2, originator.createMemento());

		tesis = new Tesis("State 4", "Oficial", "Cuate");
		originator.setMemento(tesis);
		caretaker.addMementoMap(3, originator.createMemento());
		
		tesis = new Tesis("State 5", "Final", "Cuate");
		originator.setMemento(tesis);
		caretaker.addMementoMap(4, originator.createMemento());
		
		originator.restoreFromMemento(caretaker.getMementoMap(2));

	}
}
