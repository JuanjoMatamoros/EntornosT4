package cuentas.cliente;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta(null);
    }

    public static void operativa_cuenta(Float cantidad) {
        Cuenta Cuenta1;
        double saldoActual;

        Cuenta1 = new Cuenta("Rafael Nadal Parera","1000-2365-85-1230456789",2500,0);
        
        System.out.println("El saldo actual es:"+ Cuenta1.estado() );

        try {
            Cuenta1.retirar(2300);
            System.out.println("El saldo actual es:"+ Cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            Cuenta1.ingresar(695);
            System.out.println("El saldo actual es:"+ Cuenta1.estado() );
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        saldoActual  = Cuenta1.getSaldo();
        System.out.println("Tu saldo actual es:" + saldoActual);
    }
}
