
public class TesteDeDescontos {

	public static void main(String[] args) {
		
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("CANETA", 15.00));
		orcamento.adicionaItem(new Item("LAPIS", 15.00));
		orcamento.adicionaItem(new Item("BORRACHA", 15.00));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
		
	}
	
}
