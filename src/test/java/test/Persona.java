package test;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas;

    static {
        totalPersonas = 0;
        // cedula = 3;
    }

    public Persona(){
        cedula = 0; //!nose si es 3 o 0
        totalPersonas++;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    public Persona(String nombre) {
        cedula = 1; //!nose si es 3 o 0
        this.nombre = "";
        totalPersonas++;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
