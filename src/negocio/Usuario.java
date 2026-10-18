package negocio;

public class Usuario {
    private int id;
    private String username;
    private String correo;
    private boolean activo;

    private static int contadorUsuarios = 0;

    public Usuario(String username, String correo) {
        contadorUsuarios++;
        this.id = contadorUsuarios;
        this.username = username;
        this.correo = correo;
        this.activo = true;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean getActivo() {
        return activo;
    }

    public static int getTotalUsuarios() {
        return contadorUsuarios;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + getId());
        System.out.println("Usuario: " + getUsername());
        System.out.println("Correo: " + getCorreo());
        System.out.println("Activo: " + getActivo());
    }
}
