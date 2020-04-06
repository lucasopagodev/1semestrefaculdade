package negocio;

public class Sedan extends Carro {
	public void ligarArCondicionado() {
		System.out.println("Ar Condicionado = On");
	}
	
	public Sedan(String chassi, Marca objMarca, String modelo, String cor, int ano, String volumeMotor) {
		super(chassi, objMarca, modelo, cor, ano, volumeMotor);
		
	}
	
	public Sedan() {
	}
}
