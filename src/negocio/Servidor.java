package negocio;

public class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean getActivo() {
        return activo;
    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }

    public void activar() {
        if (!activo) {
            activo = true;
            servidoresActivos++;
            System.out.println("Servidor activado: " + nombre);
        } else {
            System.out.println("El servidor ya esta activo");
        }
    }

    public void desactivar() {
        if (activo) {
            activo = false;
            servidoresActivos--;
            System.out.println("Servidor desactivado: " + nombre);
        } else {
            System.out.println("El servidor ya esta apagado");
        }
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Direccion IP: " + getDireccionIP());
        System.out.println("Activo: " + getActivo());
    }
}
