package SegundoParcial.Strategy;

public class Client {
    public static void main(String []args){
        Context context = new Context(1000);
        context.setEstacion(Estaciones.INVIERNO);
        context.setEstacion(Estaciones.PRIMAVERA);
        context.setEstacion(Estaciones.VERANO);
        context.setEstacion(Estaciones.OTONO);
    }
}
