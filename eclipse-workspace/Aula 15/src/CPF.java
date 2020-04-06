import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CPF {
	static String lerStringDoTeclado() throws Exception {
		String retorno = "";
		
		retorno = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		return retorno;
	}
	
	static String calcularPrimeiroDigito(String cpf) {
		int temp = 0;
		
		for (int i = 10 ; i > 1 ; i--) {
			temp = temp + (Integer.parseInt("" + cpf.charAt(10 - i)) * i);
		}
		
		temp = temp % 11;
		temp = 11 - temp;
		if(temp == 10) {
			temp = 0;
		}
		
		return "" + temp;
	}
	
	static String calcularSegundoDigito(String cpf) {
		int temp = 0;
		
		for (int i = 11 ; i > 1 ; i--) {
			temp = temp + (Integer.parseInt("" + cpf.charAt(11 - i)) * i);
		}
		
		temp = temp % 11;
		temp = 11 - temp;
		if(temp == 10) {
			temp = 0;
		}
		
		return "" + temp;
	}
	
	public static void main(String[] args)throws Exception {
		//Declaração de Variáveis
		String cpf = "";
		String primeiroDigito = "";
		String segundoDigito = "";
		
		//Entrada de Dados
		System.out.print("Digite o cpf: ");
		cpf = lerStringDoTeclado();
		
		//Processamento 
		primeiroDigito = calcularPrimeiroDigito(cpf);
		segundoDigito = calcularSegundoDigito(cpf + primeiroDigito);
		
		//Saida de Dados 
		System.out.println("O CPF completo é: " + cpf + primeiroDigito + segundoDigito);
	}
}
