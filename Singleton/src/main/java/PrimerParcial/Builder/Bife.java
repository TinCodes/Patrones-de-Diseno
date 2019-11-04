package PrimerParcial.Builder;

public class Bife extends Builder{
    @Override
    public void buildCarne(){
        plato.setTipoCarne("Bife");
    }

    @Override
    public void buildRefresco(){
        plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarnicion(){
        plato.setGuarnicion("Papas Fritas");
    }

}
