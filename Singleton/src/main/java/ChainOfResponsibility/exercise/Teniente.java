package ChainOfResponsibility.exercise;

public class Teniente implements IHandler {

	private IHandler next;
	
	@Override
	public void setNext(IHandler handler) {
		next=handler;
	}

	@Override
	public IHandler next() {
		return next;
	}

	@Override
	public void criteriaHandler(Orden orden) {
		if(orden.equals(Orden.DISCIPLINA)) {
			System.out.println("Teniente: A su orden! " + orden);
		} else {
			next.criteriaHandler(orden);
		}
		
	}
}