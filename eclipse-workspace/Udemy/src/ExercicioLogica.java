import java.util.Locale;
import java.util.Scanner;

public class ExercicioLogica {
	public static void main(String[] args) {
		//- Exercicio 01 - 
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Me diga um número: ");
		//int n1 = sc.nextInt();
		//System.out.println("Me diga outro número: ");
		//int n2 = sc.nextInt();
		//int resultado = 0;
		//resultado = n1 + n2;
		//System.out.print("Soma = " + resultado);
		//sc.close();
		
		// - Exercicio 02 - 
		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Qual o valor do raio? ");
		//double raio = sc.nextDouble();
		//double area = 0;
		//double pi = 3.14159;
		//area = pi * (raio * raio);
		//System.out.printf("Area = %.4f%n", area);
		//sc.close();
		
		// - Exercicio 03 - 
		//Scanner sc = new Scanner(System.in);
		//int A = sc.nextInt();
		//int B = sc.nextInt();
		//int C = sc.nextInt();
		//int D = sc.nextInt();
		//int diferenca = 0;
		//diferenca = (A * B - C * D);
		//System.out.println("Diferença = " + diferenca);
		//sc.close();
		
		// - Exercicio 04 - 
		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		//int nfuncionario = sc.nextInt();
		//int horastrab = sc.nextInt();
		//double recebhoras = sc.nextDouble();
		//double salario = 0;
		//salario = recebhoras * horastrab;
		//System.out.println("Numero = " + nfuncionario);
		//System.out.printf("Salario = U$ %.2f%n",salario);
		//sc.close();
		
		// - Exercicio 05 - 
		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		//int codigopeca1 = sc.nextInt();
		//int npeca1 = sc.nextInt();
		//double precop1 = sc.nextDouble();
		//int codigopeca2 = sc.nextInt();
		//int npeca2 = sc.nextInt();
		//double precop2 = sc.nextDouble();
		//double total = 0;
		//total = precop1 + precop2;
		//System.out.println("Código da Peça 1: " + codigopeca1);
		//System.out.println("Código da Peça 2: " + codigopeca2);
		//System.out.println("Número da Peça 1: " + npeca1);
		//System.out.println("Número da Peça 2: " + npeca2);
		//System.out.println("------------------------------------------------");
		//System.out.printf("Valor Total a Pagar: R$ %.2f%n",total);
		//sc.close();
		
		// - Exercicio 06 - 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n1a = sc.nextDouble();
		double n2b = sc.nextDouble();
		double n3c = sc.nextDouble();
		double areaT = 0;
		double areaC = 0;
		double areaTr = 0;
		double areaQ = 0;
		double areaR = 0;
		
		areaT = (n1a * n3c) / 2;
		areaC = (n3c * n3c) * 3.14159;
		areaTr = (n1a + n2b) / 2 * n3c;
		areaQ = (n2b * n2b);
		areaR = (n1a * n2b);
		
		System.out.printf("A) Area do triangulo: %.3f%n" ,areaT);
		System.out.printf("B) Area do circulo: %.3f%n" ,areaC);
		System.out.printf("C) Area do trapézio: %.3f%n" ,areaTr);
		System.out.printf("D) Area do quadrado: %.3f%n" ,areaQ);
		System.out.printf("E) Area do retangulo: %.3f%n" ,areaR);
		sc.close();
	}
}
