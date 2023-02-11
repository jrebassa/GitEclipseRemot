package cuentas;

/**
 * Classe per generar i operar amb comptes bancaris
 * 
 * @author Joan Rebassa Oliver
 * @version 1.0
 * @since 1.0
 *
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, 0);
    }

	/**
	 * @param cuenta1 Paràmetre del mètode operativa_cuenta del objecte CCuenta amb el que operar
	 * @param cantidad Paràmetre del mètode operativa_cuenta amb el valor de sa quantitat
	 */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		double saldoActual;
		double saldoFinal;
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        saldoFinal = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoFinal );
	}
}
