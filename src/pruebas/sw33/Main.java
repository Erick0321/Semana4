package pruebas.sw33;

import negocio.Servidor;

public class Main {
    public static void main(String[] args) {

        System.out.println("PRUEBA 1");
        Servidor servidor1 = new Servidor(
                "ServidorWeb", "192.168.1.20");

        servidor1.mostrarInformacion();

        System.out.println("Total de servidores: "
                + Servidor.getTotalServidores());
        System.out.println("Servidores activos: "
                + Servidor.getServidoresActivos());

        System.out.println("PRUEBA 2");
        Servidor servidor2 = new Servidor(
                "ServidorBD", "192.168.1.30");

        servidor1.activar();
        servidor1.activar();
        servidor2.activar();

        servidor1.mostrarInformacion();
        servidor2.mostrarInformacion();

        System.out.println("Total de servidores: "
                + Servidor.getTotalServidores());
        System.out.println("Servidores activos: "
                + Servidor.getServidoresActivos());

        System.out.println("PRUEBA 3");
        servidor1.desactivar();
        servidor1.desactivar();

        servidor1.mostrarInformacion();
        servidor2.mostrarInformacion();

        System.out.println("Total de servidores: "
                + Servidor.getTotalServidores());
        System.out.println("Servidores activos: "
                + Servidor.getServidoresActivos());
    }
}
