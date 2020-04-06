package negocio;

public class Veiculo {
	private String modelo = "";
	private String chassi = "";
	private String cor = "";
	private String ano = "";
	private String observacao = "";
	
	public Veiculo() {
		super();
	}

	public Veiculo(String modelo, String chassi, String cor, String ano, String observacao) {
		super();
		this.modelo = modelo;
		this.chassi = chassi;
		this.cor = cor;
		this.ano = ano;
		this.observacao = observacao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
