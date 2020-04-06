package negocio;

public class Caipirinha implements Drink {
	//Propriedades da classe
	private IngredienteDoDrink[] colecao = new IngredienteDoDrink[4];
	private int quantidadeIngrediente = 0;
	
	// Metodos da Classe
	public void adicionar(IngredienteDoDrink objIngrediente) {
		if(quantidadeIngrediente < colecao.length) {
			colecao[quantidadeIngrediente] = objIngrediente;
			quantidadeIngrediente++;
		}
	}
	
	public void misturar() {
		adicionar(new IngredienteDoDrink(new Ingrediente("Cachaca"), 50));
		
		adicionar(new IngredienteDoDrink(new Ingrediente("Limão"), 2));
		
		adicionar(new IngredienteDoDrink(new Ingrediente("Açucar"), 10));
		
		adicionar(new IngredienteDoDrink(new Ingrediente("Gelo"), 150));
	}
	
	public void beber() {
		beber (colecao);
	}
}
