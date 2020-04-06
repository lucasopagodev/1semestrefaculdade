package negocio;

public class Produto {
	private int codigo = 0;
	private String descricao = "";
	private double preco = 0;
	private Categoria objCategoria = null;
	private boolean perecivel = false;

	public Produto() {
		super();
	}

	public Produto(int codigo, String descricao, double preco, Categoria objCategoria, boolean perecivel) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
		this.objCategoria = objCategoria;
		this.perecivel = perecivel;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getObjCategoria() {
		return objCategoria;
	}

	public void setObjCategoria(Categoria objCategoria) {
		this.objCategoria = objCategoria;
	}

	public boolean isPerecivel() {
		return perecivel;
	}

	public void setPerecivel(boolean perecivel) {
		this.perecivel = perecivel;
	}

}
