package TrabajoGCine;

public class Empleados extends Persona {

    private double sueldo;


    public Empleados(String nombre, int edad) {
        super(nombre, edad);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    public String toString() {
        return "Empleado: " + "\n" +
                "Sueldo: " + sueldo;
    }

    //---ver---
    public String getTipo() {
        return super.getTipo();
    }
}
