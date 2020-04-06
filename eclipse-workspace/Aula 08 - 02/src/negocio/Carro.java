package negocio;

public class Carro extends Veiculo {
	private String volumeMotor = "";
	
	public Carro() {
		super();
	}

	public Carro(String chassi, Marca objMarca, String modelo, String cor, int ano, String volumeMotor) {
		super(chassi, objMarca, modelo, cor, ano);
		this.volumeMotor = volumeMotor;
	}

	public String getVolumeMotor() {
		return volumeMotor;
	}

	public void setVolumeMotor(String volumeMotor) {
		this.volumeMotor = volumeMotor;
	}
	
	
}
