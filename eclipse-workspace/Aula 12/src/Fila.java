import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fila {
	public static void main(String[] args) throws Exception {
		//Declaração de Variavel
		int [] fila = new int [10];
		String leitor = "";
		int opcao = 0;
		int elemento = 0;
		
		//Entrada de Dados
		do {
			System.out.println("Opções possiveis:");
			System.out.println("(1) Mostrar os elementos da fila");
			System.out.println("(2) Inserir um elemento na fila");
			System.out.println("(3) Sair do programa");
			System.out.print("Digite a opção escolhida:");
			leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			opcao = Integer.parseInt(leitor);
			
			switch (opcao) {
				case 1:
					for (int i = 0 ; i < 10 ; i++) {
						System.out.print(fila[i] + " ");
				}
				System.out.println("");
				
					break;
				case 2:
					System.out.print("Digite o elemento a ser inserido na fila: ");
					leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
					elemento = Integer.parseInt(leitor);
					
					for (int i = (fila.length - 1) ; i > 0 ; i--) {
						fila[i] = fila[i-1];
					}
					fila[0] = elemento;
					
					break;
			}
		}while (opcao != 3);
		System.out.println("Fim do programa!");
	}
}
