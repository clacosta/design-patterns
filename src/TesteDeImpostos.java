
public class TesteDeImpostos {

	public static void main(String[] args) {
		
		Imposto iss = new ISS();
		Imposto icms = new ICMS();
		Imposto iccc = new ICCC();
		
		Orcamento orcamento = new Orcamento(2000.0);
		
		CalculadorDeImpostos calculadora = new CalculadorDeImpostos();
		
		calculadora.realizaCalculo(orcamento, iss);
		calculadora.realizaCalculo(orcamento, icms);
		calculadora.realizaCalculo(orcamento, iccc);
		
	}
	
}
