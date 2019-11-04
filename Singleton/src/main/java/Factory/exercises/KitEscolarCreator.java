package Factory.exercises;

public class KitEscolarCreator extends Creator {

    @Override
    public Kit_Escolar fabricar(){
        Kit_Escolar kit_escolar = new Kit_Escolar();
        Mochila mochila = new Mochila();
        Deportivo deportivo = new Deportivo();
        Cuadernos cuadernos = new Cuadernos();
        kit_escolar.setMochila(mochila);
        kit_escolar.setDeportivo(deportivo);
        kit_escolar.setCuadernos(cuadernos);
        return kit_escolar;
    }

}
