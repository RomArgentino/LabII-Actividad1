package TrabajoFacultad;

class Profesor extends Persona {

    public double basico;
    public int antiguedad;

    public Profesor(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    public double calcularSueldo(double basico, int antiguedad){

        double resultado;
        this.basico = basico;
        this.antiguedad = antiguedad;
        resultado = this.basico+(this.basico*0.1*this.antiguedad);

        return resultado;
    }


    public void modificarDatos(String nombre, String apellido, int legajo) {

    }



}
