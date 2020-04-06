import java.util.Scanner;

public class operadoresBitwise {

	public static void main(String[] args) {
		// Operadores BitWise
		// & = Operação "E" bit a bit
		// | = Operação "OU" bit a bit 
		// ^ = Operação "OU-exclusivo" bit a bit
		
		int n1 = 89;
		int n2 = 60;
		
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		System.out.println("---------------------");
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		
		sc.close();
	}

}
