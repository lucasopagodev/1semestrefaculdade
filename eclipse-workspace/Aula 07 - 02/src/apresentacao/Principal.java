package apresentacao;

import negocio.Funcao;
import negocio.Funcionario;
import negocio.Gerente;

public class Principal {
	public static void main(String[] args) {
		Funcionario obj1 = new Funcionario();
		obj1.setNome("Junior");
		obj1.setObjfuncao(new Funcao("Professor"));
		obj1.setMatricula(95348);
		obj1.setSalario(500.00);
		
		//Eu herdo as estruturas das classe, os valores cada um tem o seu valor
		Gerente obj2 = new Gerente();
		obj2.setNome("Fernando");
		obj2.setObjfuncao(new Funcao("Coordenador"));
		obj2.setMatricula(242424);
		obj2.setSalario(95325.40);
		obj2.setBonus(10000.00);
		
		System.out.println("O nome do vagabundo é: " + obj1.getNome() + " O salario do vagabundo é: " + obj1.getSalario());
		System.out.println("O nome do segundo vagabundo é " + obj2.getNome() + " O salario do vagabundo é: " + obj2.getSalario());
	}
}
