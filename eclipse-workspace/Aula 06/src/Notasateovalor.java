import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Notasateovalor {
	public static void main (String args[]) throws Exception {
		//Variaveis 
		String leitor = "";
		int valor = 0;
		int quantidadeMoeda1 = 0;
		int quantidadeNota2 = 0;
		int quantidadeNota5 = 0;
		int quantidadeNota10 = 0;
		int quantidadeNota20 = 0;
		int quantidadeNota50 = 0;
		int quantidadeNota100 = 0;
		int resto = 0;
		
		
		//Entrada 
		System.out.println("Digite um valor :");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		valor = Integer.parseInt(leitor);
		
		//Processamento 
		quantidadeNota100 = valor / 100;
		resto = valor % 100;
		
		quantidadeNota50 = resto / 50;
		resto = resto % 50;
		
		quantidadeNota20 = resto / 20;
		resto = resto % 20;
		
		quantidadeNota10 = resto / 10;
		resto = resto % 10;
		
		quantidadeNota5 = resto / 5;
		resto = resto % 5;
		
		quantidadeNota2 = resto / 2;
		resto = resto % 2;
		
		quantidadeMoeda1 = resto;
		
		
		// Saida de dados
		System.out.println("A quantidade de notas de 100 é: " + quantidadeNota100);
		System.out.println("A quantidade de notas de 50 é: " + quantidadeNota50);
		System.out.println("A quantidade de notas de 20 é: " + quantidadeNota20);
		System.out.println("A quantidade de notas de 10 é: " + quantidadeNota10);
		System.out.println("A quantidade de notas de 5 é: " + quantidadeNota5);
		System.out.println("A quantidade de notas de 2 é: " + quantidadeNota2);
		System.out.println("A quantidade de notas de 1 é: " + quantidadeMoeda1);
	}
}
