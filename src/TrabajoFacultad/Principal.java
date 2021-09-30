package TrabajoFacultad;
import java.util.Scanner;
class Principal {
    public static void main(String[] args) {

        Scanner num = new Scanner (System.in);


        System.out.println("***Bienvenido a la Facultad***");


            System.out.println("Indique en el siguiente menú lo que desea hacer: ");

            System.out.println(
                    "1. Agregar Carreras a una Facultad. \n" +
                            "\n" +
                            "2. Eliminar Carreras de la facultad. \n" +
                            "\n" +
                            "3. Eliminar Estudiantes de una facultad implica que se elimine el estudiante de cada una de las materias a las cuales se inscribió. \n" +
                            "\n" +
                            "4. Agregar materias a una Carrera.\n" +
                            "\n" +
                            "5. Eliminar materias a una Carrera.\n" +
                            "\n" +
                            "6. Encontrar materias de una carrera en particular indicando el nombre de la materia. Si la materia existe nos deberá preguntar si deseamos eliminar.\n" +
                            "\n" +
                            "7. Agregar Estudiantes a una Materia.   \n" +
                            "\n" +
                            "8. Eliminar Estudiante de una Materia. \n" +
                            "\n" +
                            "9. Modificar el Profesor de la materia.\n" +
                            "\n" +
                            "10. Las clases Estudiantes y Profesores descienden de la clase abstracta Personas. \n" +
                            "\n");
            int seleccion = num.nextInt();

        while (seleccion >=1 && seleccion <= 10 ) {

            System.out.println("Indique en el siguiente menú lo que desea hacer presionando números del 1-10: ");
            System.out.println(
                             "1. Agregar Carreras a una Facultad. \n" +
                            "\n" +
                            "2. Eliminar Carreras de la facultad. \n" +
                            "\n" +
                            "3. Eliminar Estudiantes de una facultad implica que se elimine el estudiante de cada una de las materias a las cuales se inscribió. \n" +
                            "\n" +
                            "4. Agregar materias a una Carrera.\n" +
                            "\n" +
                            "5. Eliminar materias a una Carrera.\n" +
                            "\n" +
                            "6. Encontrar materias de una carrera en particular indicando el nombre de la materia. Si la materia existe nos deberá preguntar si deseamos eliminar.\n" +
                            "\n" +
                            "7. Agregar Estudiantes a una Materia.   \n" +
                            "\n" +
                            "8. Eliminar Estudiante de una Materia. \n" +
                            "\n" +
                            "9. Modificar el Profesor de la materia.\n" +
                            "\n" +
                            "10. Las clases Estudiantes y Profesores descienden de la clase abstracta Personas. \n" +
                            "\n");
            seleccion = num.nextInt();

        }

        switch (seleccion){
            case 1: Materias materia = new Materias();

            materia.
        }




   /* Estudiante carlitos = new Estudiante("Carlos", "Villagrán", 5978);
        System.out.println(carlitos.toString());
        Profesor profe = new Profesor ("Juan", "Quintana", 5874);

        System.out.println(profe.calcularSueldo(20000,4));

    }*/
    }
}
