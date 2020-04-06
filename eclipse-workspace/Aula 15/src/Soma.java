import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Soma {
	static int somar(int a, int b) {
		return a+b;
	}
	
	static String lerStringDoTeclado() throws Exception {
		String retorno = "";
		
		retorno = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		return retorno;
	}
	
	static int lerIntDoTeclado() throws Exception {
		String temp = "";
		int retorno = 0;
		
		temp = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		retorno = Integer.parseInt(temp);
		
		return retorno;
	}
	
	static double lerDoubleDoTeclado() throws Exception {
		String temp = "";
		double retorno = 0;
		
		temp = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		retorno = Double.parseDouble(temp);
		return retorno;
	}
	
	public static void main(String[] args) throws Exception	{
		//Declaração de Variaveis
		int numero1 = 0;
		int numero2 = 0;
		int resultado = 0;
		
		//Entrada de Dados
		System.out.print("Digite um número: ");
		
		numero1 = lerIntDoTeclado(); 
				
		System.out.print("Digite outro número: ");
		numero2 = lerIntDoTeclado();
		
		//Processamento 
		resultado = somar(numero1, numero2);
		
		//Saida de Dados
		System.out.println("A soma dos dois numeros é " + resultado + ".");
	}
}
