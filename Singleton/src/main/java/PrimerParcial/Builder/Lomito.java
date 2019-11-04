package PrimerParcial.Builder;

public class Lomito extends Builder {

    @Override
    public void buildCarne(){
        plato.setTipoCarne("Lomo");
    }

    @Override
    public void buildRefresco(){
        plato.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarnicion(){
        plato.setGuarnicion("Arroz");
    }

}
