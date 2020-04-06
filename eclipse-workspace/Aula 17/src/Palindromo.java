import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindromo {
	static boolean saoPalindromos(String primeira, String segunda) {
		boolean retorno = false;
		String temp = "";
		
		for (int i = primeira.length() - 1 ; i >= 0 ; i--) {
			temp = temp + primeira.charAt(i);
		}
	
		retorno = temp.equals(segunda);
		
		return retorno;
	}
	static String lerDoTeclado(String comando) throws Exception {
		String retorno = "";
		
		System.out.print(comando);
		retorno = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		return retorno;
	}
	
	public static void main(String[] args) throws Exception {
		//Declaração de Variaveis 
		String primeira = "";
		String segunda = "";
		boolean palindromo = false;
		
		//Entrada de Dados
		primeira = lerDoTeclado("Digite a primeira String: ");
		segunda = lerDoTeclado("Digite a segunda String: ");
		
		//Processamento
		palindromo = saoPalindromos(primeira, segunda);
		
		//Saida de Dados
		if (palindromo) {
			System.out.println("As Strings são palindromas!");
		}else {
			System.out.println("As Strings não são palindromas!!");
		}
	}	

}
