
public class Calculosomatorio {
	public static void main (String args[])throws Exception {
		long resultado = 0;
		
		for (int x = 1 ; x <= 100 ; x++) {
			resultado = resultado + ((x * x ) + (3 * x));
		}
		System.out.println("O resultado é: " + resultado);
		
		int x = 1;
		resultado = 0;
		do {
			resultado = resultado + ((x * x) + (3 * x));
			x++;
		}while (x <= 100);
		
		System.out.println("O resultado é: "+ resultado );
		
		x = 1;
		resultado = 0;
		while (x <= 100) {
			resultado = resultado + ((x * x) + (3 * x));
			x++;
		}
		System.out.println("O resultado é: " + resultado);
	}
}
