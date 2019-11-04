package Prototype.exercises;

public class Contrato implements IPrototype{
    private int sueldo;
    private int carga_Horaria;
    private boolean curso_Educacion_Superior;
    private boolean accesoPlataforma;
    private boolean marcadoBiometrico;
    private String marcado_Hora_de_Entrada;
    private String marcado_hora_de_Salida;
    private String nombre;
    private String apellido;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCarga_Horaria() {
        return carga_Horaria;
    }

    public void setCarga_Horaria(int carga_Horaria) {
        this.carga_Horaria = carga_Horaria;
    }

    public boolean isCurso_Educacion_Superior() {
        return curso_Educacion_Superior;
    }

    public void setCurso_Educacion_Superior(boolean curso_Educacion_Superior) {
        this.curso_Educacion_Superior = curso_Educacion_Superior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getMarcado_Hora_de_Entrada() {
        return marcado_Hora_de_Entrada;
    }

    public void setMarcado_Hora_de_Entrada(String marcado_Hora_de_Entrada) {
        this.marcado_Hora_de_Entrada = marcado_Hora_de_Entrada;
    }

    public String getMarcado_hora_de_Salida() {
        return marcado_hora_de_Salida;
    }

    public void setMarcado_hora_de_Salida(String marcado_hora_de_Salida) {
        this.marcado_hora_de_Salida = marcado_hora_de_Salida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public Object clone() {
        Contrato contrato = new Contrato();
        contrato.setNombre(this.nombre);
        contrato.setApellido(this.apellido);
        contrato.setCarga_Horaria(this.carga_Horaria);
        contrato.setAccesoPlataforma(this.accesoPlataforma);
        contrato.setMarcadoBiometrico(this.marcadoBiometrico);
        contrato.setMarcado_Hora_de_Entrada(this.marcado_Hora_de_Entrada);
        contrato.setMarcado_hora_de_Salida(this.marcado_hora_de_Salida);
        contrato.setCurso_Educacion_Superior(this.curso_Educacion_Superior);
        contrato.setSueldo(this.sueldo);
        return contrato;
    }
}
