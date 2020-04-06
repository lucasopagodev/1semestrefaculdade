package negocio;

public class Turma {
	private Professor objProfessor = null;
	private Aluno[] colecaoAlunos = new Aluno[10];
	private Curso objCurso = null;
	private int posicao = 0;
	
	public Turma() {
	}
	public Turma(Professor objProfessor, Curso objCurso) {
		this.objProfessor = objProfessor;
		this.objCurso = objCurso;
	}
	public Professor getObjProfessor() {
		return objProfessor;
	}
	public void setObjProfessor(Professor objProfessor) {
		this.objProfessor = objProfessor;
	}
	public Curso getObjCurso() {
		return objCurso;
	}
	public void setObjCurso(Curso objCurso) {
		this.objCurso = objCurso;
	}
	public void adicionarAluno(Aluno objAluno) {
		colecaoAlunos[posicao] = objAluno;
		posicao++;
	}
	public void listarAlunos() {
		for (int i = 0 ; i < posicao ; i++) {
			System.out.println(colecaoAlunos[i].getNome());
		}
	}
}
