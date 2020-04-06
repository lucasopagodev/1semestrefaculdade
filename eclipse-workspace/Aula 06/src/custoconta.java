import java.io.BufferedReader;
import java.io.InputStreamReader;

public class custoconta {
	public static void main (String args[]) throws Exception {
		//Variaveis 
		String leitor = "";
		int quantidade = 0;
		double preco = 0;
		double total = 0;
		
		//Entrada
		System.out.println("Diga o preço :");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		quantidade = Integer.parseInt(leitor);
		
		System.out.println("Diga a quantidade:");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		preco = Double.parseDouble(leitor);
		
		//Processamento 
		total = preco * quantidade;
		
		if (quantidade < 11) {
			
		}else if (quantidade < 21){
			total = total * 0.9;
		}else if (quantidade < 31) {
			total = total * 0.8;
		}else {
			total = total * 0.7;
		}
		
		
		//if ((quantidade > 10) && (quantidade <= 20)) {
			//total = total * 0.9;
		//}else if ((quantidade >= 21) && (quantidade <= 30)) {
			//total = total * 0.8;
		//}else if (quantidade >= 31) {
			//total = total * 0.7;
		//}
		
		
		//Saida de dados 
		System.out.println("O valor total de compra é :" + total);
	}
}
