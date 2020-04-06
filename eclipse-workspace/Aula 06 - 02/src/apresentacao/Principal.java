package apresentacao;

import negocio.Estoque;
import negocio.Fornecedor;
import negocio.Produto;
import negocio.Venda;

public class Principal {
	public static void main(String[] args) {
		Estoque objEstoque = new Estoque();
		objEstoque.adicionarProdutoNoEstoque(new Produto(1, "Sapato", 0));
		objEstoque.adicionarProdutoNoEstoque(new Produto(2, "Camisa", 0));
		objEstoque.adicionarProdutoNoEstoque(new Produto(3, "Calça", 0));
		objEstoque.adicionarProdutoNoEstoque(new Produto(4, "Oculos", 0));
		objEstoque.adicionarProdutoNoEstoque(new Produto(5, "Tenis", 0));
		
		objEstoque.listarProdutoNoEstoque();
		
		Fornecedor objFornecedor = new Fornecedor("Nike", "1234");
		objFornecedor.fornecer(objEstoque, new Produto(4, "",0), 10);
		
		objEstoque.listarProdutoNoEstoque();
		
		Fornecedor objFornecedor2 = new Fornecedor ("Osklen", "5678");
		objFornecedor2.fornecer(objEstoque, new Produto(4, "", 0), 20);
		
		objEstoque.listarProdutoNoEstoque();
		
		Venda objVenda = new Venda("Cliente 1", "0123456789");
		objVenda.vender(objEstoque, new Produto(4, "", 0));
		
		objEstoque.listarProdutoNoEstoque();
		
		Venda objVenda2 = new Venda("Cliente 4", "2356184615");
		objVenda2.vender(objEstoque, new Produto(1, "", 0));
		
		//Se fosse para mostrar a variavel cliente, mudaria o nome do objeto, mas só o produto não precisa
		objVenda.vender(objEstoque, new Produto(4, "", 0));
		
		objVenda.vender(objEstoque, new Produto(4, "", 0));
		
		objEstoque.listarProdutoNoEstoque();
		
	}
}
