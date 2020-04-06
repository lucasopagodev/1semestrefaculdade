import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Volume {
	public static void main (String args[]) throws Exception {
		double a = 0;
		double b = 0;
		double c = 0;
		double resultado = 0;
		String leitor = "";
		
		System.out.print("Digite a primeira aresta: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		a = Double.parseDouble(leitor);
		
		System.out.print("Digite a primeira aresta: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		b = Double.parseDouble(leitor);

		System.out.print("Digite a primeira aresta: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		c = Double.parseDouble(leitor);
		
		resultado = a * b * c;
		System.out.println(resultado);
	}
}
