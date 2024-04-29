package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
/*Essa classe é o controlador da view que representa a tela inicial da
Calculadora Comum*/
public class MainView3Controlador implements Initializable {/*possibilita a classe executar uma
	função antes mesmo do programa surgir na tela do computador*/

	@FXML
	private MenuItem menuItemCalculadoraFinanceira;  /* Item de menu chamado 
	menuItemCalculadoraFinanceira*/

	@FXML
	private MenuItem menuItemSoma; /* Item de menu chamado menuItemSoma*/ 

	@FXML
	private MenuItem menuItemSubtracao; /* Item de menu chamado menuItemSubtracao*/

	@FXML
	private MenuItem menuItemMultiplicacao; /* Item de menu chamado menuItemMultiplicacao*/

	@FXML
	private MenuItem menuItemDivisao; /* Item de menu chamado menuItemDivisao*/
	
	@FXML
	private MenuItem menuItemRaiz; /* Item de menu chamado menuItemRaiz*/

	@FXML
	public void onMenuItemSomaAction() {/* abrir outra view ao clicar
		no item de menu */
		loadView("/gui/Soma.fxml");
	}
	
	@FXML
	public void onMenuItemSubtracaoAction() {/* abrir outra view ao clicar
		no item de menu */
		loadView("/gui/Subtracao.fxml");
	}
	
	@FXML
	public void onMenuItemMultiplicacaoAction() {/* abrir outra view ao clicar
		no item de menu */
		loadView("/gui/Multiplicacao.fxml");
	}
	
	@FXML
	public void onMenuItemDivisaoAction() {/* abrir outra view ao clicar
		no item de menu */
		loadView("/gui/Divisao.fxml");
	}
	
	@FXML
	public void onMenuItemCalculadoraFinanceiraAction() {/* abrir outra view ao clicar
		no item de menu */
		loadView("/gui/MainView2.fxml");
	}
	
	@FXML
	public void onMenuItemRaizAction() {/* abrir outra view ao clicar
		no item de menu */
		loadView("/gui/Raiz.fxml");
	}
	

	@Override
	public void initialize(URL uri, ResourceBundle rb) {/* função  realizado assim
		que inicia a aplicação*/

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
