package Builder;

public abstract class Builder {
    protected Product product;
    // podria ser private tambien


    public Product getProduct() {
        return product;
    }

    public void create(){
        product = new Product();
    }

    public abstract void buildAtt1();
    public abstract void buildAtt2();
    public abstract void buildAtt3();
}
