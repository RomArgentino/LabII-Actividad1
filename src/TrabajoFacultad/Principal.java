package TrabajoFacultad;

class Principal {
    public static void main(String[] args) {
    Estudiante carlitos = new Estudiante("Carlos", "Villagrán", 5978);
        System.out.println(carlitos.toString());
        Profesor profe = new Profesor ("Juan", "Quintana", 5874);

        System.out.println(profe.calcularSueldo(20000,4));

    }
}
