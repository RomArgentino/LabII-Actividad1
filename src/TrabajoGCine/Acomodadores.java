package TrabajoGCine;

public class Acomodadores extends Persona {

    private Salas sala;


    public Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }


    public void datosPersona(String nombre, int edad) {

    }


    public void tipoPersona(String tipo) {

    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }


    public String getTipo() {
        return super.getTipo();
    }
}
