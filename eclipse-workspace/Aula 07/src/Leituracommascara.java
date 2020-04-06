import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Leituracommascara {
	public static void main (String args[])throws Exception {
		int x = 0;
		String leitor = "";
		
		do {
			System.out.println("Digite um numero entre 100 e 180: ");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			x = Integer.parseInt(leitor);
		}while ((x < 100) || (x > 180));
		System.out.print("Obrigado!");
	}
}