package cuentas;

/**
 * Clase principal para la inicializacion del programa
 * @author Esther Morales Feito
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(0);
    }
    
    /**
     * Metodo que realiza las diferentes operaciones con la clase CCuenta
     * @param cantidad Cantidad de dinero que se vaya a ingresar o retirar
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
