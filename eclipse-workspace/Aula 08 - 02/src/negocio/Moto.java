package negocio;

public class Moto extends Veiculo {
	private int cilindradas = 0;

	public Moto() {
		super();
	}

	public Moto(String chassi, Marca objMarca, String modelo, String cor, int ano, int cilindradas) {
		super(chassi, objMarca, modelo, cor, ano);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	public void empinar() {
		System.out.println("No graaauu!! ");
	}
}
