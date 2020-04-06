import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Mediaaritmetica {
	public static void main (String args[]) throws Exception {
		//Declaração de variaveis
		double nota = 0;
		double media = 0;
		String maisAluno = "";
		String leitor = "";
		int quantidade = 0;
		
		//Entrada de dados 
		do {
			System.out.println("Digite uma nota: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			nota = Double.parseDouble(leitor);
			
			media = media + nota;
			quantidade++;
			
			System.out.println("Você quer colocar mais alunos? <S/N>: ");
			maisAluno = (new BufferedReader(new InputStreamReader(System.in))).readLine().toUpperCase();
			
		}while (maisAluno.equals("S"));
		//Processamento 
		media = media / quantidade;
		
		//Saida de dados
		System.out.println("A média aritmaética das notas dos alunos e: " + media);
	}
}
