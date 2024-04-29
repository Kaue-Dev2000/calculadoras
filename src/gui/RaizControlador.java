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


public class RaizControlador implements Initializable{/*possibilita a classe executar uma
	função antes mesmo do programa surgir na tela do computador*/
	
	@FXML
	private Button btCalcularRaiz; /* botão da tela chamado CalularRaiz*/
	
	public void onBtCalcularRaiz() {/*chama método raiz da calculadora comum */
		
		labelResultado.setText(String.format("%.2f", CalculadoraComum.raiz(txtRadical.getText(), txtIndice.getText())));
	}
	
	@FXML
	private TextField txtRadical; /* campo de texto chamado txtRadical*/
	
	@FXML
	private TextField txtIndice; /* campo de texto chamado txtIndice*/
	
	@FXML
	private Label labelResultado; /* Campo onde será mostrado o resultado */
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { /* método realizado assim
		que inicia a aplicação*/
		
		Restricoes.setTextFieldDouble(txtRadical); // aplica restricao
		Restricoes.setTextFieldDouble(txtIndice); // aplica restricao
		
	}

}
