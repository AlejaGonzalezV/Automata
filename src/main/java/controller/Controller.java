package controller;


import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Estado;
import model.Maquina;
/**
 * Clase Controller
 * @author Alejandra González Vélez
 * Clase encargada de controlar la vista de usuario
 */
public class Controller implements Initializable{

		private Maquina maquinaMoore = new Maquina("1");
		private Maquina maquinaMealy = new Maquina("2");
	
		
	    @FXML
	    private TableColumn<Estado, String> ent2MealyDos2;

	    @FXML
	    private TableColumn<Estado, String> ent2MealyDos1;
	    
	    @FXML
	    private TableColumn<Estado, String> ent1MealyDos2;

	    @FXML
	    private TableColumn<Estado, String> ent1MealyDos1;
		
	 	@FXML
	    private TableColumn<Estado, String> colSal1MealyDos2;

	    @FXML
	    private TableColumn<Estado, String> colSal1MealyDos1;

	    @FXML
	    private TableColumn<Estado, String> col2MooreTr2;

	    @FXML
	    private TableColumn<Estado, String> col2MooreTr1;

	    @FXML
	    private Button limpiarMealyDos;

	    @FXML
	    private TableView<Estado> tab1MooreBin;

	    @FXML
	    private Button calcularMooreDos;

	    @FXML
	    private Button limpiarMooreTr;

	    @FXML
	    private Button calcularMooreTr;

	    @FXML
	    private Button agregarMealyDos;

	    @FXML
	    private TableView<Estado> tab2MealyBin;

	    @FXML
	    private TableColumn<Estado, String> estadoMooreDos1;
	    
	    @FXML
	    private TableColumn<Estado, String> colEnt2MooreDos2;

	    @FXML
	    private TextField est2MealyDosTxt;

	    @FXML
	    private TextField est1MooreDos;

	    @FXML
	    private TextField sal1MealyDosTxt;

	    @FXML
	    private TableColumn<Estado, String> estadoMooreTr1;

	    @FXML
	    private TextField ent1MooreTrTxt;

	    @FXML
	    private TableColumn<Estado, String> estadoMealyDos1;

	    @FXML
	    private TableView<Estado> tab1MooreOt;

	    @FXML
	    private TableView<Estado> tab2MooreOt;

	    @FXML
	    private TableColumn<Estado, String> estadoMooreDos2;

	    @FXML
	    private TableColumn<Estado, String> estadoMooreTr2;

	    @FXML
	    private TextField est1MealyTrTxt;

	    @FXML
	    private TableColumn<Estado, String> colSalMooreDos1;

	    @FXML
	    private Button calcularMealyTr;

	    @FXML
	    private TextField estMooreTrTxt;

	    @FXML
	    private TableColumn<Estado, String> colSalMooreDos2;

	    @FXML
	    private Button agregarMooreDos;

	    @FXML
	    private Button limpiarMealyTr;

	    @FXML
	    private TextField est3MealyTrTxt;

	    @FXML
	    private Button agregarMealyTr;

	    @FXML
	    private TableColumn<Estado, String> estadoMealyBin2;

	    @FXML
	    private TableColumn<Estado, String> colSal1MealyTr1;

	    @FXML
	    private TextField sal3MealyTrTxt;

	    @FXML
	    private TableColumn<Estado, String> colSal1MealyTr2;

	    @FXML
	    private TableColumn<Estado, String> colEnt2MealyTr1;

	    @FXML
	    private TableColumn<Estado, String> colSal2MealyDos1;

	    @FXML
	    private TableColumn<Estado, String> colEnt2MealyTr2;

	    @FXML
	    private TableColumn<Estado, String> colSal2MealyDos2;

	    @FXML
	    private TableColumn<Estado, String> ent3MealyOt1;

	    @FXML
	    private TableColumn<Estado, String> colSal3MealyTr2;

	    @FXML
	    private TableColumn<Estado, String> colSal3MealyTr1;

	    @FXML
	    private TableColumn<Estado, String> ent3MealyOt2;
	    

	    @FXML
	    private TextField est1MealyDosTxt;

	    @FXML
	    private TableColumn<Estado, String> ent1MealyOt2;

	    @FXML
	    private TableColumn<Estado, String> ent1MealyOt1;

	    @FXML
	    private TableColumn<Estado, String> colEnt1MealyDos1;

	    @FXML
	    private TableColumn<Estado, String> colEnt1MealyDos2;

	    @FXML
	    private TableView<Estado> tab2MooreBin;

	    @FXML
	    private TextField ent3MooreTrTxt;

	    @FXML
	    private Button calcularMealyDos;

	    @FXML
	    private TableColumn<Estado, String> col3MooreTr1;

	    @FXML
	    private TableColumn<Estado, String> col3MooreTr2;

	    @FXML
	    private Button limpiarMooreDos;

	    @FXML
	    private TextField est2MooreDos;

	    @FXML
	    private TableColumn<Estado, String> colEnt1MooreDos2;

	    @FXML
	    private TableColumn<Estado, String> colEnt1MooreDos1;

	    @FXML
	    private TextField sal1MealyTrTxt;

	    @FXML
	    private TextField SalidaMooreTrTxt;

	    @FXML
	    private TableView<Estado> tab1MealyOt;

	    @FXML
	    private TableView<Estado> tab2MealyOt;

	    @FXML
	    private TableColumn<Estado, String> colEnt2MealyDos2;

	    @FXML
	    private TableColumn<Estado, String> colEnt2MealyDos1;

	    @FXML
	    private TextField estMealyDosTxt;
	    
	    @FXML
	    private TextField estMealyTrTxt;

	    @FXML
	    private TableColumn<Estado, String> estadoMealyOt2;

	    @FXML
	    private TableColumn<Estado, String> estadoMealyOt1;

	    @FXML
	    private TextField estMooreDos;

	    @FXML
	    private TextField ent2MooreTrTxt;

	    @FXML
	    private TextField sal2MealyTrTxt;

	    @FXML
	    private Button agregarMooreTr;

	    @FXML
	    private TableView<Estado> tab1MealyBin;

	    @FXML
	    private TableColumn<Estado, String> colEnt1MealyTr1;

	    @FXML
	    private TableColumn<Estado, String> colSal2MealyTr1;

	    @FXML
	    private TableColumn<Estado, String> colEnt1MealyTr2;

	    @FXML
	    private TableColumn<Estado, String> colSal2MealyTr2;

	    @FXML
	    private TextField est2MealyTrTxt;

	    @FXML
	    private TextField sal2MealyDosTxt;

	    @FXML
	    private TextField salMooreDos;

	    @FXML
	    private TableColumn<Estado, String> col1MooreTr2;

	    @FXML
	    private TableColumn<Estado, String> col1MooreTr1;

	    @FXML
	    private TableColumn<Estado, String> colEnt3MealyTr3;

	    @FXML
	    private TableColumn<Estado, String> ent2MealyOt1;

	    @FXML
	    private TableColumn<Estado, String> colEnt2MooreDos1;

	    @FXML
	    private TableColumn<Estado, String> colSalMooreTr1;

	    @FXML
	    private TableColumn<Estado, String> colEnt3MealyTr1;

	    @FXML
	    private TableColumn<Estado, String> ent2MealyOt2;

	    @FXML
	    private TableColumn<Estado, String> colSalMooreTr2;

	    
	    
	    /**
	     * Método que añade un estado a una máquina mealy de dos salidas
	     * @param event
	     */
	    @FXML
	    void addMealyDos(ActionEvent event) {
	    
	    	
	    	String estado = estMealyDosTxt.getText();
	    	String entrada0 = est1MealyDosTxt.getText();
	    	String salida0 = sal1MealyDosTxt.getText();
	    	String entrada1 = est2MealyDosTxt.getText();
	    	String salida1 = sal2MealyDosTxt.getText();
	 	
	    	Estado est = new Estado(estado,entrada0,salida0,entrada1,salida1);
	    	
	    	maquinaMealy.agregarDosMealy(est);
	    	

	    	tab1MealyBin.getItems().addAll(est);
	    	

	    	estMealyDosTxt.clear();
	    	est1MealyDosTxt.clear();
	    	sal1MealyDosTxt.clear();
	    	est2MealyDosTxt.clear();
	    	sal2MealyDosTxt.clear();


	    }

	    /**
	     * Método que calcula el autómata mínimo equivalente para un autómata mealy de dos entradas
	     * @param event
	     */
	    @FXML
	    void calcMealyDos(ActionEvent event) {
	    	

	    	ArrayList<Estado> resultado = new ArrayList<Estado>();
	    	resultado = maquinaMealy.calcularMinMealyDos();
	    	
	    	for(int i=0; i<resultado.size(); i++) {
	    		
	    		Estado es = resultado.get(i);
	    		tab2MealyBin.getItems().addAll(es);
	    		
	
	    	}
	    	
	    }

	    
	    /**
	     * Método que limpia las tablas de un autómata mealy de dos entradas
	     * @param event
	     */
	    @FXML
	    void LimpMealyDos(ActionEvent event) {
	    	
	    	
	    	tab1MealyBin.getItems().clear();
	    	tab2MealyBin.getItems().clear();
	    	maquinaMealy.limpiarMealy();
	 
	    }

	    
	    /**
	     * Método que añade un estado a un autómata mealy de tres entradas
	     * @param event
	     */
	    @FXML
	    void addMealyTr(ActionEvent event) {
	    	
	    
	    	
	    	String estado = estMealyTrTxt.getText();
	    	String entrada0 = est1MealyTrTxt.getText();
	    	String salida0 = sal1MealyTrTxt.getText();
	    	String entrada1 = est2MealyTrTxt.getText();
	    	String salida1 = sal2MealyTrTxt.getText();
	    	String entrada2 = est3MealyTrTxt.getText();
	    	String salida2 = sal3MealyTrTxt.getText();
	 	
	    	Estado est = new Estado(estado,entrada0,salida0,entrada1,salida1,entrada2,salida2);
	    	
	    	maquinaMealy.agregarTresMealy(est);

	    	tab1MealyOt.getItems().addAll(est);

	    	estMealyTrTxt.clear();
	    	est1MealyTrTxt.clear();
	    	sal1MealyTrTxt.clear();
	    	est2MealyTrTxt.clear();
	    	sal2MealyTrTxt.clear();
	    	est3MealyTrTxt.clear();
	    	sal3MealyTrTxt.clear();

	    }

	    /**
	     * Método que calcula el autómata mínimo equivalente para un autómata mealy de tres entradas
	     * @param event
	     */
	    @FXML
	    void calcMealyTr(ActionEvent event) {


	    	ArrayList<Estado> resultado = new ArrayList<Estado>();
	    	resultado = maquinaMealy.calcularMinMealyTres();
	    	
	    	for(int i=0; i<resultado.size(); i++) {
	    		
	    		Estado es = resultado.get(i);
	    		tab2MealyOt.getItems().addAll(es);
	
	    	}
	    	
	    }

	    /**
	     * Método que limpia las tablas para un autómata mealy de tres entradas
	     * @param event
	     */
	    @FXML
	    void limpMealyTr(ActionEvent event) {
	    	
	    	tab1MealyOt.getItems().clear();
	    	tab2MealyOt.getItems().clear();
	    	maquinaMealy.limpiarMealy();

	    }

	    /**
	     * Método que añade un estado a un autómata moore de dos entradas
	     * @param event
	     */
	    @FXML
	    void addMooreDos(ActionEvent event) {

	    	
	    	String estado = estMooreDos.getText();
	    	String estado0 = est1MooreDos.getText();
	    	String estado1 = est2MooreDos.getText();
	    	String salida = salMooreDos.getText();
	 	
	    	Estado est = new Estado(estado,estado0,estado1,salida);
	    	
	    	maquinaMoore.agregarDosMoore(est);

	    	tab1MooreBin.getItems().addAll(est);

	    	estMooreDos.clear();
	    	est1MooreDos.clear();
	    	est2MooreDos.clear();
	    	salMooreDos.clear();
	    	
	    }

	    /**
	     * Método que calcula el autómata mínimo equivalente de un autómata moore de dos entradas
	     * @param event
	     */
	    @FXML
	    void calcMooreDos(ActionEvent event) {

	    	ArrayList<Estado> resultado = new ArrayList<Estado>();
	    	resultado = maquinaMoore.calcularMinMooreDos();
	    	
	    	for(int i=0; i<resultado.size(); i++) {
	    		
	    		Estado es = resultado.get(i);
	    		tab2MooreBin.getItems().addAll(es);
	    		
	
	    	}

	    }

	    /**
	     * Método que limpia las tablas de un autómata moore de dos entradas
	     * @param event
	     */
	    @FXML
	    void limpMooreDos(ActionEvent event) {

	    	tab1MooreBin.getItems().clear();   
	    	tab2MooreBin.getItems().clear();
	    	maquinaMoore.limpiarMoore();

	    	
	    }

	    /**
	     * Método que agrega un estado a un autómata moore de tres entradas
	     * @param event
	     */
	    @FXML
	    void addMooreTr(ActionEvent event) {
	    	
	    	
	    	
	    	String estado = estMooreTrTxt.getText();
	    	String entrada0 = ent1MooreTrTxt.getText();
	    	String salida0 = ent2MooreTrTxt.getText();
	    	String entrada1 = ent3MooreTrTxt.getText();
	    	String salida1 = SalidaMooreTrTxt.getText();
	 	
	    	Estado est = new Estado(estado,entrada0,salida0, entrada1, salida1);
	    	
	    	maquinaMoore.agregarTresMoore(est);

	    	tab1MooreOt.getItems().addAll(est);

	    	estMooreTrTxt.clear();
	    	ent1MooreTrTxt.clear();
	    	ent2MooreTrTxt.clear();
	    	ent3MooreTrTxt.clear();
	    	SalidaMooreTrTxt.clear();

	    }

	    /**
	     * Método que calcula el autómata mínimo equivalente de un autómata moore de tres entradas
	     * @param event
	     */
	    @FXML
	    void calcMooreTr(ActionEvent event) {

	    	
	    	ArrayList<Estado> resultado = new ArrayList<Estado>();
	    	resultado = maquinaMoore.calcularMinMooreTres();
	    	
	    	for(int i=0; i<resultado.size(); i++) {
	    		
	    		Estado es = resultado.get(i);
	    		tab2MooreOt.getItems().addAll(es);
	    		
	
	    	}
	    	
	    }

	    /**
	     * Método que limpia las tablas de un autómata moore de tres entradas
	     * @param event
	     */
	    @FXML
	    void limpMooreTr(ActionEvent event) {
	    	
	    	tab1MooreOt.getItems().clear();
	    	tab2MooreOt.getItems().clear();
	    	maquinaMoore.limpiarMoore();

	    }


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

    	//Moore dos entradas
		estadoMooreDos1.setCellValueFactory(new PropertyValueFactory<Estado, String>("estado"));
    	colEnt1MooreDos1.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada0"));
    	colEnt2MooreDos1.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada1"));
    	colSalMooreDos1.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida"));
    	
    	estadoMooreDos2.setCellValueFactory(new PropertyValueFactory<Estado, String>("Estado"));
    	colEnt1MooreDos2.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada0"));
    	colEnt2MooreDos2.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada1"));
    	colSalMooreDos2.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida"));
		
    	//Moore tres entradas
    	estadoMooreTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("estado"));
    	col1MooreTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada0"));
    	col2MooreTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida0"));
    	col3MooreTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada1"));
    	colSalMooreTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida1"));
    	
    	estadoMooreTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("estado"));
    	col1MooreTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada0"));
    	col2MooreTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida0"));
    	col3MooreTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada1"));
    	colSalMooreTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida1"));
    	
    	//Mealy dos entradas
    	estadoMealyDos1.setCellValueFactory(new PropertyValueFactory<Estado, String>("estado"));
    	colEnt1MealyDos1.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada0"));
    	colSal1MealyDos1.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida0"));
    	colEnt2MealyDos1.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada1"));
    	colSal2MealyDos1.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida1"));
    	
    	estadoMealyBin2.setCellValueFactory(new PropertyValueFactory<Estado, String>("estado"));
    	colEnt1MealyDos2.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada0"));
    	colSal1MealyDos2.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida0"));
    	colEnt2MealyDos2.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada1"));
    	colSal2MealyDos2.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida1"));
    	
    	//Mealy tres entradas
       	estadoMealyOt1.setCellValueFactory(new PropertyValueFactory<Estado, String>("estado"));
    	colEnt1MealyTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada0"));
    	colSal1MealyTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida0"));
    	colEnt2MealyTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada1"));
    	colSal2MealyTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida1"));
    	colEnt3MealyTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada2"));
    	colSal3MealyTr1.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida2"));
    	
    	estadoMealyOt2.setCellValueFactory(new PropertyValueFactory<Estado, String>("estado"));
    	colEnt1MealyTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada0"));
    	colSal1MealyTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida0"));
    	colEnt2MealyTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada1"));
    	colSal2MealyTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida1"));
    	colEnt3MealyTr3.setCellValueFactory(new PropertyValueFactory<Estado, String>("entrada2"));
    	colSal3MealyTr2.setCellValueFactory(new PropertyValueFactory<Estado, String>("salida2"));

    	
	}
	

}
