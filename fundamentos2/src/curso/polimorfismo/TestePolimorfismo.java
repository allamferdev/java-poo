package curso.polimorfismo;

public class TestePolimorfismo {
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setSaldo(4000);

		Conta contaCorrente = new ContaCorrente();
		contaCorrente.setSaldo(950);
		
		imprimirSaldo(contaCorrente);
	}
	
	public static void imprimirSaldo(Conta conta) {
		System.out.println("Saldo da conta R$: " + conta.getSaldo());
	}
}
