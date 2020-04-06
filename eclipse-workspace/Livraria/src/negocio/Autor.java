package negocio;

public class Autor {
	//Propriedades da classe
	private String nome = "";
	private String nacionalidade = "";
	
	//Metodos da classe
	public Autor (String nome, String nacionalidade) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}
