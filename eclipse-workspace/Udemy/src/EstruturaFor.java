import java.util.Scanner;

public class EstruturaFor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quantos n�meros voc� vai digitar: ");
		
		int n = sc.nextInt();
		
		int soma = 0;
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Digite um n�mero: ");
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		sc.close();
		
		/*for (int i=10; i>=0; i--) {
			System.out.println("Tempo: " + i);
		}*/
			
	}
}