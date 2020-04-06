package negocio;

public class Professor {
	private String nome = "";
	private String titulo = "";
	
	public Professor() {
	}
	public Professor(String nome, String titulo) {
		this.nome = nome;
		this.titulo = titulo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
}
