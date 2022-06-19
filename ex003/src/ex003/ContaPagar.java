package ex003;

public class ContaPagar {
	private SituacaoConta situacaoConta;
	
	public ContaPagar() {
		this.situacaoConta = situacaoConta.PENDENTE;
	}
	
	public SituacaoConta getSituacaoConta() {
		return this.situacaoConta;
	}
}
