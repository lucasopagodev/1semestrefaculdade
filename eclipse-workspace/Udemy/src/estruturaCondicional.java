import java.util.Scanner;

public class estruturaCondicional {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter an integer number: ");
		//int n = sc.nextInt();
		
		//if (n % 2 == 0) {
		//	System.out.println("Even!");
		//}else {
		//	System.out.println("Odd!");
		//}
		//sc.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("What time is it?");
		int time = sc.nextInt();
		
		if(time < 12) {
			System.out.println("Good Morning!");
		}else if (time < 18){
			System.out.println("Good Afternoon!");
		}else {
			System.out.println("Good Night!");
		}
		
		
		
		sc.close();
	}
}
