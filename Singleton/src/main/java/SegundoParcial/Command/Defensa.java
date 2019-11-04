package SegundoParcial.Command;

public class Defensa implements ICommand {
    private Receiver receiver;

    public Defensa(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.op(Commands.DEFENSA);
    }
}
