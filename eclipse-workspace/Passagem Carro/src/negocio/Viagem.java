package negocio;

public class Viagem {
	//Propriedades da Classe
	private Motorista objMotorista = null;
	private Passageiro objPassageiro = null;
	private String coordenadaOrigem = "";
	private String coordenadaDestino = "";
	private double preco = 0;
	
	//Métodos Construtores
	public Viagem() {
		super();
	}
	public Viagem(Motorista objMotorista, Passageiro objPassageiro, String coordenadaOrigem, String coordenadaDestino,
			double preco) {
		super();
		this.objMotorista = objMotorista;
		this.objPassageiro = objPassageiro;
		this.coordenadaOrigem = coordenadaOrigem;
		this.coordenadaDestino = coordenadaDestino;
		this.preco = preco;
	}
	
	//Métodos GET/SET
	public Motorista getObjMotorista() {
		return objMotorista;
	}
	public void setObjMotorista(Motorista objMotorista) {
		this.objMotorista = objMotorista;
	}
	public Passageiro getObjPassageiro() {
		return objPassageiro;
	}
	public void setObjPassageiro(Passageiro objPassageiro) {
		this.objPassageiro = objPassageiro;
	}
	public String getCoordenadaOrigem() {
		return coordenadaOrigem;
	}
	public void setCoordenadaOrigem(String coordenadaOrigem) {
		this.coordenadaOrigem = coordenadaOrigem;
	}
	public String getCoordenadaDestino() {
		return coordenadaDestino;
	}
	public void setCoordenadaDestino(String coordenadaDestino) {
		this.coordenadaDestino = coordenadaDestino;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
