import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) throws Exception {
		// Declaraca de variavel
		int [] vetor = new int[1000];
		
		// Entrada de Dados 
		for (int i = 0 ; i < 1000 ; i++) {
			vetor[i] = new Random().nextInt(1000);
			
		}
		
		for (int i = 0 ; i < 1000 ; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		// Processamento 
		ordenar(vetor);
		
		// Saida de dados
		for (int i = 0 ; i < 1000 ; i++) {
			System.out.print(vetor[i] + " ");
		}
	}
	
	public static void ordenar (int [] vetor) {
		boolean troquei = false;
		
		do {
			troquei = false;
			for (int i = 0 ; i < 999 ; i++) {
				if (vetor[i] > vetor[i+1]) {
					int temp = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = temp;
					
					troquei = true;
				}
			}
		} while (troquei);
	}
}
