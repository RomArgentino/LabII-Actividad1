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


    public String toString() {
        return   nombre +" - "+
                "Apellido: " + apellido +" - "+
                "Legajo: " + Legajo;
    }
}
