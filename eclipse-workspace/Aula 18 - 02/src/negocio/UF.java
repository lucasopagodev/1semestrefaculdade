package negocio;

public class UF {
	private String uf = "";
	private String descricao = "";
	
	public UF() {
		super();
	}
	
	public UF(String uf, String descricao) {
		super();
		this.uf = uf;
		this.descricao = descricao;
	}
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
