package Memento.exercise2;

public class Tesis {
	private String state;
	private String version;
	private String tutor;
	
	
	public Tesis(String state, String version, String tutor) {
		this.state = state;
		this.version = version;
		this.tutor = tutor;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTutor() {
		return tutor;
	}
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	
	public void show() {
		System.out.println("Current values --> Version: " + version + "\nTutor: " + tutor + "\n");
	}
	
}
