import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Trianguloporaresta {
	public static void main (String args []) throws Exception {
		//variaveis 
		int arestaA = 0;
		int arestaB = 0;
		int arestaC = 0;
		String leitor = "";
		String tipo = "";
		
		//Entrada 
		System.out.println("Digite um valor :");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		arestaA = Integer.parseInt(leitor);
		
		System.out.println("Digite um valor :");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		arestaB = Integer.parseInt(leitor);

		System.out.println("Digite um valor :");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		arestaC= Integer.parseInt(leitor);
		
		//Processamento
		if ((arestaA == arestaB) && (arestaB == arestaC)) {
			tipo = "Equilatero";
		}else if ((arestaA == arestaB) || (arestaA == arestaC) || (arestaB == arestaC)) {
			tipo = "Isoceles";
		}else {
			tipo = "Escaleno";
		}
		//Saida de dados 
		System.out.println("O triangulo é:" + tipo);
	}
}
