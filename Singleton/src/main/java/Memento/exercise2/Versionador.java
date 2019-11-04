package Memento.exercise2;

import java.util.HashMap;
import java.util.Map;

public class Versionador {
	private Map<Integer, Memento> savedBackup = new HashMap<Integer, Memento>();
	
	public void addMementoMap(int key, Memento memento) {
		savedBackup.put(key, memento);
	}

	public Memento getMementoMap(int key) {
		return savedBackup.get(key);
	}

}
