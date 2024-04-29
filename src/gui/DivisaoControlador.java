package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Restricoes;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entidades.CalculadoraComum;
// Essa classe é o controlador da da view(tela) que efetua o cálculo de divisão 
public class DivisaoControlador implements Initializable{/*possibilita a classe executar uma
	função antes mesmo do programa surgir na tela do computador*/

	@FXML
	private Button btDividir; /* botão da tela chamado dividir*/
	
	public void onBtDividirAction() { /*chama método dividir da calculadora comum */

		labelResultado.setText(String.format("%.2f", CalculadoraComum.dividir(txtValor1.getText(), txtValor2.getText())));
	}
	
	@FXML
	private TextField txtValor1; /* campo de texto chamado txtValor1*/
	
	@FXML
	private TextField txtValor2; /* campo de texto chamado txtValor2*/
	
	@FXML
	private Label labelResultado; /* Campo onde será mostrado o resultado */
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { /* método realizado assim
	que inicia a aplicação*/
		
		Restricoes.setTextFieldDouble(txtValor1); // aplica restricao
		Restricoes.setTextFieldDouble(txtValor2); // aplica restricao
		
	}

}
