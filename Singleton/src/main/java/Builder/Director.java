package Builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product getProduct(){
        return builder.getProduct();
    }

    public void buildProduct(){
        builder.create();
        builder.buildAtt1();
        builder.buildAtt2();
        builder.buildAtt3();
    }
}
