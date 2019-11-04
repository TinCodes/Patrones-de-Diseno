package Mediator;

public class ConcreteMediator implements IMediator {
    private ConcreteColleague1 user1;
    private ConcreteColleague2 user2;

    public void setColleague1(ConcreteColleague1 colleague1){
        user1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2){
        user2 = colleague2;
    }

    @Override
    public void send(String msj, Colleague colleague){
        if (colleague == user1){
            user2.messageReceived(msj);
        } else {
            user1.messageReceived(msj);
        }

    }

}
