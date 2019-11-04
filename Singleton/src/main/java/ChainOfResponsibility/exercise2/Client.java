package ChainOfResponsibility.exercise2;

public class Client {
    public static void main(String []args){
        Organizer organizer = new Organizer();
        organizer.criteriaHandler(35);
        organizer.criteriaHandler(100);
        organizer.criteriaHandler(200);
        organizer.criteriaHandler(200);
        organizer.criteriaHandler(200);
        organizer.criteriaHandler(65);
        organizer.criteriaHandler(200);

    }
}
// Se tiene una persona que sacó un préstamo bancario de "X" monto económico,
// cuando comienza a pagar el préstamo y el monto es menor al 25% del monto total
// los pagos los hace al cajero, cuando el monto está entre 25% y 50% el agente de
// crédito recibe los pagos y le ofrece refinanciar su préstamo, cuando ya esta
// sobre 50% pagado el supervisor recibe los pagos y ofrece nuevo préstamos,
// cuando ya se cancela el 100% el encargado de préstamos devuelve
// todos los documentos al cliente.