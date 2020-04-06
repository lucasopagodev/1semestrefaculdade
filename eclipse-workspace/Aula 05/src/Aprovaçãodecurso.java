import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Aprovaçãodecurso {
	public static void main (String args[]) throws Exception {
		// Declaração de variaveis
		String leitor = "";
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double media = 0;
		double subs = 0;
		
		// Entrada de dados
		System.out.println("Informe a nota da sua 1 prova: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota1 = Double.parseDouble(leitor);
		
		System.out.println("informe a nota da sua 2 prova: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota2 = Double.parseDouble(leitor);
		
		System.out.println("Informe a nota da sua 3 prova: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota3 = Double.parseDouble(leitor);
		
		// Processamento 
		media = (nota1 + nota2 + nota3)/3;
		if (media >= 5) {
			System.out.print("Aprovado!! ME CHAMA PRA BEBER!!");
		}else {
			System.out.print("Reprovado!!");
			System.out.println("Digite a nota da sua prova substitutiva: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			subs = Double.parseDouble(leitor);
			
			if (subs >= 5) {
				System.out.println("Aprovado!!");
			
			}else {
				System.out.print("Reprovado!!");
			}
		}
	}
}
