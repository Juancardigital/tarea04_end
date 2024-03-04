package cuentas;
public class CCuenta {
	
/**
 * Clase funcionamiento Cta. corriente
 * @author juanc
 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }
/**
 * constructor que inicializa los parámetros de clase de la cuenta
 * @param nom nombre persona titular de la cuenta
 * @param cue numero de cuenta
 * @param sal cantidad de saldo en lacuenta
 * @param tipo de interés a aplicar en la cuenta
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * método getter que devuelve el nombre del titular de la cuenta    
     * @return nombre = nombre. Devuelve nombre del titular de la cuenta
     */
    public String getNombre() {
		return nombre;
	}
    
    /**
     * metodo setter
     * @param nombre = nombre cuenta
     */
    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
     * método getter que devuelve el nº de la cuenta    
     * @return cuenta = nº de la cuenta. Devuelve el nºde la cuenta
     */
	public String getCuenta() {
		return cuenta;
	}
	
	/**
     * metodo setter
     * @param cuenta = nº de cuenta
     */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
     * método getter que devuelve el saldo  de la cuenta    
     * @return saldo = saldo de la cuenta 
     */
	public double getSaldo() {
		return saldo;
	}
	
	/**
     * metodo setter
     * @param saldo = importe de la cuenta 
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	/**
     * método getter que devuelve el tipo de interés aplicable   
     * @return tipoInteres = tipo de interés 
     */
	public double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
     * metodo setter
     * @param tipoInterés= tipo de interés
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * indica el estado de la cuenta
	 * @return saldo = saldo de la cuenta
	 */
	public double estado()
    {
        return saldo;
    }
	/**
	 * ingresar cantidad en la cuenta
	 * @param cantidad = ingresar
	 * @throws Exception. Si cantidad es <= 0 no se puede ingresar
	 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * retirar cantidad de la cuenta
     * @param cantidad = retirar
     * @throws Exception. Si cantidad <=0 no se puede retirar 
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
