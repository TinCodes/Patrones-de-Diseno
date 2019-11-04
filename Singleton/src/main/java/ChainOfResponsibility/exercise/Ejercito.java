package ChainOfResponsibility.exercise;

public class Ejercito implements IHandler {

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
		
		General general = new General();
		this.setNext(general);
		
		Teniente teniente = new Teniente();
		general.setNext(teniente);
		
		Coronel coronel = new Coronel();
		teniente.setNext(coronel);
		
		Cabo cabo = new Cabo();
		coronel.setNext(cabo);
		
		next.criteriaHandler(orden);
	}
}
