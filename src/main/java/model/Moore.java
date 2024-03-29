package model;

import java.util.ArrayList;
/**
 * Clase Moore
 * @author Alejandra Gonz�lez V�lez
 * Clase encargada de calcular el aut�mata m�nimo equivalente cuando este es Moore
 */
public class Moore {

	/**
	 * Atributo estados de tipo ArrayList. Arreglo con todos los estados existentes en el aut�mata
	 */
	private ArrayList<Estado> estados;
	/**
	 * Atributo de tipo ArrayList. Almacena las salidas del aut�mata
	 */
	private ArrayList<String> salidas;
	/*
	 * Atributo de tipo String. Almacena el nombre de un estado eliminado para evitar ser comparado nuevamente
	 */
	private String dis;
	/**
	 * Atributo de tipo Arraylist. Almacena todos los arreglos que contienen los nombres de los estados existentes en el automata
	 */
	ArrayList<ArrayList<String>> str2;
	/**
	 * Atributo todos de tipo ArrayList. Almacena los arreglos que contienen a los estados existentes en el aut�mata
	 */
	private ArrayList<ArrayList<Estado>> todos;
	
	/**
	 * M�todo constructor de la clase Moore
	 */
	public Moore() {
		
		estados = new ArrayList<Estado>();
		salidas = new ArrayList<String>();
		todos = new ArrayList<ArrayList<Estado>>();
		str2 = new ArrayList<ArrayList<String>>();
		dis = "-";
		
	}
	
	/*
	 * M�todo que agrega un estado con dos entradas
	 * @param estado que se quiere agregar 
	 */
	public void agregarDos(Estado nuevo) {

		String str = nuevo.getSalida();
		if (!salidas.contains(str)) {
			salidas.add(str);
			ArrayList<Estado> x = new ArrayList<Estado>();
			ArrayList<String> y = new ArrayList<String>();
			todos.add(x);
			str2.add(y);
			
		}

		
		estados.add(nuevo);

	}
	
	/**
	 * M�todo que agrega un estado con tres entradas
	 * @param nuevo estado que se quiere agregar
	 */
	public void agregarTres(Estado nuevo) {

		String loco = nuevo.getSalida1();
		if (!salidas.contains(loco)) {
			salidas.add(loco);
			ArrayList<Estado> x = new ArrayList<Estado>();
			ArrayList<String> y = new ArrayList<String>();
			todos.add(x);
			str2.add(y);
		
		}

		
		estados.add(nuevo);
		System.out.println(estados.size());

	}
	
	/*
	 * M�todo get del atributo Estados
	 * @return Arreglo con todos los estados existentes en el aut�mata
	 */
	public ArrayList<Estado> getEstados() {
		return estados;
	}

	/**
	 * M�todo set del atributo Estados
	 * @param estados. ArrayList con todos los estados existentes en el aut�mata
	 */
	public void setEstados(ArrayList<Estado> estados) {
		this.estados = estados;
	}

	/**
	 * M�todo get del atributo str2
	 * @return Arreglo con los arreglos que contienen los nombres de los estados existentes en el aut�mata
	 */
	public ArrayList<ArrayList<String>> getStr2() {
		return str2;
	}

	/**
	 * M�todo set del atributo estados
	 * @param str2 Arreglo con todos los arreglos que contienen los nombres de los estados existentes en el aut�mata
	 */
	public void setStr2(ArrayList<ArrayList<String>> str2) {
		this.str2 = str2;
	}
	
	
	/**
	 * M�todo que reduce un aut�mata con dos entradas
	 * @return Arreglo que almacena los arreglos que contienen a los estados existentes en el aut�mata (Pn)
	 */
	public ArrayList<ArrayList<Estado>> reducirDos() {

		ArrayList<ArrayList<Estado>> todos2 = new ArrayList<ArrayList<Estado>>();
		ArrayList<ArrayList<String>> str = new ArrayList<ArrayList<String>>();

		boolean mismo = false;

		for (int i = 0; i < estados.size(); i++) {

			Estado agregar = new Estado(estados.get(i).getEstado(), estados.get(i).getEntrada0(),
					estados.get(i).getEntrada1(), estados.get(i).getSalida());

			String salida = String.valueOf(agregar.getSalida());
			for (int j = 0; j < salidas.size(); j++) {

				if (salida.equals(salidas.get(j))) {
					todos.get(j).add(agregar);
					str2.get(j).add(agregar.getEstado());

				}

			}

		}

		for (int i = 0; i < todos.size(); i++) {

			todos2.add((ArrayList<Estado>) todos.get(i).clone());
			str.add((ArrayList<String>) str2.get(i).clone());

		}

		ArrayList<Estado> resultado = new ArrayList<>();
		ArrayList<String> resultadoStr = new ArrayList<>();
		for (int i = 0; i < todos.size() && !mismo; i++) {

			boolean esta = false;
			boolean esta1 = false;

			for (int j = 0; j < todos.get(i).size() - 1; j++) {

				if (todos.get(i).get(j).getEstado() != dis) {
					String primero = todos.get(i).get(j).getEntrada0();
					String primero2 = todos.get(i).get(j).getEntrada1();

					for (int l = j + 1; l < todos.get(i).size() && (!(esta && esta1)); l++) {
						String segundo = todos.get(i).get(l).getEntrada0();
						String segundo2 = todos.get(i).get(l).getEntrada1();

						if (!resultadoStr.contains(todos.get(i).get(j).getEstado())) {

							for (int k = 0; k < todos.size() && !esta; k++) {
								if ((str.get(k).contains(primero) && str.get(k).contains(segundo))) {
									esta = true;
								}
							}
							for (int k = 0; k < todos.size() && !esta1; k++) {
								if ((str.get(k).contains(primero2) && str.get(k).contains(segundo2))) {
									esta1 = true;
								}
							}

							if (!(esta && esta1)) {
								Estado removido = todos.get(i).get(l);
								String remov = todos.get(i).get(l).getEstado();
								dis = remov;
								todos2.get(i).remove(removido);
								resultado.add(removido);
								str2.get(i).remove(remov);
								resultadoStr.add(remov);

							}

						}

					}

					esta = false;
					esta1 = false;
				}
			}

			if (i == todos.size() - 1) {

				if (str.equals(str2)) {
					mismo = true;
				} else {
					todos2.add((ArrayList<Estado>) resultado.clone());
					str2.add((ArrayList<String>) resultadoStr.clone());

					todos.clear();
					ArrayList<ArrayList<Estado>> nuevo = new ArrayList<>();
					for (int k = 0; k < todos2.size(); k++) {
						ArrayList<Estado> w = new ArrayList<>();
						for (int k2 = 0; k2 < todos2.get(k).size(); k2++) {
							w.add(todos2.get(k).get(k2));
						}
						nuevo.add(w);
					}
					todos = (ArrayList<ArrayList<Estado>>) nuevo.clone();

					ArrayList<ArrayList<String>> nuevoOtro = new ArrayList<>();
					for (int k = 0; k < str2.size(); k++) {
						ArrayList<String> q = new ArrayList<>();
						for (int k2 = 0; k2 < todos2.get(k).size(); k2++) {
							q.add(todos2.get(k).get(k2).getEstado());
						}
						nuevoOtro.add(q);

					}

					str.clear();
					str.addAll(nuevoOtro);
					resultado.clear();
					resultadoStr.clear();
					dis = "-";
					i = -1;

				}

			}

		}
		System.out.println(str2.toString());
		return todos;

	}
	
	
	/**
	 * M�todo que reduce un aut�mata con tres entradas
	 * @return Arreglo que almacena los arreglos que contienen a los estados existentes en el aut�mata (Pn)
	 */
	public ArrayList<ArrayList<Estado>> reducirTres() {

		
		ArrayList<ArrayList<Estado>> todos2 = new ArrayList<ArrayList<Estado>>();
		ArrayList<ArrayList<String>> str = new ArrayList<ArrayList<String>>();

		boolean mismo = false;

		for (int i = 0; i < estados.size(); i++) {

			Estado agregar = new Estado(estados.get(i).getEstado(), estados.get(i).getEntrada0(),
					estados.get(i).getSalida0(), estados.get(i).getEntrada1(), estados.get(i).getSalida1());

			String salida =String.valueOf(agregar.getSalida1());
			for (int j = 0; j < salidas.size(); j++) {

				if (salida.equals(salidas.get(j))) {
					todos.get(j).add(agregar);
					str2.get(j).add(agregar.getEstado());

				}

			}

		}

		for (int i = 0; i < todos.size(); i++) {

			todos2.add((ArrayList<Estado>) todos.get(i).clone());
			str.add((ArrayList<String>) str2.get(i).clone());

		}

		ArrayList<Estado> resultado = new ArrayList<>();
		ArrayList<String> resultadoStr = new ArrayList<>();
		for (int i = 0; i < todos.size() && !mismo; i++) {

			boolean esta = false;
			boolean esta1 = false;
			boolean esta2=false;

			for (int j = 0; j < todos.get(i).size() - 1; j++) {

				if (todos.get(i).get(j).getEstado() != dis) {
					String primero = todos.get(i).get(j).getEntrada0();
					String primero2 = todos.get(i).get(j).getSalida0();
					String primero3 = todos.get(i).get(j).getEntrada1();

					for (int l = j + 1; l < todos.get(i).size() && (!(esta && esta1 && esta2)); l++) {
						String segundo = todos.get(i).get(l).getEntrada0();
						String segundo2 = todos.get(i).get(l).getSalida0();
						String segundo3 = todos.get(i).get(l).getEntrada1();

						if (!resultadoStr.contains(todos.get(i).get(j).getEstado())) {

							for (int k = 0; k < todos.size() && !esta; k++) {
								if ((str.get(k).contains(primero) && str.get(k).contains(segundo))) {
									esta = true;
								}
							}
							for (int k = 0; k < todos.size() && !esta1; k++) {
								if ((str.get(k).contains(primero2) && str.get(k).contains(segundo2))) {
									esta1 = true;
								}
							}
							for (int k = 0; k < todos.size() && !esta2; k++) {
								if ((str.get(k).contains(primero3) && str.get(k).contains(segundo3))) {
									esta2 = true;
								}
							}
							if (!(esta && esta1 &&esta2)) {
								Estado removido = todos.get(i).get(l);
								String remov = todos.get(i).get(l).getEstado();
								dis = remov;
								todos2.get(i).remove(removido);
								resultado.add(removido);
								str2.get(i).remove(remov);
								resultadoStr.add(remov);

							}

						}

					}

					esta = false;
					esta1 = false;
					esta2=false;
				}
			}

			if (i == todos.size() - 1) {

				if (str.equals(str2)) {
					mismo = true;
				} else {
					todos2.add((ArrayList<Estado>) resultado.clone());
					str2.add((ArrayList<String>) resultadoStr.clone());

					todos.clear();
					ArrayList<ArrayList<Estado>> nuevo = new ArrayList<>();
					for (int k = 0; k < todos2.size(); k++) {
						ArrayList<Estado> w = new ArrayList<>();
						for (int k2 = 0; k2 < todos2.get(k).size(); k2++) {
							w.add(todos2.get(k).get(k2));
						}
						nuevo.add(w);
					}
					todos = (ArrayList<ArrayList<Estado>>) nuevo.clone();

					ArrayList<ArrayList<String>> nuevoOtro = new ArrayList<>();
					for (int k = 0; k < str2.size(); k++) {
						ArrayList<String> q = new ArrayList<>();
						for (int k2 = 0; k2 < todos2.get(k).size(); k2++) {
							q.add(todos2.get(k).get(k2).getEstado());
						}
						nuevoOtro.add(q);

					}

					str.clear();
					str.addAll(nuevoOtro);
					resultado.clear();
					resultadoStr.clear();
					dis = "-";
					i = -1;
					

				}

			}

		}

		System.out.println(str2.toString());
		return todos;
	}
	
	/**
	 * M�todo que limpia todos los arreglos de elementos agregados 
	 */
	public void limpiarMoore() {
		
		todos.clear();
		str2.clear();
		
	}

	
	
}
