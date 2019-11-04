package ChainOfResponsibility.exercise;


public class Client {
	
	public static void main(String[] args) {
		Ejercito organizador = new Ejercito();
		organizador.criteriaHandler(Orden.ENTREVISTA);
		organizador.criteriaHandler(Orden.DISCIPLINA);
		organizador.criteriaHandler(Orden.DESBLOQUEO);
		organizador.criteriaHandler(Orden.LIMPIEZA);
	}
}
