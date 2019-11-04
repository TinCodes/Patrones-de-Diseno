package AbstractFactory.example.AbstractMethod;

public class FactoryProduct {
        //Interface way
//    public static IBrowser make(Browsers type){

        //Abstract Class way
     public static Browser make(Browsers type){
         //Interface way
//        IBrowser br;

         //Abstract Class way
         Browser br;
        switch (type){
            case IE:
                br = new IE();
                break;

            case CHROME:
                br = new Chrome();
                break;

            case FIREFOX:
                br = new Firefox();
                break;

            default:
                br = new Chrome();
                break;

        }

        return br;
    }
}
