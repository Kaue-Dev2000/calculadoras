package gui.util;

import javafx.scene.control.Alert; /* este import possibilita a criação do alert */
import javafx.scene.control.Alert.AlertType; /* este import possibilita informar o
tipo de do alert*/ 

public class Alerts {

	public static void showAlert(String titulo, String cabecalho, String conteudo, AlertType tipo
			/*tipo do alert*/) {
		Alert alert = new Alert(tipo); // instãncia um alert, chamado alert
		alert.setTitle(titulo); // insere o título do alert
		alert.setHeaderText(cabecalho); // insere o cabeçalho do alert
		alert.setContentText(conteudo); // insere o conteúdo do alert
		alert.show();// mostra o alert
	}
}