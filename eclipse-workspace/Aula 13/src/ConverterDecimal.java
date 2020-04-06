import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConverterDecimal {
	public static void main(String[] args) throws Exception {
		//Declaracao de variaveis
		int[] vetor = new int[1000];
		String leitor = "";
		int tamanhoDoVetor = 0;
		int numero = 0;
		
		
		//Entrada de dados 
		System.out.print("Digite um numero decimal: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		numero = Integer.parseInt(leitor);
		
		//Processamento
		do {
			vetor[tamanhoDoVetor] = numero % 2;
			tamanhoDoVetor++;
			numero = numero / 2;
		}while(numero > 0);
		
		//Saida de Dados 
		for (int i = (tamanhoDoVetor - 1) ; i >= 0 ; i--) {
			System.out.print(vetor[i]);
		}
	}
}