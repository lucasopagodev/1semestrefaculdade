package negocio;

public class Produto {
	private int id = 0;
	private String descricao = "";
	private int quantidade = 0;
	
	//Metodos construtores ( Quick Acess - Generate Constructor using Fields)
	public Produto() {
		super();
	}

	public Produto(int id, String descricao, int quantidade) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	
	//Metodos Get/Set - (Quick Acess - Generate Getters and Setters)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
