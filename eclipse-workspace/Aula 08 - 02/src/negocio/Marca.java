package negocio;

public class Marca {
	//Propriedades da Classe
	private String descricao = "";
	private String nacionalidade = "";
	
	public Marca() {
		super();
	}

	public Marca(String descricao, String nacionalidade) {
		super();
		this.descricao = descricao;
		this.nacionalidade = nacionalidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
}
