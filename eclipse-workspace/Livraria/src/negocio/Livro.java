package negocio;

public class Livro {
	//Propriedades da classe 
	private String titulo = "";
	private String isbn = "";
	private String editora = "";
	private Autor objAutor = null;
	private Prateleira objPrateleira = null;
	
	//Metodos da classe
	public Livro (String titulo, String isbn, String editora, Autor objAutor, Prateleira objPrateleira) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.editora = editora;
		this.objAutor = objAutor;
		this.objPrateleira = objPrateleira;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public Autor getObjAutor() {
		return objAutor;
	}
	public void setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}
	public Prateleira getObjPrateleira() {
		return objPrateleira;
	}
	public void setObjPrateleira(Prateleira objPrateleira) {
		this.objPrateleira = objPrateleira;
	}
}
