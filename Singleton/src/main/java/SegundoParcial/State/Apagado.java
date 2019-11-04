package SegundoParcial.State;

import java.util.ArrayList;

public class Apagado implements IState {
    public ArrayList<String> openProgs = new ArrayList<>();
    public int ram;
    public int cpu;

    public void handle(){
        cpu = 0;
        ram = 0;
        openProgs.clear();

        System.out.println("Estado de la Computadora: Apagada");
        System.out.println("Programas: ");
        for (String prog: openProgs) {
            System.out.println(prog);
        }
        System.out.println("RAM utilizada " + ram);
        System.out.println("CPU utilizada: " + cpu+ "\n");

    }

}
