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

public class MainViewControlador implements Initializable {/*possibilita a classe executar uma
	função antes mesmo do programa surgir na tela do computador*/

	@FXML
	private MenuItem menuItemCalculadoraComum; /* Item de menu chamado menuItemCalculadoraComum*/

	@FXML
	private MenuItem menuItemCalculadoraFinanceira; /* Item de menu chamado
	menuItemCalculadoraFinanceira*/

	@FXML
	public void onMenuItemCalculadoraComumAction() {/* abrir outra view ao clicar
		no item de menu */
		loadView("/gui/MainView3.fxml");
	}
	
	@FXML
	public void onMenuItemCalculadoraFinanceiraAction() {/* abrir outra view ao clicar
		no item de menu */
		loadView("/gui/MainView2.fxml");
	}
	

	@Override
	public void initialize(URL uri, ResourceBundle rb) {/* função realizado assim
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
