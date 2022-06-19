
public class TesteOperacaoEnum {
	public static void main(String[] args) {
		OperacaoAritimetica o1 = OperacaoAritimetica.SUBTRACAO;
		
		int resultado = o1.operacao(2, 3);
		
		System.out.println(resultado);
	}
}
