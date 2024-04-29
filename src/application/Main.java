package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

/* estende a classe Application, então agora o main pode ser a classe onde será executada
	a aplicação JavaFx*/
public class Main extends Application {
	
	
	private static Scene mainScene; /* referência para cena, do modelo MVC,
	que será criada em breve */
	
	
	@Override
	
	public void start(Stage palco) {/* método abstrato da classe Application
	que define o palco do modelo MVC */
		
		try {//tenta executar esse código
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollPane = loader.load();
			
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			mainScene = new Scene(scrollPane); /* Instância a cena */
			palco.setScene(mainScene); /* informa que essa será a cena do palco */
			palco.setTitle("Calculadoras"); /* Título da cena */
			palco.show(); /* mostra na tela do computador o conteúdo do palco */
			
			
		} catch (IOException e) {/* Caso não consiga executar o código acima, mostra o
			StackTrace(conteúdo da exceção - arquivos e linhas onde pode estar o erro do código)*/ 
			e.printStackTrace();
		}
	}
	
	public static Scene getMainScene() { // retorna a cena que foi criada
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);/* método estático de Application, que inicia a aplicação JavaFX  */
	}
}
