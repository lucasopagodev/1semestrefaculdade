package negocio;

public class Carrinho {
	//Propriedades da classe
	private Produto[] colecaoProduto = new Produto[10];
	private Cliente objCliente = null;
	private int indice = 0;
	
	//Metodos construtores da classe
	public Carrinho() {
	}
	public Carrinho(Cliente objCliente, Produto[] colecaoProduto) {
		this.colecaoProduto = colecaoProduto;
		this.objCliente = objCliente;
	}
	//Metodos get/set da classe
	public Produto[] getColecaoProduto() {
		return colecaoProduto;
	}
	public void setColecaoProduto(Produto[] colecaoProduto) {
		this.colecaoProduto = colecaoProduto;
	}
	public Cliente getObjCliente() {
		return objCliente;
	}
	public void setObjCliente(Cliente objCliente) {
		this.objCliente = objCliente;
	}
	// Metodos para classe
	public void adicionarProdutoNoCarrinho(Produto objProduto) {
		colecaoProduto[indice] = objProduto;
		indice++;
	}
	public double calcularValorTotal() {
		double retorno = 0;
		for(int i = 0 ; i < indice ; i++) {
			retorno = retorno + colecaoProduto[i].getPreco();
		}
		
		return retorno;
	}
	
	public void listarProdutosDoCarrinho() {
		for(int i = 0 ; i < indice ; i++) {
			System.out.println(colecaoProduto[i].getDescricao() + 
					           " R$ " + colecaoProduto[i].getPreco());
		}
	}
}
