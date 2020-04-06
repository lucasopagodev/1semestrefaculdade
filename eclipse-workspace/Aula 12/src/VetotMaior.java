import java.io.BufferedReader;
import java.io.InputStreamReader;

public class VetotMaior {
	public static void main (String arg[]) throws Exception {
		// Declaração de variaveis
		int[] vetorOriginal = new int[10];
		int[] vetorMaior = new int[10];
		String leitor = "";
		int numero = 0;
		int indiceVetorMaior = 0;
		// Entrada de Dados 
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print("Digite a posição " + i +" do vetor: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			vetorOriginal [i] = Integer.parseInt(leitor);
		}
		System.out.print("Digite o numero: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		numero = Integer.parseInt(leitor);
		
		// Processamento 
		for (int i = 0 ; i < 10 ; i++) {
			if (vetorOriginal[i] > numero) {
				vetorMaior[indiceVetorMaior] = vetorOriginal[i];
				indiceVetorMaior++;
			}
		}
		
		// Saida de Dados
		for (int i = 0 ; i < indiceVetorMaior ; i++) {
			System.out.println("Vetor maior: "+ vetorMaior[i]);
		}
	}
}
