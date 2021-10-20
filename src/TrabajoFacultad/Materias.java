package TrabajoFacultad;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Materias implements Informacion {

    public String nombre;
    public Profesor titular;
    private List<Estudiante> coleccionEstudiante = new ArrayList<Estudiante>();

    public Materias(String nombre, Profesor titular1) {
        this.nombre = nombre;
        this.titular = titular1;
    }

    public void agregarEstudiante(Estudiante newEstudiante){

        coleccionEstudiante.add(newEstudiante);
    }

    public void eliminarEstudiante (Estudiante estudianteEliminado){

        coleccionEstudiante.remove(estudianteEliminado);
    }


    public int verCantidad() {

        return coleccionEstudiante.size();
    }

    public String listarContenidos() {

        return coleccionEstudiante.toString();
    }


   public void modificarEstudiante (Profesor estudianteModificar){

        this.titular = estudianteModificar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public List<Estudiante> getColeccionEstudiante() {
        return coleccionEstudiante;
    }

    public void setColeccionEstudiante(List<Estudiante> coleccionEstudiante) {
        this.coleccionEstudiante = coleccionEstudiante;
    }

    public String toString() {
        return "\n" + nombre +" - "+
                "Titular: " + titular +" - "+
                "\nEstudiantes: " + coleccionEstudiante;
    }

    public void getEstudiantes(){
        for (int i = 0; i< coleccionEstudiante.size(); i++){
            System.out.println(i+": "+coleccionEstudiante.get(i).getNombre());
        }
    }
}
