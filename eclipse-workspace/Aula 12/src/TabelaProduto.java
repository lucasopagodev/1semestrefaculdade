import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TabelaProduto {
	public static void main (String args[])throws Exception {
		// Declaração de variaveis
		double[] vetor = new double[100];
		String leitor = "";
		int codigo = 0;
		double valor = 0;
		// Entrada de Dados 
		do {
			System.out.print("Digite o código [1...100]: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			codigo = Integer.parseInt(leitor);
		
			System.out.print("Digite o valor: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			valor = Double.parseDouble(leitor);
			
			System.out.print("Quer continuar <s/n> ?: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			
			vetor[codigo] = valor;
		} while (leitor.equals("s"));
		
		
		// Saida de Dados
		for (int i = 0; i < 100; i++) {
			if(vetor[i]> 0) {
				System.out.println("Produto " + i + "tem valor R$" + vetor[i]);
			}
		}
	}
}
