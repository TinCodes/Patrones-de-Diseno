package ChainOfResponsibility;

public class Client {
    public static void main(String []args){
        Organizer organizer = new Organizer();
        organizer.criteriaHandler(120);
    }
}
