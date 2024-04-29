package model.entidades; // pacote model

public class CalculadoraFinanceira extends CalculadoraComum{
	
	protected static String utilidade = "Realizar cálculos de investimentos"; /* Atributo
	da classe estático, isso porque a utilidade de uma calculadora de investimentos é
	uma só e não pode ser alterada: Realizar cálculos de investimentos */

	public CalculadoraFinanceira() { // método construtor
		super();
		
	}


	public static double calcularJuros(String capital,String taxaDeJuro,String tempo) { /* método
	que calcula juros */
		double capital1 = Double.parseDouble(capital); /*converte o capital de String para Double*/
		double taxaDeJuro1 = Double.parseDouble(taxaDeJuro); /* converte a taxaDeJuro de
		String para Double */
		double tempo1 = Double.parseDouble(tempo); /* converte tempo de String para Double */
		double resultado = capital1 * taxaDeJuro1 * tempo1; /*cálculo do juros */
		return resultado; /* retorna o resultado */
	}
	
	public static double simularRendaFixa(String ValorInicial, String taxaJuros, String tempoDeAplicacao) {
		/*método que simula renda fixa*/
		double tempoDeAplicacaoDouble = Double.parseDouble(tempoDeAplicacao); /* converte tempoDeAplicacao de
		String para Double */
		double valorInicialDouble = Double.parseDouble(ValorInicial); /* converte valorInicial de
		String para Double */
		double taxaDeJurosDouble = Double.parseDouble(taxaJuros); /* converte taxaDeJuros de
		String para Double */
		double resultado = valorInicialDouble * (1 + taxaDeJurosDouble); /* Calcula o resultado
		da simulação */
		double resultadoFinal = resultado *  tempoDeAplicacaoDouble; /* Calcula o resultado
		da simulação */
		return resultadoFinal; /* Retorna o resultado */
	}
	
	@Override
	public String toString() {// mostra os dados da instância dessa classe
		return utilidade;
	}
}
