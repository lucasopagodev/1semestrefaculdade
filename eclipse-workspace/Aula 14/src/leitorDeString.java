import java.io.BufferedReader;
import java.io.InputStreamReader;

public class leitorDeString {
	public static void main(String[] args) throws Exception {
		// Declaração de Variavel
		String leitor = "";
		
		// Entrada de Dados 
		System.out.print("Digite um texto: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		// Saida de Dados
		System.out.println("Primeira letra: " + leitor.charAt(0));
		System.out.println("Ultima letra: " + leitor.charAt(leitor.length() - 1));
		System.out.println("Tamanho: " + leitor.length());
	}
}
