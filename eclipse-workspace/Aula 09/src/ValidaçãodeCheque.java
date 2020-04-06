import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ValidaçãodeCheque {
	public static void main (String args []) throws Exception {
		// Declaração de variaveis
		String leitor = "";
		int qtdCheque = 0;
		int numeroCheque = 0;
		double valorCheque = 0;
		int contador = 0;
		
		// Entrada de Dados 
		System.out.print("Digite a quantidade de cheques do lote: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		qtdCheque = Integer.parseInt(leitor);
		
		leitor = "S";
		while (leitor.equals("S")) {
			System.out.print("Digite o número do cheque: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			numeroCheque = Integer.parseInt(leitor);
			
			System.out.print("Digite o valor do cheque: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			valorCheque = valorCheque + Double.parseDouble(leitor);
			
			System.out.print("Tem mais cheque no lote <s/n> ? ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			
			contador++;
		}
		
		//Saída de Dados 
		
		if (qtdCheque != contador) {
			System.out.println("O lote de cheques está errado!!!");
		}else {
			System.out.println("O lote de cheques está certo!!!");
			System.out.println("O valor total dos cheques é: " + valorCheque);
		}
	}
}
