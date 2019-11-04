package Factory.exercises;

public class Kit_Escolar implements IKit{
    Mochila mochila;
    Deportivo deportivo;
    Cuadernos cuadernos;

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Deportivo getDeportivo() {
        return deportivo;
    }

    public void setDeportivo(Deportivo deportivo) {
        this.deportivo = deportivo;
    }

    public Cuadernos getCuadernos() {
        return cuadernos;
    }

    public void setCuadernos(Cuadernos cuadernos) {
        this.cuadernos = cuadernos;
    }

    @Override
    public void create(){

    }
}
