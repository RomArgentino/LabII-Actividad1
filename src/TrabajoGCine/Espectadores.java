package TrabajoGCine;

public class Espectadores extends Persona {

    private int fila;
    private int silla;


    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public Espectadores(String nombre, int edad, int fila, int silla) {
        super(nombre, edad);
        this.silla = silla;
        this.fila = fila;
    }

    public Espectadores (){
        super();

    }
    //---ver---
    public String getButaca() {
        return null;

    }


    public String toString() {
        return getNombre()+
                ", edad: " + getEdad()+
                ", fila: " + this.fila +
                ", silla: " + this.silla+"\n";
    }

}
