
public class TrocaVariavel {
	public static void main (String args[]) {
		System.out.println("Hello World !");
		
		int a = 1;
		int b = 2;
		System.out.println("Valor de a:" + a +
				           " Valor de b:" + b);
		int tmp = 0;
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("Valor de a:" + a +
				           " Valor de b:" + b);
	}
}