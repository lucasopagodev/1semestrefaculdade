
public class OperadoresAritmeticos {
	public static void main(String[] args) {
		// Adição = + | Subtração = - | (Multiplicação = *) | (Divisão = /) | (Resto da Divisão = %)
		
		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3;
		double n4 = (double) 10 / 8;
		double n5 = 10.0 / 8.0;
		
		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println("--------------------------");
		System.out.println(x1);
	}
}
