package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import gui.util.Restricoes;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import model.entidades.CalculadoraFinanceira;

public class RendaFixaControlador implements Initializable{/*possibilita a classe executar uma
	função antes mesmo do programa surgir na tela do computador*/

	@FXML
	private Button btSimular; /* botão da tela chamado simular*/

	@FXML
	private TextField txtValorInicialAplicado; /*campo de texto chamado txtValorInicialAplicado*/	
	
	@FXML
	private TextField txtTaxaDeJuros; /* campo de texto chamado txtTaxaDeJuros*/
	
	@FXML
	private TextField txtTempoDeAplicacao; /* campo de texto chamado txtTempoDeAplicacao*/
	
	@FXML
	private Label labelResultado; /* Campo onde será mostrado o resultado */
	
	
	public void onBtSimularAction() {
		double resultado = CalculadoraFinanceira.simularRendaFixa(txtValorInicialAplicado.getText(), txtTaxaDeJuros.getText(), txtTempoDeAplicacao.getText());
		labelResultado.setText(String.format("%.2f", resultado));
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {/* método realizado assim
		que inicia a aplicação*/
		
		Restricoes.setTextFieldDouble(txtValorInicialAplicado);
		Restricoes.setTextFieldDouble(txtTaxaDeJuros);
		Restricoes.setTextFieldDouble(txtTempoDeAplicacao);
		
	}
	
	public void loadView(String endereco) {/* função realizada para que
		outras telas possam ser abertas na mesma cena*/
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(endereco));
			VBox newVBox = loader.load();	
			
			Scene mainScene = Main.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
		}
		catch(IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}


}
