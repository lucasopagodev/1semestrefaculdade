package negocio;

import persistencia.BancoDeDados;

public class Livro extends Entidade {
	private String titulo = "";
	private Autor objAutor = null;
	
	public Livro() {
		super();
	}

	public Livro(int id, String titulo, Autor objAutor) {
		super(id);
		this.titulo = titulo;
		this.objAutor = objAutor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Autor getObjAutor() {
		return objAutor;
	}

	public void setObjAutor(Autor objAutor) {
		this.objAutor = objAutor;
	}
	
	public void persistir () throws Exception {
		BancoDeDados objBanco = new BancoDeDados();
		
		objBanco.conectar();
		objBanco.executarInstrucao("INSERT INTO LIVRO (TITULO, IDAUTOR) VALUES ('" + getTitulo() + "', '" + getObjAutor().getId() + "')");
		objBanco.desconectar();
	}
}
