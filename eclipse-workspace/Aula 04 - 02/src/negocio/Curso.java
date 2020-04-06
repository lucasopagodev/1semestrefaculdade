package negocio;

public class Curso {
	private String descricao = "";
	
	public Curso() {
	}
	public Curso(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
