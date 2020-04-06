import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculofatorial {
	public static void main (String args []) throws Exception {
		// Declaração de variaveis
		int x = 0;
		double resultado = 1;
		String leitor = "";
		
		// Entrada de dados 
		System.out.println("Digite um numero: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		x = Integer.parseInt(leitor);
		
		//Processamento 
		for (int i = 1 ; i <= x ; i++) {
			resultado = resultado * i;
			}
		System.out.println("O calculo do numero " + x + " é igual ao " + resultado);
	}
}
