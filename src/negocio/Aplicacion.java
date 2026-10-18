package negocio;

public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;

    private static int totalAplicaciones = 0;

    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public boolean getEjecutando() {
        return ejecutando;
    }

    public void iniciar() {
        ejecutando = true;
    }

    public void cerrar() {
        ejecutando = false;
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Version: " + getVersion());
        System.out.println("Ejecutando: " + getEjecutando());
    }
}
