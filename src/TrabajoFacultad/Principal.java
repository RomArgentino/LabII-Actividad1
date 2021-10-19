package TrabajoFacultad;
import TrabajoGCine.Utils;

import java.util.Locale;
import java.util.Scanner;

class Principal {
    public static void main(String[] args) {

        String opcion = "";
        String deleteCarrera = "";


        Scanner num = new Scanner(System.in);
        Scanner letra = new Scanner(System.in);
        Universidad universidad1 = new Universidad("UTN");


        Carreras carrera1 = new Carreras("TUP");
        Carreras carrera2 = new Carreras("IQ");
        Carreras carrera3 = new Carreras("ISI");

        Estudiante estudiante1 = new Estudiante("Federico", "Alvarez", 12658);
        Estudiante estudiante2 = new Estudiante("Lilián", "Almirón", 12659);
        Estudiante estudiante3 = new Estudiante("Nicolás", "Insfrán", 12660);

        Profesor profesor1 = new Profesor("Nancy", "Miner", 25852);
        Profesor profesor2 = new Profesor("Claudia", "Grandi", 25647);
        Profesor profesor3 = new Profesor("Carolina", "Casán", 25698);

        Materias materia1 = new Materias("Biología", profesor1);
        Materias materia2 = new Materias("Geografía", profesor2);
        Materias materia3 = new Materias("Psicología", profesor3);

        universidad1.agregarCarrera(carrera1);
        universidad1.agregarCarrera(carrera2);
        universidad1.agregarCarrera(carrera3);

        carrera1.agregarMateria(materia1);
        carrera1.agregarMateria(materia2);
        carrera1.agregarMateria(materia3);

        carrera2.agregarMateria(materia1);
        carrera2.agregarMateria(materia2);
        carrera2.agregarMateria(materia3);

        carrera3.agregarMateria(materia1);
        carrera3.agregarMateria(materia2);
        carrera3.agregarMateria(materia3);

        materia1.agregarEstudiante(estudiante1);
        materia1.agregarEstudiante(estudiante2);
        materia1.agregarEstudiante(estudiante3);

        materia2.agregarEstudiante(estudiante1);
        materia2.agregarEstudiante(estudiante2);
        materia2.agregarEstudiante(estudiante3);

        materia3.agregarEstudiante(estudiante1);
        materia3.agregarEstudiante(estudiante2);
        materia3.agregarEstudiante(estudiante3);

        /*------------Menú de opciones------------*/


            System.out.println("***Bienvenido al Programa Universidad***");

            System.out.println("Indique en el siguiente menú lo que desea hacer: \n");

            System.out.print(
                    "1. Agregar Carreras a una Facultad. \n" +

                            "2. Eliminar Carreras de la facultad. \n" +

                            "3. Eliminar Estudiantes. \n" +

                            "4. Agregar materias a una Carrera.\n" +

                            "5. Eliminar materias a una Carrera.\n" +

                            "6. Agregar Estudiantes a una Materia.   \n" +

                            "7. Eliminar Estudiante de una Materia. \n" +

                            "8. Modificar el Profesor de la materia.\n" +
                            "\nOpción elegida: ");
            int seleccion = num.nextInt();


            switch (seleccion) {

                case 1:
                    universidad1.agregarCarrera(agregarCarrerasUniversidad());
                    break;

                case 2:
                    System.out.println("De las siguientes carreras: ");
                    universidad1.getCarrerillas();
                    System.out.println("Indique el nombre de la carrera que desea eliminar: ");
                    opcion = letra.nextLine().toUpperCase(Locale.ROOT);
                    universidad1.eliminarCarrera(opcion);
                    universidad1.getCarrerillas();






                    break;


                /*System.out.println("1- Si\n0- No");
                opcion = nombre.nextLine();

                while (!Utils.isNumeric(opcion)) {
                    System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
                    opcion = nombre.nextLine();
                }

                while (!(opcion.equals("0") || opcion.equals("1"))) {
                    System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
                    opcion = nombre.nextLine();
                }

                if (opcion.equals("0")){
                    System.out.println("Gracias por elegirnos.");

                }else{
                    System.out.println("Ingrese el nuevo sueldo acomodador: ");
                    double cheque = numero.nextInt();
                    acomodador.setSueldo(cheque);
                    System.out.println("Ha modificado el sueldo del acomodador, quedando de la siguiente forma: ");
                    System.out.println(acomodador.toString());

                }
                System.out.println("Ingrese el nombre de la carrera: ");
                String nombreCarrera = letra.nextLine();
                Carreras carrera4 = new Carreras (nombreCarrera);
                universidad1.agregarCarrera(carrera4);*/

                    /*do while opciones para agregar mas o eliminar - llamar universidad y llamar a método set carreras*/
                /*Eliminar: llamar universidad y mostrar por pantalla las carreras - recorrer la lista - imprimir lista
                con índice, que el usuario elija con el número - control de numeros menor a 0 y que no sea letras
                Modificar: imprimir indice con numeros - que el usuario elija numeros - decir que devuelva lista.get +
                el numero que agrego el usuario - almacenar el objeto dentro de una instancia y editarlo - carrera-setNombre()*/



              /*  //desea agregar materias
                System.out.println("Ingrese el nombre de la carrera: ");
                String nombreCarrera = letra.nextLine();
                Carreras carrera4 = new Carreras (nombreCarrera);
                //desea agregar estudiantes a las materias?*/




            }
           /* System.out.println("1- Si\n0- No");
            opcion = letra.nextLine();

            while (Utils.isNumeric(opcion)) {
                System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
                opcion = letra.nextLine();
            }

            while (!(opcion.equals("0") || opcion.equals("1"))) {
                System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
                opcion = letra.nextLine();

            }

            if (opcion.equals("0")){

                System.out.println("MATERIA SIN ALUMNOS CARGADOS.");
                break;
            }
            /*System.out.println("Ingrese el nombre del espectador Nº: " + cont);
            materia1.a(letra.nextLine());

            System.out.println("Edad del espectador: ");
            edad = num.nextInt();
            espectador.setEdad(edad);

            System.out.println("Fila: ");
            fila = letra.nextLine();
            espectador.setFila(fila);

            System.out.println("Silla: ");
            silla = num.nextInt();
            espectador.setSilla(silla);
            sala1.agregarEspectador(espectador);*/


            /*System.out.println("Continuar agregando: 1 - Finalizar: 0");
            opcion = letra.nextLine();

            while (!Utils.isNumeric(opcion)) {
                System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
                opcion = letra.nextLine();
            }

            while (!(opcion.equals("0") || opcion.equals("1"))) {
                System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
                opcion = letra.nextLine();
                System.out.println("Error. Ingrese sólo 0 o 1.");

            }

            /*cont++;*/
        /*System.out.print(
                        "1. Agregar Carreras a una Facultad. \n" +

                        "2. Eliminar Carreras de la facultad. \n" +

                        "3. Eliminar Estudiantes. \n" +

                        "4. Agregar materias a una Carrera.\n" +

                        "5. Eliminar materias a una Carrera.\n" +

                        "6. Agregar Estudiantes a una Materia.   \n" +

                        "7. Eliminar Estudiante de una Materia. \n" +

                        "8. Modificar el Profesor de la materia.\n" +
                        "\nOpción elegida: ");
            int seleccion = num.nextInt();

        while (seleccion >=1 && seleccion <= 9 ) {

            System.out.println("Error. Indique en el siguiente menú lo que desea hacer presionando números del 1-10: ");
            System.out.print(
                            "1. Agregar Carreras a una Facultad. \n" +

                            "2. Eliminar Carreras de la facultad. \n" +

                            "3. Eliminar Estudiantes. \n" +

                            "4. Agregar materias a una Carrera.\n" +

                            "5. Eliminar materias a una Carrera.\n" +

                            "6. Agregar Estudiantes a una Materia.   \n" +

                            "7. Eliminar Estudiante de una Materia. \n" +

                            "8. Modificar el Profesor de la materia.\n" +
                            "\nOpción elegida: ");
            seleccion = num.nextInt();

        }

        /* SEGUIR DESDE ESTE PUNTO
        switch (seleccion){
            case 1: Materias materia = new Materias();
                        materia.agregarEstudiante();

        }
*/


        }


    public static Carreras agregarCarrerasUniversidad() {
        String opcion;

        do {

            Scanner letras = new Scanner(System.in);

            System.out.println("Ingrese el nombre de la carrera: ");
            String nombreCarrera = letras.nextLine();
            Carreras carrera4 = new Carreras(nombreCarrera);


            System.out.println("Continuar agregando: 1 - Finalizar: 0");
            opcion = letras.nextLine();

                while (!Utils.isNumeric(opcion)) {
                    System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
                    opcion = letras.nextLine();
                }

                while (!(opcion.equals("0") || opcion.equals("1"))) {
                    System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
                    opcion = letras.nextLine();


                }return carrera4;
            }while (!opcion.equals("0"));
        }
    }
