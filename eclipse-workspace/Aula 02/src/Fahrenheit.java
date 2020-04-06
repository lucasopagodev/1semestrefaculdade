import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fahrenheit {
	public static void main (String args []) throws Exception {
	double celcius = 0;
	double fahrenheit = 0;
	String leitor = "";
	
	System.out.print("Digite a temperatura em Celcius: ");
	leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
	celcius = Double.parseDouble(leitor);
	
	fahrenheit = (celcius/5 * 9) + 32;
	
	System.out.println("O resultado em Fahrenheit e: " + fahrenheit);
	}
}
