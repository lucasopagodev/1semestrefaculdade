import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Votos {
	public static void main (String arg[]) throws Exception {
		double cd1 = 0;
		double cd2 = 0;
		double branco = 0;
		double nulo = 0;
		double resultado = 0;
		double porcento = 0;
		String leitor = "";
		
		System.out.print("Digite a quantidade de votos no primeiro candidato: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		cd1 = Double.parseDouble(leitor);
		
		System.out.print("Digite o numero de votos no segundo candidato: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		cd2 = Double.parseDouble(leitor);
		
		System.out.print("Digite o numero de votos em branco: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		branco = Double.parseDouble(leitor);
		
		System.out.print("Digite o numero de votos em nulo: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nulo = Double.parseDouble(leitor);
		
		resultado = (cd1 + cd2)/cd1 + cd2 + branco + nulo;
		porcento = resultado/100;
		
		System.out.println("A porcentagem de votos validos é " + porcento + "%. ");
				
		
		
	}
}
