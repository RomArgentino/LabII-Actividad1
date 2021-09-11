package desafio10;
import java.util.Scanner;

/*En este desafío se trata de crear un programa en JAVA que haga que el usuario deba de adivinar en el menor
número de intentos posibles un número entero aleatorio entre 1 y 100 generado por el programa.

Al ejecutar el programa, este generará un número aleatorio entre 1 y 100 que el usuario no sabrá.

A continuación, el programa pedirá la introducción de un número entero entre 1 y 100 por consola.

Si el número introducido por el usuario es mayor que el número aleatorio generado por el programa, saldrá un mensaje por consola indicando que el número es menor.

Si el número introducido por el usuario es menor que el número aleatorio generado por el programa, saldrá un mensaje por consola indicando que el número es mayor.

El proceso se repetirá indefinidamente hasta que averigüemos cuál es el número generado aleatoriamente por el programa.

Una vez acertado, debe imprimir en consola un mensaje de “Correcto!”.

El programa debe de indicar el nº de intentos consumidos para acertar con el número aleatorio y luego de que el usuario ingrese el número se debe mostrar el número generado. */



public class adivinarNumero {

    public static void main (String [] args){


        Scanner numero = new Scanner (System.in);

        /*Algoritmo para generar número aleatorio*/
        int ran = (int)(Math. random()*100+1);

        System.out.print("Ingrese un número entre 1 - 100:");
        int ingreso = numero.nextInt();

        while(ingreso > 101) {
            System.out.print("Error. Ingrese un número entre 1 - 100:");
            ingreso = numero.nextInt();
        }


        while(ingreso != 0 && ingreso<101){

            if (ingreso < ran){
                System.out.print("El número debe ser mayor");
                System.out.print("Ingrese un número entre 1 - 100:");
                ingreso = numero.nextInt();
            }
            else if(ingreso > ran){
                System.out.print("El número debe ser menor");
                System.out.print("Ingrese un número entre 1 - 100:");
                ingreso = numero.nextInt();
            }
            else {
                System.out.print("¡Acertaste!");
                System.out.print("Presione 0 para salir");
                ingreso = numero.nextInt();
            }

        }

    }

}
