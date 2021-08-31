package Desafio8;
import java.util.Scanner;


public class RaizScanner {

    public static void main (String[]args){

        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un número entero para conocer su raíz y presione 'Enter': ");
        double number = numero.nextDouble();
        double raiz =  Math.sqrt(number);
        System.out.println("La raíz de: " + (int)number + " es: " +raiz);



    }
}
