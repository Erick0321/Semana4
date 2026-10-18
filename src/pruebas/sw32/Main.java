package pruebas.sw32;

import negocio.Aplicacion;

public class Main {
    public static void main(String[] args) {

        System.out.println("PRUEBA 1");
        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");

        app1.mostrarInformacion();
        System.out.println("Total de aplicaciones: "
                + Aplicacion.getTotalAplicaciones());

        System.out.println("PRUEBA 2");
        Aplicacion app2 = new Aplicacion("Inventario", "2.0");

        app1.iniciar();
        app1.mostrarInformacion();
        app2.mostrarInformacion();

        System.out.println("Total de aplicaciones: "
                + Aplicacion.getTotalAplicaciones());

        System.out.println("PRUEBA 3");
        Aplicacion app3 = new Aplicacion("Reportes", "1.5");

        app2.iniciar();
        app1.cerrar();

        app1.mostrarInformacion();
        app2.mostrarInformacion();
        app3.mostrarInformacion();

        System.out.println("Total de aplicaciones: "
                + Aplicacion.getTotalAplicaciones());
    }
}