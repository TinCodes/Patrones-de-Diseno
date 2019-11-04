package PrimerParcial.Abstract;

public class ElementFactory {
    public static IProduct make(Elements type){
        IProduct product;
        switch (type){
            case TEXTBOX:
                product = new TextBox();
                break;

            case CHECKBOX:
                product = new Checkbox();
                break;

            case LINK:
                product = new Link();
                break;

            case TABLE:
                product = new Table();
                break;

            case COMBOBOX:
                product = new Combobox();
                break;
            default:
                product = new Link();
        }
        return product;
    }
}
