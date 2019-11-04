package PrimerParcial.Builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Plato getProduct(){

        return builder.getProduct();
    }

    public void buildProduct(){
        builder.create();
        builder.buildCarne();
        builder.buildRefresco();
        builder.buildGuarnicion();
    }
}
