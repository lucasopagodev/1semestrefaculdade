package negocio;

public class Funcao {
	//Propriedades da Classe
	private String desc = "";
	
	//Metodos Construtores
	public Funcao() {
		super();
	}

	public Funcao(String desc) {
		super();
		this.desc = desc;
	}
	
	//Metodos Get/Set da Classe
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
