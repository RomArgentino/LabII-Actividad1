package TrabajoGCine;

abstract class Persona {

    private String nombre;
    private int edad;
    private String tipo;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipo(){
        return tipo;

    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' +
                "Edad: " + edad +'\n' +
                "Tipo: " + tipo + '\n';
    }
}
