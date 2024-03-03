package cuentas;
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(2500);
    }

	public static void operativa_cuenta(float cantidad) {
		Cuenta1 miCuenta;
        double saldoActual;

        miCuenta = new Cuenta1("Antonio López","1000-2365-85-1230456789",cantidad,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
