package Prototype.exercises;

public class Client {
    public static void main(String []args) {
        Contrato a = new Contrato();
        a.setNombre("Roberto");
        a.setApellido("Cuevas");
        a.setSueldo(5000);
        a.setCarga_Horaria(80);
        a.setCurso_Educacion_Superior(true);
        a.setAccesoPlataforma(true);
        a.setMarcadoBiometrico(false);
        a.setMarcado_Hora_de_Entrada("08:00");
        a.setMarcado_hora_de_Salida("18:00");

        Contrato b = (Contrato) a.clone();
        b.setNombre("Martin");
        b.setApellido("Laguna");

        Contrato c = (Contrato) a.clone();
        c.setNombre("Camila");
        c.setApellido("Loayza");

        Contrato d = (Contrato) a.clone();
        d.setNombre("Sara");
        d.setApellido("Uriarte");

        Contrato e = (Contrato) a.clone();
        e.setNombre("Mariana");
        e.setApellido("Carlo");

        Contrato f = (Contrato) a.clone();
        f.setNombre("Emilia");
        f.setApellido("Aguilar");

        Contrato g = (Contrato) a.clone();
        g.setNombre("Mateo");
        g.setApellido("Altamirano");

        Contrato h = (Contrato) a.clone();
        h.setNombre("Cesar");
        h.setApellido("Illanes");

        Contrato i = (Contrato) a.clone();
        h.setNombre("Luciana");
        h.setApellido("Nunez");

        Contrato j = (Contrato) a.clone();
        h.setNombre("Fernanda");
        h.setApellido("Martinez");

        Contrato k = (Contrato) a.clone();
        h.setNombre("Valeria");
        h.setApellido("Cespedes");

        Contrato l = (Contrato) a.clone();
        h.setNombre("Kevin");
        h.setApellido("Cardenas");

        Contrato m = (Contrato) a.clone();
        h.setNombre("Ken");
        h.setApellido("Herbas");

        Contrato n = (Contrato) a.clone();
        h.setNombre("Lizzeth");
        h.setApellido("Vasquez");

        Contrato o = (Contrato) a.clone();
        h.setNombre("Samuel");
        h.setApellido("Huanca");

    }
}
