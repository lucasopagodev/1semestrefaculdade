package negocio;

public class Veiculo {
	private String nome = "";
	private String marca = "";
	private String cor = "";
	
	public Veiculo() {
		super();
	}
	
	public Veiculo(String nome, String marca, String cor) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


}
