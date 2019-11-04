package Factory.exercises;

public class KitColegialCreator extends Creator {

    @Override
    public Kit_Colegial fabricar(){
        Kit_Colegial kit_colegial = new Kit_Colegial();
        Mochila mochila = new Mochila();
        Libros libros = new Libros();
        Computadora computadora = new Computadora();
        kit_colegial.setMochila(mochila);
        kit_colegial.setLibros(libros);
        kit_colegial.setComputadora(computadora);
        return kit_colegial;
    }

}
