package cuentas;

/**
 * Classe que defineix objectes del tipus compte bancari i implementa els mètodes getter i setter
 * pels seus atributs i els mètodes per ingresar i retirar quantitats del compte.
 * 
 * @author Joan Rebassa Oliver
 * @version 1.0
 * @since 1.0
 *
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Mètode constructor de sa classe CCuenta per defecte.
     */
    public CCuenta()
    {
    }

    /**
     * Mètode constructor de sa classe CCuenta per instanciar objectes inicialitzant els 
     * seus paràmetres
     * 
     * @param nom Nom del titular del compte
     * @param cue Número del compte 
     * @param sal Saldo del compte
     * @param tipo Tipus d'interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * @return Retorna el valor del saldo del compte
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * @param cantidad Quantitat a ingresar en el compte
     * @throws Exception El mètode llança una excepció si sa quantitat és menor de 0
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * @param cantidad Quantitat a retirar del compte
     * @throws Exception El mètode llança una excepció si sa quantitat és menor o igual a 0
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return Retorna el nom del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Modifica el nom del titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Retorna el número de compte
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta Modifica el número de compte
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return Retorna el saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo Modifica el saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return Retorna el tipus d'interés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés Modifica el tipus d'interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}