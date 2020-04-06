package negocio;

public class Aluno {
	private String matricula = "";
	private String nome = "";
	private int idade = 0;
	
	public Aluno () {
	}
	public Aluno (String matricula, String nome, int idade) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
