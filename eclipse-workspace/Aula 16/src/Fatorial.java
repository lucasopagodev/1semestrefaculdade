import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fatorial {
		static int fatorial (int x) {
			int retorno = 0;
			
			if (x == 1) {
				retorno = 1;
			}else {
				retorno = x * fatorial(x - 1);
			}
			return retorno;
		}

	public static void main (String args []) throws Exception {
		// Declaração de variaveis
		int x = 0;
		double resultado = 1;
		String leitor = "";
		
		// Entrada de dados 
		System.out.print("Digite um numero: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		x = Integer.parseInt(leitor);
		
		//Processamento 
		resultado = fatorial (x);
		
		//Saida de Dados
		System.out.println(x + "! = " + resultado);
		
	}
}
