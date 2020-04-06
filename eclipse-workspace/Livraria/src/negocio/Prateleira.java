package negocio;

public class Prateleira {
	//Propriedades da classe
	private int numero = 0;
	private String categoria = "";
	
	//Metodos da classe
	public Prateleira (int numero, String categoria) {
		this.numero = numero;
		this.categoria = categoria;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;	
	}
}
