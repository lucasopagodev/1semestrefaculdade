package negocio;

public class Ingrediente {
	// Propriedades da Classe
	private String nome = "";

	// Metodos Contrutores da Classe
	public Ingrediente() {
		super();
	}

	public Ingrediente(String nome) {
		super();
		this.nome = nome;
	}

	// Metodos GET/SET da Classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
