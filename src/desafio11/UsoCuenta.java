package desafio11;


public class UsoCuenta {

    public static void main(String []args){

        CuentaCorriente Cuenta1 = new CuentaCorriente( 20000, "Mauricio");
        CuentaCorriente Cuenta2 = new CuentaCorriente( 20000, "Camila");

        System.out.println(Cuenta1.toString());
        System.out.println("\n");
        System.out.println(Cuenta2.toString());
        System.out.println("\n");
        System.out.print(Cuenta1.getNombreTitular() + Cuenta1.Transferencia(Cuenta2,2500));

    }
}
