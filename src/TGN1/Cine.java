package TGN1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {

        int cont = 1;
        int salaUno = 0;
        int edad = 0;
        String fila;
        int silla;
        String opcion = "";

        Scanner nombre = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);


        Salas sala1 = new Salas(3, "01");
        Acomodadores acomodador = new Acomodadores("Juan", 32, " Acomodador", 50000);
        Empleados empleado = new Empleados("Stella", 22, " Empleado", 40000);

        System.out.println("\n\t\t\t*** Bienvenido al cine Syntax ***\n");


        do {
            Espectadores espectador = new Espectadores();
            System.out.println("¿Desea agregar espectadores?");
            System.out.println("1- Si\n0- No");
            opcion = nombre.nextLine();

            while (!Utils.isNumeric(opcion)) {
                System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
                opcion = nombre.nextLine();
            }

            while (!(opcion.equals("0") || opcion.equals("1"))) {
                System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
                opcion = nombre.nextLine();

            }

            if (opcion.equals("0")) {
                System.out.println("SALA SIN ESPECTADORES CARGADOS.");
                break;
            }


            System.out.println("Ingrese el nombre del espectador Nº: " + cont);
            espectador.setNombre(controlPalabras(nombre.nextLine()));

            System.out.println("Edad del espectador: ");

               if (controlBooleano()) {
                   espectador.setEdad(numero.nextInt());
               } else {
                   System.out.println("ERROR EN EL INGRESO DE DATOS. ¡Ingrese número!");
                   espectador.setEdad(numero.nextInt());
               }

            System.out.println("Fila: ");
            espectador.setFila(controlPalabras(nombre.nextLine()));

            System.out.println("Silla: ");

            if (controlBooleano()) {
                espectador.setSilla(numero.nextInt());
            } else {
                System.out.println("ERROR EN EL INGRESO DE DATOS. ¡Ingrese número!");
                espectador.setSilla(numero.nextInt());
            }

            sala1.agregarEspectador(espectador);

            System.out.println("Continuar agregando: 1 - Finalizar: 0");
            opcion = nombre.nextLine();

            while (!Utils.isNumeric(opcion)) {
                System.out.println("ERROR EN EL INGRESO DE DATOS. Ingresar sólo números. \nContinuar agregando: 1 - Finalizar: 0");
                opcion = nombre.nextLine();
            }

            while (!(opcion.equals("0") || opcion.equals("1"))) {
                System.out.println("ERROR EN EL INGRESO DE DATOS. \nContinuar agregando: 1 - Finalizar: 0");
                opcion = nombre.nextLine();


            }

            cont++;
            salaUno++;

            if (salaUno >= 3) {
                System.out.println("ERROR EN EL INGRESO DE DATOS. \nHa sobre pasado el límite de espectadores. \nLos datos obtenidos son: ");
                break;
            }
        } while (!opcion.equals("0"));

        sala1.setPelicula("Joker");
        acomodador.setSala(sala1);
        System.out.println(sala1.toString());

        System.out.println("Personal: ");
        System.out.println(empleado.toString());
        System.out.println(acomodador.toString());


//---------------------Modificar la sala del acomodador-------------------
        System.out.println("¿Desea modificar la sala del acomodador?");
        System.out.println("1- Si\n0- No");
        opcion = nombre.nextLine();

        while (!Utils.isNumeric(opcion)) {
            System.out.println("ERROR EN EL INGRESO DE DATOS. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
            opcion = nombre.nextLine();
        }

        while (!(opcion.equals("0") || opcion.equals("1"))) {
            System.out.println("ERROR EN EL INGRESO DE DATOS. Continuar agregando: 1 - Finalizar: 0");
            opcion = nombre.nextLine();
        }

        if (opcion.equals("0")) {
            System.out.println("No se modificaron datos");

        } else {
            System.out.println("Ingrese la sala acomodador: ");
            sala1.setNombre(nombre.nextLine());
            acomodador.setSala(sala1);
            System.out.println("Ha modificado la sala del acomodador, quedando de la siguiente forma: ");
            System.out.println(acomodador.toString());

        }

//---------------------Modificar el sueldo del acomodador-------------------
        System.out.println("¿Desea modificar el sueldo del acomodador?");
        System.out.println("1- Si\n0- No");
        opcion = nombre.nextLine();

        while (!Utils.isNumeric(opcion)) {
            System.out.println("ERROR EN EL INGRESO DE DATOS. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
            opcion = nombre.nextLine();
        }

        while (!(opcion.equals("0") || opcion.equals("1"))) {
            System.out.println("ERROR EN EL INGRESO DE DATOS. Continuar agregando: 1 - Finalizar: 0");
            opcion = nombre.nextLine();
        }

        if (opcion.equals("0")) {
            System.out.println("No se modificaron datos");
            System.out.println("Gracias por elegirnos.");

        } else {
            System.out.println("Ingrese el nuevo sueldo acomodador: ");
            double cheque = numero.nextInt();
            acomodador.setSueldo(cheque);
            System.out.println("Ha modificado el sueldo del acomodador, quedando de la siguiente forma: ");
            System.out.println(acomodador.toString());
            System.out.println("Gracias por elegirnos.");

        }

    }

//------------------------FUNCIONES------------------------

    public static String controlPalabras(String palabra) {

        Scanner letras = new Scanner(System.in);

        String palabras = "";

        while (Utils.isNumeric(palabra)) {
            System.out.println("ERROR EN EL INGRESO DE DATOS. Ingrese caracteres o palabras.");
            palabra = letras.nextLine();
        }
        palabras = palabra;

        return palabras;
    }

    public static boolean controlBooleano() {
        Scanner scan = new Scanner(System.in);
        int edades;
        try {
         edades = scan.nextInt();
           return true;
        } catch (InputMismatchException e) {
            return false;
        }
    }


}


