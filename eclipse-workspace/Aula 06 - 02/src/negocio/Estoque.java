package negocio;

public class Estoque {
	//Propriedades da classe
	private Produto[] colecaoProduto = new Produto[100];
	private int indice = 0;
	
	//Metodos Construtores - Colecao Não Precisa
	//Metodos da Classe
	public void adicionarProdutoNoEstoque(Produto objProduto) {
		if(indice < 100) {
			colecaoProduto[indice] = objProduto;
			indice++;
		}
	}
	public void listarProdutoNoEstoque() {
		for (int i = 0 ; i < indice ; i++) {
			System.out.println(colecaoProduto[i].getDescricao() + " " + colecaoProduto[i].getQuantidade());
		}
	}
	//objProduto - apenas chave de pesquisa
	public void aumentarQuantidadeDoProduto(Produto objProduto, int quantidade) {
		for (int i = 0 ; i < indice ; i++) {
			if (colecaoProduto[i].getId() == objProduto.getId()) {
				colecaoProduto[i].setQuantidade(colecaoProduto[i].getQuantidade() - 1);
			}
		}
	}
	public void diminuirQuantidadeDoProduto(Produto objProduto) {
		for (int i = 0 ; i < indice ; i++) {
			if (colecaoProduto[i].getId() == objProduto.getId()) {
				colecaoProduto[i].setQuantidade(colecaoProduto[i].getQuantidade() - 1);
			}
		}
	}
	
	
	
}
