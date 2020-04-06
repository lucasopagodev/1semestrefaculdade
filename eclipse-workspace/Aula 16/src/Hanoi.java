import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hanoi {
	static void hanoi (int numeroDoDisco, String origem, String trabalho, String destino) {
		if (numeroDoDisco > 0) {
			hanoi(numeroDoDisco - 1, origem, destino, trabalho);
			System.out.println("Mandei " + numeroDoDisco + " de " + origem + " para " + destino);
			hanoi(numeroDoDisco - 1, trabalho, origem, destino);
		}
	}
	
public static void main (String args []) throws Exception {
	// Declaração de variaveis
	int numeroDeDiscos = 0;
	String leitor = "";
	
	// Entrada de dados 
	System.out.print("Digite o numero de discos: ");
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	numeroDeDiscos = Integer.parseInt(leitor);
	
	//Processamento 
	hanoi(numeroDeDiscos, "origem", "trabalho", "destino");	
	}
}