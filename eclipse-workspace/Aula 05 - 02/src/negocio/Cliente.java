package negocio;

public class Cliente {
	//Propriedades da Classe 
	private String cpf = "";
	private String nome = "";
	private String endereco = "";
	private String cartao = "";
	
	//Metodos contrutores da Classe
	public Cliente() {
	}
	
	public Cliente(String cpf, String nome, String endereco, String cartao) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.cartao = cartao;
	}
	//Metodos Get Set da Classe
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCartao() {
		return cartao;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
}
