package negocio;

public class DryMartini implements Drink {
	//Propriedades da classe
			private IngredienteDoDrink[] colecao = new IngredienteDoDrink[5];
			private int quantidadeIngrediente = 0;
			
			// Metodos da Classe
			public void adicionar(IngredienteDoDrink objIngrediente) {
				if(quantidadeIngrediente < colecao.length) {
					colecao[quantidadeIngrediente] = objIngrediente;
					quantidadeIngrediente++;
				}
			}
			
			public void misturar() {
				adicionar(new IngredienteDoDrink(new Ingrediente("Vodka"), 50));
				
				adicionar(new IngredienteDoDrink(new Ingrediente("Vermuth"), 50));
				
				adicionar(new IngredienteDoDrink(new Ingrediente("Gin"), 2));
				
				adicionar(new IngredienteDoDrink(new Ingrediente("Gelo"), 10));
				
				adicionar(new IngredienteDoDrink(new Ingrediente("Azeitona"), 150));
			}
			
			public void beber() {
				beber (colecao);
			}
}
