package sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {
	protected Date dataValidade = new Date();
	
	public void identificar() {
		super.identificar();
		System.out.println("Data de validade: " + this.dataValidade);
	}
}
