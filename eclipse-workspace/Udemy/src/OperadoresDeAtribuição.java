
public class OperadoresDeAtribuição {

	public static void main(String[] args) {
		// a = 10; - a RECEBE 10
		// a += 2; - a RECEBE a + 2
		// a -= 2; - a RECEBE a - 2 
		// a *= 2; - a RECEBE a * 2
		// a /= 2; - a RECEBE a / 2 
		// a %= 3; - a RECEBE a % 3
		
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("---------------------");
		
		n1 *= 2; // 20
		n2 += n1; // 50
		s += "DEF";
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("--------------------------");
		
		// ++ | a++; ou ++a; | a = a + 1;
		// -- | a--; ou --a; | a = a - 1;
	
		int a = 10;
		int b = ++a;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-------------------");
		
		int a2= 10;
		int b2 = a2++;
		
		System.out.println(a2);
		System.out.println(b2);
	}
}
