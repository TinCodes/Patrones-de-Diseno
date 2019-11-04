package PrimerParcial.Builder;

public class Client {
    public static void main(String []args){
        Director director = new Director();

        Builder bbife = new Bife();
        Builder blomito = new Lomito();
        Builder btira = new Tira();

        director.setBuilder(bbife);
        director.buildProduct();
        Plato bife = director.getProduct();

        director.setBuilder(blomito);
        director.buildProduct();
        Plato lomito = director.getProduct();

        director.setBuilder(btira);
        director.buildProduct();
        Plato tira = director.getProduct();
    }
}
