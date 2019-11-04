package Factory.exercises;

public class Client {
    public  static void main(String []args){
        Kit_Escolar kitE = new KitEscolarCreator().fabricar();
        Kit_Colegial kitC = new KitColegialCreator().fabricar();
    }
}
