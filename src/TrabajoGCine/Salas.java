package TrabajoGCine;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

public class Salas {

    private int capacidad;
    private String pelicula;
    private String nombre;
    private List<Espectadores> espectadores = new ArrayList<Espectadores>() {
    };

    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.espectadores = new ArrayList<Espectadores>();
    }

    public void setPelicula(String pelicula) {

        this.pelicula = pelicula;
    }

    public void agregarEspectador(Espectadores newViewer){

        espectadores.add(newViewer);
    }





    public String toString() {
        return "Sala: " + nombre + "\n"+
                "Capacidad: " + capacidad + "\n"+
                "Pelicula: " + pelicula + "\n"+
                "Espectadores: \n" + espectadores;
    }


}
