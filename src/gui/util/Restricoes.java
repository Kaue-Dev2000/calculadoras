package gui.util;

import javafx.scene.control.TextField;

public class Restricoes{

	public static void setTextFieldDouble(TextField txt) { /* é a restrição que,
	ao ser chamada e receber o campo como argumento, avaliará se contém apenas números
	nesse  campo, caso contrário, não deixará esses valores serem adicionados*/
		
		txt.textProperty().addListener((obs, oldValue, newValue) -> {
		    	if (newValue != null && !newValue.matches("\\d*([\\.]\\d*)?")) {/* se
		    		o valores digitados no campo não forem digitos,*/
		    		
                    txt.setText(oldValue);/* o valor antigo será adicionado*/
                }
		    });
	}
}
