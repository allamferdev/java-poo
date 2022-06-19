package heranca;

public class Tecnico extends Pessoa {
	
	public Tecnico(String nome) {
		this.nome = nome;
	}
	
	public void exibirNome() {
		System.out.println("Nome do técnico: " + this.nome);
	}
}
