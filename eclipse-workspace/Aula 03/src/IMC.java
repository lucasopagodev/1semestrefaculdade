import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IMC {
	public static void main (String arg[]) throws Exception {
		double peso = 0;
		double altura = 0;
		double IMC = 0;
		String leitor = "";
		
		System.out.print("Digite o seu peso: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		peso = Double.parseDouble(leitor);
		
		System.out.print("Digite a sua altura: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		altura = Double.parseDouble(leitor);
		
		IMC = peso/(altura*altura);
		System.out.println("Seu IMC é: " + IMC);
	}
}
