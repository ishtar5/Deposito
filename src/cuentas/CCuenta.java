package cuentas;

/**
 * Clase que simula el comportamiento de un cuenta bancaria
 * @author Esther Morales Feito
 */
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    /**
     * Constructor vacio de la clase CCuenta
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor con parametros de la clase CCuenta
     * @param nom Nombre del propietario de la cuenta
     * @param cue Numero de cuenta
     * @param sal Cantidad de saldo inicial
     * @param tipo El tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Metodo para obtener el nombre del propietario
     * @return nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Metodo que permite cambiar el nombre del propietario de la cuenta
     * @param nombre El nombre del propetario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo que permite conocer el numero de la cuenta
     * @return cuenta del propietario
     */
    public String getCuenta() {
        return cuenta;
    }
    
    /**
     * Metodo que permite establecer o modificar el numero de la cuenta
     * @param cuenta Numero de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    
    /**
     * Metodo que permite obtener el salgo actual de la cuenta
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo que permite establecer o modificar el saldo de la cuenta
     * @param saldo El saldo de una cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     * Metodo que permite obtener el tipo de interes de la cuenta
     * @return El tipo de interes de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    
    /**
     * Metodo que permite establecer o modificar el tipo de interes de la cuenta
     * @param tipoInterés El tipo de interes de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    /**
     * Metodo que permite consultar el estado actual de la cuenta
     * @return saldo actual de la cuenta
     */
    public double estado()
    {
        return saldo;
    }
    
    /**
     * Metodo que permite ingresar una cantidad de dinero en la cuenta
     * @param cantidad La cantidad de dinero que se vaya a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Metodo que permite retirar una cantidad de dinero de la cuenta
     * @param cantidad La cantidad que se desea retirar
     * @throws Exception Si la cantidad es negativa o si el saldo actual es 
     * inferior a la cantidad que se desea retirar
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
