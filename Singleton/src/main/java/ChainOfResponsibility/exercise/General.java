package ChainOfResponsibility.exercise;

public class General implements IHandler {

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
		if(orden.equals(Orden.ENTREVISTA)) {
			System.out.println("General: El general realizara la " + orden);
		} else {
			next.criteriaHandler(orden);
		}
		
	}
}