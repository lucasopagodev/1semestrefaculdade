package negocio;

public class Motorista extends Pessoa {
	//Propriedades da Classe
	private String habilitacao = "";

	//Métodos Construtores
	public Motorista() {
		super();
	}

	public Motorista(String nome, String endereco, String telefone, String cpf, String habilitacao) {
		super(nome, endereco, telefone, cpf);
		this.habilitacao = habilitacao;
	}

	//Métodos GET/SET
	public String getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}

	
	

}
