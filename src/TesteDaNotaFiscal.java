import java.util.Calendar;

public class TesteDaNotaFiscal {

	public static void main(String[] args) {
		
		ItemDaNota item1 = new ItemDaNotaBuilder()
				.comNome("item1")
				.comValor(200.0)
				.constroi();
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder()
		.paraEmpresa("CI&T")
		.comCNPJ("12.345.678/0001-12")
		.com(item1)
		.com(new ItemDaNota("item 2", 300.0))
		.com(new ItemDaNota("item 3", 400.0))
		.comObservacoes("observacoes")
		.naData(Calendar.getInstance());
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
	}
	
}
