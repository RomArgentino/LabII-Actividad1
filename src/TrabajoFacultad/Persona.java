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



    public abstract void modificarDatos(String nombre, String apellido, int legajo);

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Legajo: " + Legajo;
    }
}
