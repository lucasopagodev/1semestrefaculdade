import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Somadosmenores {
	public static void main (String args[]) throws Exception {
		//Variaveis
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int soma = 0;
		String leitor = "";
		
		//Entrada de dados
		System.out.println("Informe qualquer número: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		n1 = Integer.parseInt(leitor);
		
		System.out.println("Informe outro número: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		n2 = Integer.parseInt(leitor);
		
		System.out.println("Informe o último número: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		n3 = Integer.parseInt(leitor);
		
		//Processamento
		//if ((n1 > n2) && (n1 > n3)) {
			//soma = n2 + n3;
		//}else if((n2 > n1) && (n2 > n3)) {
			//soma = n1 + n3;
		//}else if ((n3 > n1) && (n3 > n2)) {	
		//}
		
		if (n1 > n2) {
			if (n1 > n3) {
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
		System.out.println("A soma dos dois menores numeros é: " + soma);
	}
}
