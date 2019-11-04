package Builder;

public class ConcreteProduct extends Builder {

    @Override
    public void buildAtt1(){
        product.setAtt1("Specific Characteristic 1");
    }

    @Override
    public void buildAtt2(){
        product.setAtt2("Specific Characteristic 2");
    }

    @Override
    public void buildAtt3(){
        product.setAtt3("Specific Characteristic 3");
    }

}
