package model;

public class Estado {
	
	/**
	 * Atributo de tipo String que representa el nombre del estado
	 */
	private String estado;
	/**
	 * Atributo de tipo String que representa el nombre de la primera entrada
	 */
	private String entrada0;
	/**
	 * Atributo de tipo String que representa el nombre de la segunda entrada
	 */
	private String entrada1;
	/**
	 * Atributo de tipo string que representa el nombre de la tercera entrada
	 */
	private String entrada2;
	/**
	 * Atributo de tipo String que representa el nombre de la primera salida
	 */
	private String salida0;
	/**
	 * Atributo de tipo string que representa el nombre de la segunda salida
	 */
	private String salida1;
	/**
	 * Atributo de tipo String que representa el nombre de la tercera salida
	 */
	private String salida2;
	/**
	 * Atibuto de tipo String que representa el nombre de la salida única
	 */
	private String salida;
	
	
	/**
	 * Constructor de la clase Estado para un autómata moore con dos entradas
	 * @param estado: nombre del estado
	 * @param entrada0: nombre de la primera entrada
	 * @param entrada1: nombre de la segunda entrada
	 * @param salida: nombre de la salida
	 */
	public Estado(String estado, String entrada0, String entrada1, String salida) {
		
		this.estado = estado;
		this.entrada0 = entrada0;
		this.entrada1 = entrada1;
		this.salida = salida;
		
	}

/**
 * Cinstructir de la clase Estado para un autómata moore con tres entradas o un autómata mealy con dos entradas
 * @param estado: nombre del estado
 * @param entrada0: nombre de la primera entrada
 * @param salida0: nombre de la primera salida para mealy, nombre de la segunda entrada para moore
 * @param entrada1: nombre de la segunda entrada para mealy, nombre de la tercera entrada para moore
 * @param salida1: nombre de la segunda salida para mealy, nombre de la única salida para moore
 */
	public Estado(String estado, String entrada0, String salida0, String entrada1, String salida1) {
		
		this.estado = estado;
		this.entrada0 = entrada0;
		this.salida0 = salida0;
		this.entrada1 = entrada1;
		this.salida1 = salida1; 
		
	}
	
	/**
	 * Constructor de la clase estado para un autómata mealy con tres entradas
	 * @param estado: nombre del estado
	 * @param entrada0: nombre de la primera entrada
	 * @param salida0: nombre de la primera salida
	 * @param entrada1: nombre de la segunda entrada
	 * @param salida1: nombre de la segunda salida
	 * @param entrada2: nombre de la tercera entrada
	 * @param salida2: nombre de la tercera salida
	 */
	public Estado(String estado, String entrada0, String salida0, String entrada1, String salida1, String entrada2, String salida2) {
		
		this.estado = estado;
		this.entrada0 = entrada0;
		this.salida0 = salida0;
		this.entrada1 = entrada1;
		this.salida1 = salida1;
		this.entrada2 = entrada2;
		this.salida2 = salida2;

		
	}

	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getEntrada0() {
		return entrada0;
	}


	public void setEntrada0(String entrada0) {
		this.entrada0 = entrada0;
	}

	public String getEntrada1() {
		return entrada1;
	}


	public void setEntrada1(String entrada1) {
		this.entrada1 = entrada1;
	}


	public String getEntrada2() {
		return entrada2;
	}


	public void setEntrada2(String entrada2) {
		this.entrada2 = entrada2;
	}


	public String getSalida0() {
		return salida0;
	}


	public void setSalida0(String salida0) {
		this.salida0 = salida0;
	}


	public String getSalida1() {
		return salida1;
	}


	public void setSalida1(String salida1) {
		this.salida1 = salida1;
	}


	public String getSalida2() {
		return salida2;
	}


	public void setSalida2(String salida2) {
		this.salida2 = salida2;
	}


	public String getSalida() {
		return salida;
	}


	public void setSalida(String salida) {
		this.salida = salida;
	}
	
	
	

}