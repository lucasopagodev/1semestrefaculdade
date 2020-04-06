import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Somadomenor {
	public static void main (String args[]) throws Exception {
		//Variaveis
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int soma = 0;
		String leitor = "";
		
		//Entrada
		System.out.println("Diga o primeiro número: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		n1 = Integer.parseInt(leitor);
		
		System.out.println("Diga o segundo número: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		n2 = Integer.parseInt(leitor);
		
		System.out.println("Diga o terceiro número: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		n3 = Integer.parseInt(leitor);
		
		//Processamento 
		if (n1 > n2) {
			if(n1 > n3) {
				soma = n2 + n3;
			}else {
				soma = n1 + n2;
			}	
		}else if (n2 > n3) {
			soma = n1 + n3;
		}else {
			soma = n1 + n2;
		}
		
		//Saida 
		System.out.println("A soma dos menores números são " + soma);
	}
}
