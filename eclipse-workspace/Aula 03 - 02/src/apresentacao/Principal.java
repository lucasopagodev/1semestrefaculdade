package apresentacao;

import negocio.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Pessoa obj1 = new Pessoa();
		obj1.setNome("Junior");
		obj1.setIdade(42);
		
		System.out.println("O nome do vagabundo é: " + obj1.getNome());
		System.out.println("A idade do vagabundo é: " + obj1.getIdade());
		
		Pessoa obj2 = new Pessoa();
		obj2.setNome("Lucas");
		obj2.setIdade(19);
		
		System.out.println("O nome do outro vagabundo é: " + obj2.getNome());
		System.out.println("A idade do outro vagabundo é: " + obj2.getIdade());
	}
}
