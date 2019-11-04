package ChainOfResponsibility.exercise;

public interface IHandler {
	public void setNext(IHandler handler);
	public IHandler next();
	public void criteriaHandler(Orden criteria);

}
