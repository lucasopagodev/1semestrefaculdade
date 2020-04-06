package negocio;

public class Passageiro extends Pessoa {
	//Propriedades da Classe
	private String cartaoCredito = "";

	//Métodos Construtores
	public Passageiro() {
		super();
	}

	public Passageiro(String nome, String endereco, String telefone, String cpf, String cartaoCredito) {
		super(nome, endereco, telefone, cpf);
		this.cartaoCredito = cartaoCredito;
	}

	//Métodos GET/SET
	public String getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(String cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
	

}
