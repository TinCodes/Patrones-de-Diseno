package Command;

public class ConcreteCommand2 implements ICommand {
    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.op2();
    }
}
