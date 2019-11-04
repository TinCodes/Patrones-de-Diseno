package PrimerParcial.Builder;

public class Tira extends Builder {

    @Override
    public void buildCarne(){
        plato.setTipoCarne("Tira de Carne");
    }

    @Override
    public void buildRefresco(){
        plato.setSaborRefresco("Coca Cola");
    }

    @Override
    public void buildGuarnicion(){
        plato.setGuarnicion("Fideo");
    }

}
