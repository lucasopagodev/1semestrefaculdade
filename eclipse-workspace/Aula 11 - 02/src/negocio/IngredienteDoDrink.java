package negocio;

public class IngredienteDoDrink {
	// Propriedades da classe
	private Ingrediente  objIngrediente = null;
	private int quantidade = 0;
	
	// Metodos Construtores
	public IngredienteDoDrink() {
		super();
	}

	public IngredienteDoDrink(Ingrediente objIngrediente, int quantidade) {
		super();
		this.objIngrediente = objIngrediente;
		this.quantidade = quantidade;
	}

	// Metodos GET/SET 
	public Ingrediente getObjIngrediente() {
		return objIngrediente;
	}

	public void setObjIngrediente(Ingrediente objIngrediente) {
		this.objIngrediente = objIngrediente;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}
