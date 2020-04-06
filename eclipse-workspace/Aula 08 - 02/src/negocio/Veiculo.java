package negocio;

public class Veiculo {
	private String chassi = "";
	private Marca objMarca = null;
	private String modelo = "";
	private String cor = "";
	private int ano = 0;
	
	public Veiculo() {
		super();
	}

	public Veiculo(String chassi, Marca objMarca, String modelo, String cor, int ano) {
		super();
		this.chassi = chassi;
		this.objMarca = objMarca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public Marca getObjMarca() {
		return objMarca;
	}

	public void setObjMarca(Marca objMarca) {
		this.objMarca = objMarca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void darPartida() {
		System.out.println("Veiculo Ligado!");
	}
}
