package negocio;

public class Pessoa {
	//Propriedades da Classe
	private String nome = "";
	private String endereco = "";
	private String telefone = "";
	private String cpf = "";
	
	//Métodos Construtores
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String endereco, String telefone, String cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	//Métodos GET/SET
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
