package SegundoParcial.Command;

public class Receiver {

    public void op(Commands com) {
        switch (com){
            case ATACAR:
                System.out.println("[USER: ATAQUE]");
                break;

            case DEFENSA:
                System.out.println("[USER: MODO DE DEFENSA]");
                break;

            case DISPARAR:
                System.out.println("[USER: DISPARO]");
                break;

            default:
                break;
        }
    }

}
