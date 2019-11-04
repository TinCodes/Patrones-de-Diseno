package ChainOfResponsibility.exercise;

public class Cabo implements IHandler {

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
		if(orden.equals(Orden.LIMPIEZA)) {
			System.out.println("Cabo: A su orden! " + orden);
		} else {
			System.out.println("No existe puesto para esta orden...");
		}
		
	}
}