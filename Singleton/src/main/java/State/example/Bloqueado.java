package State.example;

import java.util.Date;
import java.util.Scanner;

public class Bloqueado implements IState{

    public void handle(){
        System.out.println("Dispositivo bloqueado, ingrese su password:");
        Scanner in = new Scanner(System.in);
        String pwd;
        boolean blocked = false;

        do {
            pwd = in.next();
            if (!blocked){

            } else {
                long seg = new Date().getTime();

            }
        } while (requestPass(pwd));
    }

    public boolean requestPass(String pwd){
        if (pwd.equals("lol")){
            System.out.println("Bienvenido!");
            return true;
        } else {
            System.out.println("Clave incorrecta");
            return false;
        }
    }

}
