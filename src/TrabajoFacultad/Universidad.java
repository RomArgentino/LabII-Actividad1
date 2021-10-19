package TrabajoFacultad;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Universidad {

    private String nombre;
    private List<Carreras> coleccionCarreras = new ArrayList<Carreras>();
    private int nombreCarrera;

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

        for (int i = 0; i< coleccionCarreras.size(); i++){
           if(nombreCarrera.equals(coleccionCarreras.get(i).getNombre().toUpperCase(Locale.ROOT))){
               coleccionCarreras.remove(i);
               System.out.println("Eliminación exitosa");
               break;
           };
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

