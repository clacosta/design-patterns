import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class TesteAcoes {

	public static void main(String[] args) {
		
		ItemDaNota item1 = new ItemDaNotaBuilder()
				.comNome("item1")
				.comValor(200.0)
				.constroi();
		
		List<AcaoAposGerarNota> listaDeAcoes = Arrays.asList(new EnviadorDeEmail(), new NotaFiscalDao(), new EnviadorDeSms(), new Impressora(), new Multiplicador(2.0));
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(listaDeAcoes)
		.paraEmpresa("CI&T")
		.comCNPJ("12.345.678/0001-12")
		.com(item1)
		.com(new ItemDaNota("item 2", 300.0))
		.com(new ItemDaNota("item 3", 400.0))
		.comObservacoes("observacoes")
		.naData(Calendar.getInstance());
		
//		builder.adicionaAcao(new EnviadorDeEmail());
//		builder.adicionaAcao(new NotaFiscalDao());
//		builder.adicionaAcao(new EnviadorDeSms());
//		builder.adicionaAcao(new Impressora());
//		builder.adicionaAcao(new Multiplicador(2.0));
		
		NotaFiscal nf = builder.constroi();
		
		System.out.println(nf.getValorBruto());
		
	}
	
}
