import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Segundos {
	public static void main (String arg[]) throws Exception {
		double hora = 0;
		double minutos = 0;
		double segundos = 0;
		double resultado = 0;
		String leitor = "";
		
		System.out.print("Digite uma quantidade de horas: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		hora = Double.parseDouble(leitor);
		
		System.out.print("Digite uma quantidade de minutos: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		minutos = Double.parseDouble(leitor);
		
		System.out.print("Digite uma quantidade de segundos: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		segundos = Double.parseDouble(leitor);
		
		resultado = hora*3600 + minutos*60 + segundos;
		System.out.println("A quantidade de segundos é: " + resultado);
		
	}
}
