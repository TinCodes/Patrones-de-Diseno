package PrimerParcial.Prototype;

public class Camara {
    private String foco;
    private String lente;

    public Camara(String foco, String lente){
        this.foco = foco;
        this.lente = lente;
    }

    public String getFoco() {
        return foco;
    }

    public String getLente() {
        return lente;
    }
}
