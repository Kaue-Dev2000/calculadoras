package model.entidades;

public class CalculadoraComum { 
	
	protected static String utilidade = "Realizar cálculos básicos"; /* Atributo
	da classe estático, isso porque a utilidade de uma calculadora comum é
	uma só e não pode ser alterada: Realizar cálculos básicos
	este atributo também possui o modificador de acesso protected,
	para que apenas as classes filhas ou do mesmo pacote, tenham acesso ao atributo*/
	
	public CalculadoraComum() { // método construtor
	
	}	

	public String getUtilidade() { /* método getter, para acessar o atributo
		utilidade da maneira certa, invés de acessa-lo diretamente e, assim,
		respeitando o paradigma de encapsulamento*/
		
		return utilidade; // retorna o valor do atributo utilidade
	}

	public static Double somar(String valor1, String valor2) {
		double resultado1 = Double.parseDouble(valor1); /*converte o valor1 de
		String para Double*/
		
		double resultado2 = Double.parseDouble(valor2); /*converte o valor2 de
		String para Double*/
		
		return resultado1 + resultado2; // retorna o resultado final
	}

	public static Double subtrair(String valor1, String valor2) {
		double resultado1 = Double.parseDouble(valor1); /*converte o valor1 de
		String para Double*/
		
		double resultado2 = Double.parseDouble(valor2); /*converte o valor2 de
		String para Double*/
		
		return resultado1 - resultado2; // retorna o resultado final
	}
	
	public static Double multiplicar(String valor1, String valor2) {
		double resultado1 = Double.parseDouble(valor1); /*converte o valor1 de
		String para Double*/
		double resultado2 = Double.parseDouble(valor2); /*converte o valor2 de
		String para Double*/
		return resultado1 * resultado2; // retorna o resultado final
	}

	public static Double dividir(String valor1, String valor2) {
		double resultado1 = Double.parseDouble(valor1); /*converte o valor1 de
		String para Double*/
		double resultado2 = Double.parseDouble(valor2); /*converte o valor2 de
		String para Double*/
		return resultado1 / resultado2; // retorna o resultado final
	}
	
	public static Double raiz(String valor, String raiz) {
		double valor1 = Double.parseDouble(valor); /*converte o valor de
		String para Double*/
		
		double raiz1 = Double.parseDouble(raiz); /*converte a raiz de
		String para Double*/
		
		double resultadoFinal = 0.0; /* declara variável resultadoFinal,
		que será o valor retornado*/
		
		if(raiz1 == 2) { /* verifica se irá calcular raiz quadrada ou raiz cúbica,
		dependendo apenas da escolha do úsuario*/
			resultadoFinal = Math.sqrt(valor1); /* Se o usuário digitar 2,
			o resultadoFinal receberá a raiz quadrada do valor1 */	
		}
		else {
			resultadoFinal = Math.cbrt(valor1); /* Senão,
			o resultadoFinal receberá a raiz cúbica do valor1 */
		}
		
		return resultadoFinal; // retorna o resultadoFinal
	}
	
	@Override
	public String toString() {// mostra os dados da instância dessa classe
		return utilidade;
	}

}
