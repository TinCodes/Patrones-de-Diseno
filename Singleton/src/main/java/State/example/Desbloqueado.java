package State.example;

public class Desbloqueado implements IState{

    public void handle(){
        System.out.println("Dispositivo desbloqueado!");
    }

    public void llamar(String name){
        System.out.println("Llamando a " + name + "...");
    }

    public void jugar(){
        System.out.println("piupiu");
    }

    public void sacarFotos(){
        System.out.println("Click click");
    }

    public boolean bloquear(){
        return false;
    }

}
