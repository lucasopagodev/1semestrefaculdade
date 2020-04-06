import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrizTransposta {
	public static void main (String args [])throws Exception {
		//Declaração de Variaveis 
		int[][] matrizOriginal = new int [2][3];
		int[][] matrizTransposta = new int [3][2];
		String leitor = "";
		
		// Entrada de Dados
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print("Digite a posição [" + i + ", " + j + "] da matriz: ");
				leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
				matrizOriginal[i][j] = Integer.parseInt(leitor);
			}
		}
		//Processamento
		for(int i = 0 ; i < 2 ; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				matrizTransposta[j][i] = matrizOriginal[i][j];
			}	
		}
		//Saida de Dados
		for(int i = 0 ; i < 3 ; i++) {
			for(int j = 0 ; j < 2 ; j++) {
				System.out.print(matrizTransposta[i][j] + " ");
			}
			System.out.println("");
			
		}
	}
}
