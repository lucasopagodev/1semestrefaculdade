import java.util.Locale;
import java.util.Scanner;

public class Exercicio003 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.println(c);
		
		if (a > b && a > c) {
			System.out.println("Higher = " + a);
		} else if (b > c) {
			System.out.println("Higher = " + b);
		}else {
			System.out.println("Highe = " + c);
		}
		sc.close();
	}
}
