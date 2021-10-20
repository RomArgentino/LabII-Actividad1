package TrabajoFacultad;

abstract class Persona {
    private String nombre;
    private String apellido;
    private int Legajo;

    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        Legajo = legajo;
    }

    public Persona() {

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

    public int getLegajo() {
        return Legajo;
    }

    public void setLegajo(int legajo) {
        Legajo = legajo;
    }

    public abstract void modificarDatos(String nombre, String apellido, int legajo);


    public String toString() {
        return   nombre +" - "+
                "Apellido: " + apellido +" - "+
                "Legajo: " + Legajo;
    }
}
