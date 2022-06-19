
public class Main {
	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Imbiliaria Rangel");
		
		ContaPagar conta1 = new ContaPagar(imobiliaria, "Compras do Mês", 3005, "19/03/2021");
		
		conta1.Pagar();	
	}
}
