package Factory;

public class ConcreteProduct2 implements IProduct{
    Base3 base3;
    Base4 base4;

    public Base3 getBase3() {
        return base3;
    }

    public void setBase3(Base3 base3) {
        this.base3 = base3;
    }

    public Base4 getBase4() {
        return base4;
    }

    public void setBase4(Base4 base4) {
        this.base4 = base4;
    }

    public ConcreteProduct2(){}

    @Override
    public void create(){

    }
}
