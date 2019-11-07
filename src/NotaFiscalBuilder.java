import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorTotal;
	private double impostos;
	private String observacoes;
	private Calendar data;
	private List<AcaoAposGerarNota> todasAsAcoesASeremExecutadas;
	
	public NotaFiscalBuilder() {
        this.data = Calendar.getInstance();
        this.todasAsAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
    }
	
	public void adicionaAcao(AcaoAposGerarNota acao) {
		this.todasAsAcoesASeremExecutadas.add(acao);
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	
	public NotaFiscalBuilder com(ItemDaNota item) {
		todosItens.add(item);
		valorTotal += item.getValor();
		impostos += item.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data) {
		this.data = data;
		return this;
	}
	
	public NotaFiscal constroi() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorTotal, impostos, todosItens, observacoes); 
		
		for (AcaoAposGerarNota acao : todasAsAcoesASeremExecutadas) {
			acao.executa(nf);
		}
		
		return nf;
	}
	
}
