package SegundoParcial.State;

import java.util.ArrayList;

public class Reiniciar implements IState {
    public ArrayList<String> openProgs;
    public int ram = 0;
    public int cpu = 0;

    public void handle(){
        System.out.println("Estado de la Computadora: Reiniciando");
        System.out.println("Cerrando programas...");
        System.out.println("RAM utilizada " + ram);
        System.out.println("CPU utilizada: " + cpu+ "\n");
    }

}
