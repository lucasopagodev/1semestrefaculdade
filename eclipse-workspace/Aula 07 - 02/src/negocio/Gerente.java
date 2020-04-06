package negocio;

public class Gerente extends Funcionario {
	//Propriedades da classe 
	private double bonus = 0;

	//Metodos construtores da classe
	public Gerente() {
		super();
	}

	public Gerente(double bonus) {
		super();
		this.bonus = bonus;
	}

	//Metodos Get/Set da classe
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//Metodos sobrescritos da classe
	//Esse é um metodo sobre escrito da classe e fiz referencia ao metodo da classe pai
	public double getSalario() {
		return super.getSalario() + this.bonus;
	}
}
