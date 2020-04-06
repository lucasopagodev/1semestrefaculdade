import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Salario {
	public static void main (String args []) throws Exception {
		String leitor = "";
		String cargo = "";
		double salarioBase = 0;
		double salarioFinal = 0;
		
		System.out.print("Informe o seu cargo: ");
		cargo = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		
		System.out.print("Informe o salario base: ");
		leitor = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		salarioBase = Double.parseDouble(leitor);
		
		//if (cargo == "Gerente") { // O If tem que abrir uma chaves.
			//salarioFinal = salarioBase * 1.15;
		//} else if (cargo == "Chefe") {
			//salarioFinal = salarioBase * 1.20;
		//} else if (cargo == "Funcionario"); {
			//salarioFinal = salarioBase * 1.25;
		//}
		
		if (cargo.equals("Gerente")) { 
			salarioFinal = salarioBase * 1.15;
			
		} else if (cargo.equals("Chefe")) {
			salarioFinal = salarioBase * 1.20;
			
		} else if (cargo.equals("Funcionario")) {
			salarioFinal = salarioBase * 1.25;
		}
		
		System.out.println("O salario final é: " + salarioFinal);
	}
}
