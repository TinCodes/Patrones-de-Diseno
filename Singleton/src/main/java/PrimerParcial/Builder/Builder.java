package PrimerParcial.Builder;

public abstract class Builder {
    protected Plato plato;

    public Plato getProduct() {
        System.out.println("Su pedido:\n" +
                "Carne: " + plato.getTipoCarne()+ "\n" +
                "Refresco: " +  plato.getSaborRefresco() + "\n" +
                "Gaurnicion: " + plato.getGuarnicion() + "\n\n");
        return plato;
    }

    public void create(){
        plato = new Plato();
    }

    public abstract void buildCarne();
    public abstract void buildRefresco();
    public abstract void buildGuarnicion();
}
