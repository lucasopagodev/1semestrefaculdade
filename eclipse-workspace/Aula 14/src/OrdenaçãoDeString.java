import java.io.BufferedReader;
import java.io.InputStreamReader;
public class OrdenaçãoDeString {
	public static void main(String[] args) throws Exception	{
		//Declaração de Variaveis
		String[] vetor = new String[10];
		
		//Entrada de Dados
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print("Digite a string [" + i + "]: ");
			vetor[i] = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		}
		//Processamento 
		for (int i = 0 ; i < 9 ; i++) { 
			for (int j = (i + 1) ; j < 10 ; j++) {
				if (vetor[j].compareTo(vetor[i]) < 0) {
					String tempo = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = tempo;
 				}
			}
		}
		//Saida de Dados
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(vetor[i]);
		}
	}
}