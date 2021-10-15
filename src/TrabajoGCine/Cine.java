package TrabajoGCine;

import java.util.List;
import java.util.Scanner;

public class Cine {

    public static void main (String [] args){

        int cont = 1;
        int salaUno = 0;
        String nombres;
        int edad, fila, silla, opcion=1;

        Scanner nombre = new Scanner (System.in);
        Scanner numero = new Scanner (System.in);

        Salas sala1 = new Salas(3,"1");
        Espectadores espectador = new Espectadores();


        while (opcion != 0){
            System.out.println("Ingrese el nombre del espectador Nº: " + cont);
            nombres = nombre.nextLine();
            espectador.setNombre(nombres);
            System.out.println("Edad del espectador: ");
            edad = numero.nextInt();
            espectador.setNombre(edad);
            System.out.println("Fila: ");
            fila = numero.nextInt();
            System.out.println("Silla: ");
            silla = numero.nextInt();
            cont++;


            System.out.println("Continuar agregando: 1 - Finalizar: 0");
            opcion = numero.nextInt();

            salaUno++;
            if (salaUno >=3){
                System.out.println("Error. Ha sobre pasado el límite de espectadores.");
               break;
            };


        }
        System.out.println(sala1.toString());






        /* Espectadores espectador1 = new Espectadores("Paco",25,"5",22);
        Espectadores espectador2 = new Espectadores("Damy",28,"5",23);



        sala1.setPelicula("Venom 2");
        sala1.agregarEspectador(espectador1);
        sala1.agregarEspectador(espectador2);

        System.out.println();

        System.out.println(sala1.toString());*/

    }


}
