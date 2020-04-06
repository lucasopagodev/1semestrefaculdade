import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrianguloAsteriscos {
	public static void main (String Args[]) throws Exception {
		String leitor = "";
		int numero = 0;
		
		//Entrada de dados 
		System.out.println("Digite um numero: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		numero = Integer.parseInt(leitor);
		
		//Saida de dados 
		for (int i = 0 ; i < numero ; i++) {
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
