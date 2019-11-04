package SegundoParcial.State;

import java.util.ArrayList;

public class Prendido implements IState {
    public ArrayList<String> openProgs = new ArrayList<>();
    public int ram;
    public int cpu;

    public void handle(){
        for (int i = 1; i <= (int)(1 + (10 - 1) * Math.random()); i++) {
            openProgs.add("Programa " + i);
            ram += 5;
            cpu += 5;
        }

        System.out.println("Estado de la Computadora: Prendida");
        System.out.println("Programas: ");
        for (String prog: openProgs) {
            System.out.println(prog);
        }
        System.out.println("RAM utilizada " + ram);
        System.out.println("CPU utilizada: " + cpu + "\n");

    }

}
