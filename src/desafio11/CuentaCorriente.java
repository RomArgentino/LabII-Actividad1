package desafio11;

/*Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes características:

Nombre de clase: CuentaCorriente.

Propiedades:
saldo (double).

nombreTitular (String).

numeroCuenta (long).

Constructor con dos parámetros:
nombreTitular (String)

saldo (double)

Este constructor se encargará de establecer un nombre de titular para la cuenta corriente, un saldo inicial y asignará un nº a la cuenta corriente de tipo long de forma aleatoria.

Métodos:
2 setter: permitirán hacer ingresos y reintegros en un objeto de tipo CuentaCorriente.

2 getter: Permitirán obtener saldo de la cuenta y datos generales de una CuentaCorriente.

1 método adicional: permitirá realizar transferencias de dinero de una cuenta a otra.

En la clase principal hacer lo siguiente:
Crea una clase principal con el nombre de UsoCuenta.
Crea dos instancias de CuentaCorriente con el nombre de Cuenta1 y Cuenta2.
Haz una transferencia de Cuenta1 a Cuenta2 por importe de $2500.
Imprime los datos de las dos cuentas en consola.*/

public class CuentaCorriente {

    private double Saldo;
    private String nombreTitular;
    double Plata;
    long numeroCuenta;
    CuentaCorriente Cuenta;



    public double getSaldo() {
        return Saldo;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public String toString() {
        return  "Cuenta Nº: " + numeroCuenta +
                "\nTitular: " + nombreTitular +
                "\nSaldo: $" + Saldo;

    }

    public CuentaCorriente (double Saldo, String nombreTitular){
       this.Saldo = Saldo;
       this. nombreTitular = nombreTitular;
       numeroCuenta = (long)(Math. random()*1000000000+1);
   }

   public void sumarPlata (double plata){
       this.Saldo += plata;
    }



    public String Transferencia(CuentaCorriente cuentaExterna, double plata){

        this.Cuenta = cuentaExterna;
        this.Plata = plata;
        this.Saldo = this.Saldo - plata;
        cuentaExterna.sumarPlata(plata);
        //variable de clases

        return " transfirió: $" + this.Plata +"\na la\n" + this.Cuenta + "\n\nSaldo actual: "+ this.Saldo;
    }





}
