package PrimerParcial.Abstract;

public class Client {

    public static void main(String []args){

        ElementFactory.make(Elements.TEXTBOX).operation();
        ElementFactory.make(Elements.CHECKBOX).operation();
        ElementFactory.make(Elements.LINK).operation();
        ElementFactory.make(Elements.COMBOBOX).operation();
        ElementFactory.make(Elements.TABLE).operation();

    }
}
