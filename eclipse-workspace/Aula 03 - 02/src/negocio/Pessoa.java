package negocio;

public class Pessoa {
	//Propriedade da classe 
	private String nome = "";
	private int idade = 0;
	
	// Metodo de classe
	public Pessoa() {
		System.out.println("Parabens um objeto foi criado !");
	}
	
	//This é a palavra reservada que representa a auto referencia do objeto
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
