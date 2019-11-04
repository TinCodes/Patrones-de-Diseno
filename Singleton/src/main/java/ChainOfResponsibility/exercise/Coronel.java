package ChainOfResponsibility.exercise;

public class Coronel implements IHandler {

	private IHandler next; //atributo next
	
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
		if(orden.equals(Orden.DESBLOQUEO)) {
			System.out.println("Coronel: A su orden! " + orden);
		} else {
			next.criteriaHandler(orden);
		}
		
	}
}
