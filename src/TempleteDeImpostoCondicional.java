
abstract class TempleteDeImpostoCondicional extends Imposto {

	public TempleteDeImpostoCondicional(Imposto outroImposto) {
        super(outroImposto);
    }

    public TempleteDeImpostoCondicional() {
    }
	
	@Override
	public final double calcula(Orcamento orcamento) {
		
		if(deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + calculaOutroImposto(orcamento);
		} 
		return minimaTaxacao(orcamento) + calculaOutroImposto(orcamento);
		
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
