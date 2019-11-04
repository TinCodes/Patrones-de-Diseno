package PrimerParcial.Prototype;

public class ConcretePrototype implements IPrototype {

    private String modelo;
    private String tamano;
    private String peso;
    private Camara camara;
    private String imei;
    private String origen;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void getSpecs(){
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tamaño: " + getTamano());
        System.out.println("Peso: " + getPeso());
        System.out.println("Lente de la Camara: " + getCamara().getLente());
        System.out.println("Foco de la Camara: " + getCamara().getFoco());
        System.out.println("IMEI: " + getImei());
        System.out.println("Origen: " + getOrigen() + "\n");
    }

    public ConcretePrototype(){

    }

    @Override
    public Object clone() {
        ConcretePrototype cloneObj = new ConcretePrototype();
        cloneObj.setModelo(this.modelo);
        cloneObj.setTamano(this.tamano);
        cloneObj.setPeso(this.peso);
        cloneObj.setCamara(this.camara);
        cloneObj.setImei(this.imei);
        cloneObj.setOrigen(this.origen);

        return cloneObj;
    }

}
