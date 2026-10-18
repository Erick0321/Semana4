package pruebas.sw31;

import negocio.Usuario;

public class Main {
    public static void main(String[] args) {

        System.out.println("PRUEBA 1");
        Usuario usuario1 = new Usuario(
                "jperez", "jperez@correo.com");

        usuario1.mostrarInformacion();
        System.out.println("Total de usuarios: "
                + Usuario.getTotalUsuarios());

        System.out.println("PRUEBA 2");
        Usuario usuario2 = new Usuario(
                "mlopez", "mlopez@correo.com");

        usuario2.mostrarInformacion();
        System.out.println("Total de usuarios: "
                + Usuario.getTotalUsuarios());

        System.out.println("PRUEBA 3");
        Usuario usuario3 = new Usuario(
                "cgarcia", "cgarcia@correo.com");

        Usuario usuario4 = new Usuario(
                "aramos", "aramos@correo.com");

        usuario3.mostrarInformacion();
        usuario4.mostrarInformacion();

        System.out.println("Total de usuarios: "
                + Usuario.getTotalUsuarios());
    }
}
