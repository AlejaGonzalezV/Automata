package model;

import java.util.ArrayList;
/**
 * Clase Máquina
 * @author aleja
 * Clase que se encarga de establecer y facilitar la comunicación con el tipo de autómata creado por el usuario
 */
public class Maquina {
	
	/**
	 * Atributo de tipo Mealy que representa un autómata Mealy
	 */
	private Mealy mealy;
	/**
	 * Autómata de tipo Moore que representa un autómata Moore
	 */
	private Moore moore;

	/**
	 * Método constructor de la clase Máquina
	 * @param maquina. String que determina el tipo de máquina a crear
	 */
	public Maquina(String maquina) {
		
		if(maquina.equals("1")) {
			
			this.moore = new Moore();
			
		} else {
			
			this.mealy = new Mealy();
			
		}
		
	}
	
	/**
	 * Método que agrega un estado con dos entradas a una máquina Moore
	 * @param miEstado. Estado a agregar
	 */
	public void agregarDosMoore(Estado miEstado) {

			
			moore.agregarDos(miEstado);

		
	}
	
	
	/**
	 * Método que agrega un estado con tres entradas a una máquina Moore
	 * @param miEstado. Estado a agregar
	 */
	public void agregarTresMoore(Estado miEstado) {

		
		moore.agregarTres(miEstado);

	
	}
	
	/**
	 * Método que agrega un estado con dos entradas a una máquina Mealy
	 * @param miEstado. Estado a agregar
	 */
	public void agregarDosMealy(Estado miEstado) {

		
		mealy.agregarDos(miEstado);

	
	}

	/**
	 * Método que agrega un estado con tres entradas a una máquina Mealy
	 * @param miEstado. Estado a agregar
	 */
	public void agregarTresMealy(Estado miEstado) {

	
		mealy.agregarTres(miEstado);


	}
	
	/**
	 * Método que calcula un autómata mínimo equivalente, de tipo Moore, con dos entradas
	 * @return Arreglo con el autómata mínimo equivalente calculado
	 */
	public ArrayList<Estado> calcularMinMooreDos() {
		
		
		ArrayList<ArrayList<Estado>> fin = moore.reducirDos();
		ArrayList<Estado> estados = new ArrayList<Estado>();
		ArrayList<String> estadosTxt = new ArrayList<String>();
		
		for(int i=0; i<fin.size(); i++) {
			
			String st = "";
			for(int j = 0; j< fin.get(i).size(); j++) {
				
				st += fin.get(i).get(j).getEstado();
				estados.add(fin.get(i).get(j));
				
			}
			
			estadosTxt.add(st);
			st = "";
			
		}
		
		ArrayList<Estado> fin2 = new ArrayList<Estado>();
		
		for(int i=0; i<estados.size(); i++) {
			
			String es1 = "";
			String es2 = "";
			String es3 = "";
			
			for(int j=0; j<estadosTxt.size(); j++) {
				
				if(estadosTxt.get(j).contains(estados.get(i).getEstado())) {
					
					es1 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getEntrada0())) {
					
					es2 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getEntrada1())) {
					
					es3 = estadosTxt.get(j);
					
				}
				
			}
			
			Estado estado = new Estado(es1,es2,es3, estados.get(i).getSalida());
			boolean esta = false;
			
			for(int j = 0; j<fin2.size(); j++) {
				
				if(fin2.get(j).getEstado().equals(estado.getEstado())) {
					
					esta = true;
					
				}
				
			}
			
			if(!esta) {
				
				fin2.add(estado);
				
			}
			
		}
		
		for(int i=0; i<fin2.size(); i++) {
			
			System.out.println(fin2.get(i).getEstado());
			
		}
		
		return fin2;
		
	}
	
	/**
	 * Método que calcula un autómata mínimo equivalente, de tipo Moore, con tres entradas
	 * @return Arreglo con el autómata mínimo equivalente calculado
	 */
	public ArrayList<Estado> calcularMinMooreTres() {
		
		
		ArrayList<ArrayList<Estado>> fin = moore.reducirTres();
		ArrayList<Estado> estados = new ArrayList<Estado>();
		ArrayList<String> estadosTxt = new ArrayList<String>();
		
		for(int i=0; i<fin.size(); i++) {
			
			String st = "";
			for(int j = 0; j< fin.get(i).size(); j++) {
				
				st += fin.get(i).get(j).getEstado();
				estados.add(fin.get(i).get(j));
				
			}
			
			estadosTxt.add(st);
			st = "";
			
		}
		
		ArrayList<Estado> fin2 = new ArrayList<Estado>();
		
		for(int i=0; i<estados.size(); i++) {
			
			String es1 = "";
			String es2 = "";
			String es3 = "";
			String es4 = "";
			
			for(int j=0; j<estadosTxt.size(); j++) {
				
				if(estadosTxt.get(j).contains(estados.get(i).getEstado())) {
					
					es1 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getEntrada0())) {
					
					es2 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getSalida0())) {
					
					es3 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getEntrada1())) {
					
					es4 = estadosTxt.get(j);
					
				}
				
				
			}
			
			Estado estado = new Estado(es1,es2,es3,es4, estados.get(i).getSalida1());
			boolean esta = false;
			
			for(int j = 0; j<fin2.size(); j++) {
				
				if(fin2.get(j).getEstado().equals(estado.getEstado())) {
					
					esta = true;
					
				}
				
			}
			
			if(!esta) {
				
				fin2.add(estado);
				
			}
			
		}
		
		for(int i=0; i<fin2.size(); i++) {
			
			System.out.println(fin2.get(i).getEstado());
			
		}
		return fin2;

		
	}
	
	/**
	 * Método que calcula un autómata mínimo equivalente, de tipo Mealy, con dos entradas
	 * @return Arreglo con el autómata mínimo equivalente calculado
	 */
	public ArrayList<Estado> calcularMinMealyDos() {
		
		ArrayList<ArrayList<Estado>> fin = mealy.reducirDos();
		ArrayList<Estado> estados = new ArrayList<Estado>();
		ArrayList<String> estadosTxt = new ArrayList<String>();
		
		for(int i=0; i<fin.size(); i++) {
			
			String st = "";
			for(int j = 0; j< fin.get(i).size(); j++) {
				
				st += fin.get(i).get(j).getEstado();
				estados.add(fin.get(i).get(j));
				
			}
			
			estadosTxt.add(st);
			st = "";
			
		}
		
		ArrayList<Estado> fin2 = new ArrayList<Estado>();
		
		for(int i=0; i<estados.size(); i++) {
			
			String es1 = "";
			String es2 = "";
			String es3 = "";
			
			for(int j=0; j<estadosTxt.size(); j++) {
				
				if(estadosTxt.get(j).contains(estados.get(i).getEstado())) {
					
					es1 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getEntrada0())) {
					
					es2 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getEntrada1())) {
					
					es3 = estadosTxt.get(j);
					
				}
				
			}
			
			Estado estado = new Estado(es1,es1,estados.get(i).getSalida0(),es2,estados.get(i).getSalida1(),es3, estados.get(i).getSalida1());
			boolean esta = false;
			
			for(int j = 0; j<fin2.size(); j++) {
				
				if(fin2.get(j).getEstado().equals(estado.getEstado())) {
					
					esta = true;
					
				}
				
			}
			
			if(!esta) {
				
				fin2.add(estado);
				
			}
			
		}
		
		for(int i=0; i<fin2.size(); i++) {
			
			System.out.println(fin2.get(i).getEstado());
			
		}
		
		return fin2;
		
		
		
		
	}
	
	/**
	 * Método que calcula un autómata mínimo equivalente, de tipo Mealy, con tres entradas
	 * @return Arreglo con el autómata mínimo equivalente calculado
	 */
	public ArrayList<Estado> calcularMinMealyTres() {
		
		ArrayList<ArrayList<Estado>> fin = mealy.reducirTres();
		ArrayList<Estado> estados = new ArrayList<Estado>();
		ArrayList<String> estadosTxt = new ArrayList<String>();
		
		for(int i=0; i<fin.size(); i++) {
			
			String st = "";
			for(int j = 0; j< fin.get(i).size(); j++) {
				
				st += fin.get(i).get(j).getEstado();
				estados.add(fin.get(i).get(j));
				
			}
			
			estadosTxt.add(st);
			st = "";
			
		}
		
		ArrayList<Estado> fin2 = new ArrayList<Estado>();
		
		for(int i=0; i<estados.size(); i++) {
			
			String es1 = "";
			String es2 = "";
			String es3 = "";
			String es4 = "";
			
			for(int j=0; j<estadosTxt.size(); j++) {
				
				if(estadosTxt.get(j).contains(estados.get(i).getEstado())) {
					
					es1 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getEntrada0())) {
					
					es2 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getEntrada1())) {
					
					es3 = estadosTxt.get(j);
					
				}
				
				if(estadosTxt.get(j).contains(estados.get(i).getEntrada2())) {
					
					es4 = estadosTxt.get(j);
					
				}
				
			}
			
			Estado estado = new Estado(es1,es2,estados.get(i).getSalida0(),es3,estados.get(i).getSalida1(),es4, estados.get(i).getSalida2());
			boolean esta = false;
			
			for(int j = 0; j<fin2.size(); j++) {
				
				if(fin2.get(j).getEstado().equals(estado.getEstado())) {
					
					esta = true;
					
				}
				
			}
			
			if(!esta) {
				
				fin2.add(estado);
				
			}
			
		}
		
		for(int i=0; i<fin2.size(); i++) {
			
			System.out.println(fin2.get(i).getEstado());
			
		}
		
		return fin2;
		
	}
	
	/**
	 * Método que limpia todos los arreglos de elementos agregados en una máquina Mealy
	 */
	public void limpiarMealy() {
		
		mealy.limpiarMealy();
		
	}
	
	/**
	 * Método que limpia todos los arreglos de elementos agregados en una máquina Moore
	 */
	public void limpiarMoore() {
		
		moore.limpiarMoore();	
		
	}
	
	

}
