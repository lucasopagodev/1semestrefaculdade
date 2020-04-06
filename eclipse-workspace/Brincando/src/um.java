import java.io.BufferedReader;
import java.io.InputStreamReader;

public class um {
	public static void main (String args[]) throws Exception {
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		String leitor = "";
		
		System.out.print("Digite a primeira nota: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota1 = Double.parseDouble(leitor);

		System.out.print("Digite a segunda nota: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota2 = Double.parseDouble(leitor);

		System.out.print("Digite a terceira nota: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		nota3 = Double.parseDouble(leitor);
		
		System.out.println(nota1);
		System.out.println(nota2);
		System.out.println(nota3);
		System.out.println(nota4);
		System.out.println(media);
	}
}
