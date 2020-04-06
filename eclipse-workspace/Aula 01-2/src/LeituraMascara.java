import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeituraMascara {
	public static void main(String[] args) {
		//Declaração de Variavel
		int numero = 0;
		
		//Processamento
		numero = lerNumero();
		
		//Saida de Dados
		System.out.println("O numero digitado foi: " + numero);
		System.out.println("Obrigado!");
	}
	
	public static int lerNumero() {
		//Declaração de Variavel
		String leitor = "";
		int numero = 0;
		boolean continuar = false;
		
		do {
			try {
				//Entrada de Dados
				System.out.print("Digite um número: ");
				leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
				numero = Integer.parseInt(leitor);
				continuar = false;
			}catch (Exception erro) {
				System.out.println("Burrão, não sabe digitar um número, não????");
				continuar = true;
			}
		}while (continuar);
		return numero;
	}

}
