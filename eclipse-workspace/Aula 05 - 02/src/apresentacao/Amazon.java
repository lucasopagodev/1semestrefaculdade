package apresentacao;

import negocio.Carrinho;
import negocio.Cliente;
import negocio.Produto;

public class Amazon {
	public static void main(String[] args) {
		Carrinho objCarrinho = new Carrinho();
		
		objCarrinho.adicionarProdutoNoCarrinho(new Produto("Sapato", 300));
		objCarrinho.adicionarProdutoNoCarrinho(new Produto("Casaco", 1000));
		objCarrinho.adicionarProdutoNoCarrinho(new Produto("Whey Protein", 500));
		objCarrinho.adicionarProdutoNoCarrinho(new Produto("PS4", 2500));
		objCarrinho.adicionarProdutoNoCarrinho(new Produto("Chuteira", 689));
		
		Cliente objCliente = new Cliente("699", "Junior", "SQS 207", "4984");
		
		objCarrinho.setObjCliente(objCliente);
		objCarrinho.listarProdutosDoCarrinho();
		System.out.println("-----------------------------");
		System.out.println("Valor total: R$ " + objCarrinho.calcularValorTotal());
	}
}
