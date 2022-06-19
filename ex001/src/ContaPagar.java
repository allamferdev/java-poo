
public class ContaPagar {
	private String descricao;
	private double valor;
	private String dataVencimento;
	
	public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento ) {
		this.descricao = descricao;
		this.valor = valor;
		this.dataVencimento = dataVencimento;
	}
	
	public void Pagar() {
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Valor: " + this.valor);
		System.out.println("Data de Vencimento: " + this.dataVencimento);
	}
}
