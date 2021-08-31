package Desafio7;
import java.util.Scanner;

public class FuncionesTrigonometricas {



    //------------ Funciones trigonométricas ------------

    public static void main (String []args){
        double resultado = 0;
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        //Seno

        resultado =Math.sin(anguloEnRadianes);
        System.out.println("Seno de: " + anguloEnGrados + "º = " +resultado);

        //Coseno

        resultado =Math.cos(anguloEnRadianes);
        System.out.println("Coseno de: " + anguloEnGrados + "º = " +resultado);

        //Tangente

        resultado =Math.tan(anguloEnRadianes);
        System.out.println("Tangente de: " + anguloEnGrados + "º = " +resultado);


        //Arco tangente
        double valorIngresado = 0.707;
        double valorIngresado2 = 0.708;

        anguloEnRadianes = Math.atan(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco tangente de: "+ valorIngresado + " = " + anguloEnGrados + "º");

        //Arco tangente2

        anguloEnRadianes = Math.atan2(valorIngresado,valorIngresado2);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco tangente de: "+ valorIngresado + " + "+"Arco tangente de: "+ valorIngresado2 + " = "
                + anguloEnGrados + "º");

        //------------ Funciones exponencial y su inversa ------------

        //Exponente
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número para conocer su exponente: ");
        double numero = sc.nextDouble();
        double result = Math.exp(numero);
        System.out.println("El exponente del número: "+numero+" es: " + result);

        //Log
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Ingrese un número para conocer log: ");
        double numero1 = sc1.nextDouble();
        double result1 = Math.log(numero);
        System.out.println("El log del número: "+numero1+" es: " + result1);

        //------------ Las dos constantes PI y e ------------

        System.out.println("El número PI es: " + Math.PI);
        System.out.println("El número e es: " + Math.E);
        
    }

}
