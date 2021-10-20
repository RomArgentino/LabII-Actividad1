package TrabajoFacultad;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Universidad {

    private String nombre;
    private List<Carreras> coleccionCarreras = new ArrayList<Carreras>();
    private int nombreCarrera;
    private List<Estudiante> coleccionEstudiante = new ArrayList<Estudiante>();

    //-------------------------------------------------------------------
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


    public List<Estudiante> getColeccionEstudiante() {
        return coleccionEstudiante;
    }

    public void setColeccionEstudiante(List<Estudiante> coleccionEstudiante) {
        this.coleccionEstudiante = coleccionEstudiante;
    }


    public void getEstudiantes(){
        for (int i = 0; i< coleccionEstudiante.size(); i++){
            System.out.println(i+": "+coleccionEstudiante.get(i).getApellido()+" "+coleccionEstudiante.get(i).getNombre());
        }
    }

    public Estudiante getEstudiante(int i){
        return coleccionEstudiante.get(i);

    }
//---------------------------------------------------------------------------------------
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.coleccionCarreras = new ArrayList<Carreras>();
    }

    public void agregarCarrera(Carreras carreras){
        coleccionCarreras.add(carreras);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Carreras> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public void setColeccionCarreras(List<Carreras> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    public void eliminarCarrera(String nombreCarrera){
        boolean existe = false;
        int indice=0;
        for (int i = 0; i< coleccionCarreras.size(); i++){
           if(nombreCarrera.equals(coleccionCarreras.get(i).getNombre().toUpperCase(Locale.ROOT))){
               existe = true;
               indice = i;
               break;
           }else{
               existe = false;
           }
        }

        if(existe){
            coleccionCarreras.remove(indice);
            System.out.println("¡Eliminación exitosa!");
            getCarrerillas();
        }else{
            System.out.println("Carrera no encontrada.");
        }
    }

    public boolean encontrarCarrera(String nombreCarrera){

        return false;
    }


    public String toString() {
        return "Universidad: " + nombre +
                "\nCarreras: " + coleccionCarreras;
    }

    public void getCarrerillas(){
        for (int i = 0; i< coleccionCarreras.size(); i++){
            System.out.println(i+": "+coleccionCarreras.get(i).getNombre());
        }
    }


}

