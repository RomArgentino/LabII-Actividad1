package TrabajoFacultad;

import java.util.HashSet;
import java.util.Set;

class Materias implements Informacion {

    public String nombre;
    public Profesor titular;
    private Set<Estudiante> coleccionEstudiante;

    public Materias(String nombre, Profesor titular) {
        this.nombre = nombre;
        this.titular = titular;
       this.coleccionEstudiante = new HashSet<Estudiante>();

    }

    public void agregarEstudiante(Estudiante estudianteNew){
        coleccionEstudiante.add(estudianteNew);
    }

    public void eliminarEstudiante (Estudiante estudianteEliminado){

        coleccionEstudiante.remove(estudianteEliminado);
    }

    @Override
    public int verCantidad() {

        return coleccionEstudiante.size();
    }

    @Override
    public String listarContenidos() {
        return coleccionEstudiante.toString();
    }


   /*public void modificarEstudiante (Profesor estudianteModificar){

        this.titular = Profesor;
    }

*/
}
