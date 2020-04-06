package negocio;

public class Mojito implements Drink {
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
			adicionar(new IngredienteDoDrink(new Ingrediente("Rum"), 100));
			
			adicionar(new IngredienteDoDrink(new Ingrediente("Gelo"), 150));
			
			adicionar(new IngredienteDoDrink(new Ingrediente("Hortela"), 5));
			
			adicionar(new IngredienteDoDrink(new Ingrediente("Limão"), 2));
		}
		
		public void beber() {
			beber (colecao);
		}
}
