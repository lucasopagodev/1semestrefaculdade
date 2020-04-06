package negocio;

public class Venda {
	//Propriedades da Classe
	private String nome = "";
	private String cpf = "";
	
	
	//Metodos Construtores
	public Venda() {
		super();
	}

	public Venda(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	//Metodos Get/Set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//Metodos da Classe
	public void vender(Estoque objEstoque, Produto objProduto) {
		objEstoque.diminuirQuantidadeDoProduto(objProduto);
	}
	
	
}
