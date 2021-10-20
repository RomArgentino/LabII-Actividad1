package TrabajoFacultad;
import TGN1.Utils;

import java.util.Locale;
import java.util.Scanner;

class Principal {
    public static void main(String[] args) {

        String opcion = "";


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

        universidad1.agregarEstudiante(estudiante1);
        universidad1.agregarEstudiante(estudiante2);
        universidad1.agregarEstudiante(estudiante3);

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

        String numero = letra.nextLine();
        int op = controlIngresosMenu(numero);

        do {
            switch (op) {

                case 1:
                    universidad1.agregarCarrera(agregarCarrerasUniversidad());
                    universidad1.getCarrerillas();
                    break;

                case 2:
                    System.out.println("De las siguientes carreras: ");
                    universidad1.getCarrerillas();
                    System.out.println("Indique el nombre de la carrera que desea eliminar: ");
                    opcion = letra.nextLine().toUpperCase(Locale.ROOT);
                    universidad1.eliminarCarrera(controlNombre(opcion));
                    break;

                case 3:
                    System.out.println("De los siguientes estudiantes: ");
                    universidad1.getEstudiantes();
                    System.out.println("Ejila el número correspondiente al estudiante que desea eliminar");
                    opcion = letra.nextLine();
                    Estudiante e = universidad1.getEstudiante(controlIngresosOpcion(opcion));
                    universidad1.eliminarEstudiante(e);
                    universidad1.getEstudiantes();

                case 4:
                    carrera1.agregarMateria(agregarMateriasUniversidad());
                    carrera1.getMaterillas();
            }


            System.out.println("Continuar agregando: 1 - Finalizar: 0");
            opcion = letra.nextLine();

            while (!Utils.isNumeric(opcion)) {
                System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
                opcion = letra.nextLine();
            }

            while (!(opcion.equals("0") || opcion.equals("1"))) {
                System.out.println("Error. Continuar agregando: 1 - Finalizar: 0");
                opcion = letra.nextLine();
            }
        } while (!(opcion.equals("0")));
    }

    public static Carreras agregarCarrerasUniversidad() {

            Scanner letras = new Scanner(System.in);

            System.out.println("Ingrese el nombre de la carrera: ");
            String nombreCarrera = letras.nextLine();
            Carreras carrera4 = new Carreras(nombreCarrera);

            return carrera4;

    }

    public static Materias agregarMateriasUniversidad() {

            Scanner letras = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la materia: ");
            String nombreMateria = letras.nextLine();
            Materias materia4 = new Materias(nombreMateria);
            return materia4;

    }

    public static int controlIngresosMenu(String ingreso) {

        Scanner letras = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        int ingresos;

           while (!Utils.isNumeric(ingreso)) {
                System.out.println("Error. Ingrese sólo números.");
                ingreso = letras.nextLine();
            }

           ingresos = Integer.parseInt(ingreso);


        while(!(ingresos > 0 && ingresos <=8)) {
            System.out.println("Error. Ingrese una de las siguientes opciones. \n" +
                    "1. Agregar Carreras a una Facultad. \n" +
                    "2. Eliminar Carreras de la facultad. \n" +
                    "3. Eliminar Estudiantes. \n" +
                    "4. Agregar materias a una Carrera.\n" +
                    "5. Eliminar materias a una Carrera.\n" +
                    "6. Agregar Estudiantes a una Materia.   \n" +
                    "7. Eliminar Estudiante de una Materia. \n" +
                    "8. Modificar el Profesor de la materia.\n" +

                    "\nOpción elegida: ");
            ingresos = num.nextInt();
        }
        return ingresos;
    }

    public static String controlNombre(String palabra){

        Scanner letras = new Scanner(System.in);

        String palabras="";

        while (Utils.isNumeric(palabra)) {
            System.out.println("Error. Ingrese caracteres o palabras.");
            palabra = letras.nextLine();
        }
        palabras = palabra;

        return palabras;
    }

    public static int controlIngresosOpcion(String ingreso) {

        Scanner letras = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        int ingresos;

        while (!Utils.isNumeric(ingreso)) {
            System.out.println("Error. Ingrese sólo números.");
            ingreso = letras.nextLine();
        }

        ingresos = Integer.parseInt(ingreso);


        while(ingresos > 3) {
            System.out.println("Error. Ingrese una de las siguientes opciones con números del 0 al 2. \n" +
            "\nOpción elegida: ");
            ingresos = num.nextInt();
        }
        return ingresos;
    }

}

