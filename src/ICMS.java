
public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ICMS() {}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return (orcamento.getValor() * 0.1) + 50.0 + calculaOutroImposto(orcamento);
	}
	
}
