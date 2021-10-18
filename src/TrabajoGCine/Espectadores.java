package TrabajoGCine;

public class Espectadores extends Persona {

    private String fila;
    private int silla;


    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public Espectadores(String nombre, int edad, String tipo) {
        super(nombre, edad, tipo);
    }

    public Espectadores (){
        super();

    }
    public void datosPersona(String nombre, int edad) {

    }
    public void tipoPersona(String tipo) {

    }
    //---ver---


    public void getButaca() {

    }


    public String toString() {
        return getNombre()+
                ", edad: " + getEdad()+
                ", fila: " + this.fila +
                ", silla: " + this.silla+"\n";
    }

}
