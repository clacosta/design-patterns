
public class ICPP extends TempleteDeImpostoCondicional {

     public ICPP(Imposto outroImposto) {
         super(outroImposto);
     }
     
     public ICPP() {}
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

	
}
