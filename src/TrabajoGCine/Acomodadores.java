package TrabajoGCine;

public class Acomodadores extends Persona {

    private Salas sala;


    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }


    public String getTipo() {
        return super.getTipo();
    }
}
