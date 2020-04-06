import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teste01 {
	public static void main(String[] args) throws Exception {
		String leitor = "";
		int a = 0;
		int b = 0;
		int temp = 0;
		
		System.out.print("Me diga o primeiro número: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		a = Integer.parseInt(leitor);
		
		System.out.print("Me diga o segundo numero: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		b = Integer.parseInt(leitor);
		
		System.out.println("Valor A: "+ a +
						   " Valor B: " + b );
		
		System.out.println("==================================================================");
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Valor A: " + a +
						   " Valor B: " + b);
	}
}
