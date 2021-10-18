package TrabajoGCine;


/*Una sala de cine debe contener la capacidad de la sala, la película que se proyecta en la misma, el nombre de la sala y el listado de espectadores asignados a la misma.

Las Salas no deben permitir la asignación de una lista de Espectadores superior a su capacidad.

Se debe poder listar los espectadores de una sala, pero en caso de que no haya sido asignada se debe capturar el error emitiendo el mensaje "SIN ESPECTADORES CARGADOS".

El Programa debe por lo menos una clase abstracta Personas de la cual hereden Espectadores y Empleados:


La clase Personas deberá tener por lo menos dos método abstractos:

Uno que permitirá ver si la persona es un Espectador, un Acomodador o un Empleado dependiendo de qué clase sea.

Uno que permitirá visualizar todos los datos de la persona.

Los Espectadores además de sus datos personales deben estar asignados a una butaca definida por la Fila (una letra) y la Silla (un entero entero).

La clase Empleados deberán contener el Sueldo que cobra el empleado y permitir su posterior modificación.

El programa contendrá una clase Acomodadores que heredará de la clase Empleados e implementará la interfaz ParaAcomodadores.

A los Acomodadores se les podrá designar una sala o modificar la sala asignada.

La interfaz ParaAcomodadores deberá permitir la asignación y modificación de una sala a un acomodador.

El programa debe tener una clase principal llamada Cine en donde se deben realizar las siguientes operaciones:

Cargar espectadores pidiendo los nombre, edad, fila y silla al usuario por medio de la consola. En caso de que el usuario ingrese letras en lugar de números donde no corresponda el programa debe finalizar con el error: "ERROR EN EL INGRESO DE DATOS".

Por medio del código crear una sala con capacidad para 3 personas llamada “Sala 01” en donde se proyecte la película “Jocker”.

Asignar a la sala los espectadores cargados.

Imprimir la lista de espectadores que se encuentran asignado a la sala.

Crear un acomodador por medio del código.

Asignar a dicho Acomodador la sala creada anteriormente.

Asignar un sueldo de $50.000 al Acomodador.

Mostrar los datos del Acomodador en la consola.

Crear un Empleado.

Mostrar los datos del Empleado.

Todas las clases instanciables del programa deben tener los métodos geters, seters para ingresar o visualizar datos necesarios para los procesos solicitados y el método toString que mostrará todos los datos relevantes de la clase. */
import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {

        int cont = 1;
        int salaUno = 0;
        int edad;
        String fila;
        int silla;
        String opcion = "";



        Scanner nombre = new Scanner(System.in);
        Scanner numero = new Scanner(System.in);


        Salas sala1 = new Salas(3, "01");
        Acomodadores acomodador = new Acomodadores ("Juan", 32, " Acomodador", 50000);
        Empleados empleado = new Empleados("Stella", 22," Empleado", 40000);



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

            if (opcion.equals("0")){
                sala1.setPelicula("Joker");
                System.out.println(sala1.toString());
                System.out.println("SALA SIN ESPECTADORES CARGADOS.");
                break;
            }


            System.out.println("Ingrese el nombre del espectador Nº: " + cont);
            espectador.setNombre(nombre.nextLine());

            System.out.println("Edad del espectador: ");
            edad = numero.nextInt();
            espectador.setEdad(edad);

            System.out.println("Fila: ");
            fila = nombre.nextLine();
            espectador.setFila(fila);

            System.out.println("Silla: ");
            silla = numero.nextInt();
            espectador.setSilla(silla);
            sala1.agregarEspectador(espectador);



            System.out.println("Continuar agregando: 1 - Finalizar: 0");
            opcion = nombre.nextLine();

                while (!Utils.isNumeric(opcion)) {
                    System.out.println("Error. Ingresar sólo números. Continuar agregando: 1 - Finalizar: 0");
                    opcion = nombre.nextLine();
                }

                while (!(opcion.equals("0") || opcion.equals("1"))) {
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
        } while (!opcion.equals("0"));

        sala1.setPelicula("Joker");
        acomodador.setSala(sala1);
        System.out.println(sala1.toString());

        System.out.println("Personal: ");
        System.out.println(empleado.toString());
        System.out.println(acomodador.toString());


//---------------------Modificar la sala del acomodador-------------------
        System.out.println("¿Desea la sala del acomodador?");
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

        if (opcion.equals("0")){
            System.out.println("No se modificaron datos");

        }else{
            System.out.println("Ingrese la sala acomodador: ");
            sala1.setNombre(nombre.nextLine());
            acomodador.setSala(sala1);
            System.out.println("Ha modificado el sueldo del acomodador, quedando de la siguiente forma: ");
            System.out.println(acomodador.toString());

        }

//---------------------Modificar el sueldo del acomodador-------------------
        System.out.println("¿Desea modificar el sueldo del acomodador?");
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

        if (opcion.equals("0")){
            System.out.println("Gracias por elegirnos.");

        }else{
            System.out.println("Ingrese el nuevo sueldo acomodador: ");
            double cheque = numero.nextInt();
            acomodador.setSueldo(cheque);
            System.out.println("Ha modificado el sueldo del acomodador, quedando de la siguiente forma: ");
            System.out.println(acomodador.toString());

        }

    }
}

