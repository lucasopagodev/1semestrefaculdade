import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Poligono {
	public static void main (String args[]) throws Exception {
		//Variaveis
		int qtdLado = 0;
		double tamLado = 0;
		double perimetro  = 0;
		double area = 0;
		String leitor = "";
				
		//Entrada de dados
		System.out.println("Informe qualquer número: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		qtdLado = Integer.parseInt(leitor);
				
		System.out.println("Informe outro número: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		tamLado = Double.parseDouble(leitor);
		
		//Processamento
		switch (qtdLado) {
		case 3:
			perimetro = 3 * tamLado;
			area = (tamLado * tamLado * Math.sqrt(3))/ 2;
			break;
		case 4:
			perimetro = 4 * tamLado;
			area = tamLado * tamLado;
			
		}
		
		//Saida
		System.out.println("O perimetro é: " + perimetro + "e a area é :" + area);
		
	}
}
