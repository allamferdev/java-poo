
public class MatematicaUtil {
	
	public final static double PI = 3.14; 
	
	public static int CalcularFibonacci(int posicao) {
		if(posicao < 2) {
			return posicao;
		}
		return CalcularFibonacci(posicao -1) + CalcularFibonacci(posicao - 2);
	}
	
	public static double CalcularAreaCirculo(double raio) {
		return Math.pow(raio, 2) * PI;
	}
}
