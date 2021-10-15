package TrabajoGCine;



import java.util.HashSet;
import java.util.Set;


public class Salas {

    private int capacidad;
    private String pelicula;
    private String nombre;
    private Set<Espectadores> espectadores;

    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.espectadores = new HashSet<Espectadores>();
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
