import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculoexponencial {
	public static void main (String args []) throws Exception {
		//Declaração de Variavel 
		int b = 0;
		int e = 0;
		double resultado = 1;
		String leitor = "";
		
		//Entrada de dados
		System.out.println("Digite o numero da base: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		b = Integer.parseInt(leitor);
		
		System.out.println("Digite o numero do expoente: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		e = Integer.parseInt(leitor);
		
		//Processamento
		for (int i = 1 ; i <= e ; i++) {
			resultado = resultado * b;
		}
		System.out.println(b + " elevado a " + e + " e igual a " + resultado);
	}
}
