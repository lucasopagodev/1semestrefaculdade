package negocio;

public class Fornecedor {
	//Propriedades da classe 
	private String nome = "";
	private String cpf = "";
	
	//Metodos construtores 
	public Fornecedor() {
		super();
	}

	public Fornecedor(String nome, String cpf) {
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
	public void fornecer(Estoque objEstoque, Produto objProduto, int quantidade) {
		objEstoque.aumentarQuantidadeDoProduto(objProduto, quantidade);
	}
	
	
	
	
	
	
	
	
	
	
	
}
