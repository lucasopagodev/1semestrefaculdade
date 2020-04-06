package negocio;

public class Funcionario {
	//Propriedades da Classe
	private String nome = "";
	private int matricula = 0;
	private Funcao objfuncao = null;
	private double salario = 0;

	//Metodos construtores da classe
	
	public Funcionario() {
		super();
	}
	
	public Funcionario(String nome, int matricula, Funcao objfuncao, double salario) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.objfuncao = objfuncao;
		this.salario = salario;
	}

	//Metodos Get/Set da classe
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public Funcao getObjfuncao() {
		return objfuncao;
	}


	public void setObjfuncao(Funcao objfuncao) {
		this.objfuncao = objfuncao;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
