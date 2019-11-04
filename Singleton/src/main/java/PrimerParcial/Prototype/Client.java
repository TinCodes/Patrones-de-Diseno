package PrimerParcial.Prototype;

public class Client {
    public static void main(String []args) {
        ConcretePrototype cel1 = new ConcretePrototype();
        cel1.setModelo("A1");
        cel1.setTamano("60");
        cel1.setCamara(new Camara("10", "5mp"));
        cel1.setImei("10001");
        cel1.setOrigen("Bolivia");
        ConcretePrototype cel2 = (ConcretePrototype) cel1.clone();
        ConcretePrototype cel3 = (ConcretePrototype) cel1.clone();

        cel2.setImei("10002");
        cel3.setImei("10003");

        cel1.getSpecs();
        cel2.getSpecs();
        cel3.getSpecs();
    }
}
