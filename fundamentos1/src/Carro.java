
public class Carro {
	String fabricante;
	String modelo;
	String cor;
	int anoDeFabricacao = 0;
	Proprietario dono = new Proprietario();
	
	public void Acelerar() {
		System.out.println("Acelerando o carro");
	}
}
