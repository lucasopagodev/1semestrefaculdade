package negocio;

public interface Drink {
	public void adicionar(IngredienteDoDrink objIngrediente);
	
	public void misturar();
	
	public default void beber(IngredienteDoDrink[] colecao) {
		System.out.println(this.getClass().getName());
		System.out.println("Os ingredientes do seu Drink são: ");
		for(int i = 0 ; i < colecao.length ; i++) {
			System.out.println(colecao[i].getObjIngrediente().getNome() + " " + colecao[i].getQuantidade());
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println();
	}
	
}
