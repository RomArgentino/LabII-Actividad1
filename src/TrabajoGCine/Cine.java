package TrabajoGCine;

import java.util.List;
import java.util.Scanner;

public class Cine {

    public static void main (String [] args){

        int cont = 1;
        int salaUno = 0;
        int edad, fila, silla;
        String opcion = "";

        Scanner nombre = new Scanner (System.in);
        Scanner numero = new Scanner (System.in);

        Salas sala1 = new Salas(3,"1");

       do {
           Espectadores espectador = new Espectadores();
           System.out.println("Ingrese el nombre del espectador Nº: " + cont);
           espectador.setNombre(nombre.nextLine());
           System.out.println("Edad del espectador: ");
           edad = numero.nextInt();
           espectador.setEdad(edad);
           System.out.println("Fila: ");
           fila = numero.nextInt();
           espectador.setFila(fila);
           System.out.println("Silla: ");
           silla = numero.nextInt();
           espectador.setSilla(silla);
           sala1.agregarEspectador(espectador);


           System.out.println("Continuar agregando: 1 - Finalizar: 0");
           opcion = nombre.nextLine();

           while(!Utils.isNumeric(opcion)){
               System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
               opcion = nombre.nextLine();
           }

               while (!(opcion.equals("0")|| opcion.equals("1"))) {
                   System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
                   opcion = nombre.nextLine();
                   System.out.println("Error. Ingrese sólo 0 o 1.");

               }

               cont++;
               salaUno++;

               if (salaUno >= 3) {
                   System.out.println("Error. Ha sobre pasado el límite de espectadores. Los datos obtenidos son: ");
                   break;
               }
           }
           while (!opcion.equals("0")) ;

           System.out.println(sala1.toString());
       }
}
