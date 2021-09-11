package desafio9;
import java.util.Scanner;

public class MasaCorporal {
    public static void main (String[] args){

        Scanner alturas = new Scanner (System.in);
        Scanner generos = new Scanner (System.in);
        System.out.println("Ingrese su altura en cm: ");
        int altura = alturas.nextInt();
        System.out.println("Ingrese su género = H - hombre; M - mujer");
        String genero = generos.nextLine();

        if (genero.toLowerCase().equals("h")){

            System.out.println("Su peso ideal sería: " + (altura-110));
        }

        else if(genero.toLowerCase().equals("m")){

            System.out.println("Su peso ideal sería: " + (altura-120));
        }

    }
}
