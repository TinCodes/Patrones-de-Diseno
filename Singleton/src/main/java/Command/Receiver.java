package Command;

public class Receiver {
    private String att1 =  "default";
    private int att2 = 100;

    public void op1() {
        System.out.println("[COMMAND ---> Operation 1] " + att1 + " " + att2);
    }

    public void op2() {
        System.out.println("[COMMAND ---> Operation 2] " + att1 + " " + att2);
    }
}
