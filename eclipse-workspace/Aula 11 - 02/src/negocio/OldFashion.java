package negocio;

public class OldFashion implements Drink {
	//Propriedades da classe
		private IngredienteDoDrink[] colecao = new IngredienteDoDrink[3];
		private int quantidadeIngrediente = 0;
		
		// Metodos da Classe
		public void adicionar(IngredienteDoDrink objIngrediente) {
			if(quantidadeIngrediente < colecao.length) {
				colecao[quantidadeIngrediente] = objIngrediente;
				quantidadeIngrediente++;
			}
		}
		
		public void misturar() {
			adicionar(new IngredienteDoDrink(new Ingrediente("Whisky"), 100));
			
			adicionar(new IngredienteDoDrink(new Ingrediente("Torrão de Açucar"), 1));
			
			adicionar(new IngredienteDoDrink(new Ingrediente("Laranja"), 1));
			
		}
		public void beber() {
			beber (colecao);
		}
		
		
}
