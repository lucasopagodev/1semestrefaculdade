package apresentacao;

import negocio.Aluno;
import negocio.Curso;
import negocio.Professor;
import negocio.Turma;

public class Escola {
	public static void main(String[] args) {
		Curso objCurso = new Curso();
		objCurso.setDescricao("Linguagem de Programação!");
		
		Turma objTurma = new Turma(new Professor("Junior", "Doutor"),objCurso);
		objTurma.adicionarAluno(new Aluno("1", "Huguinho", 20));
		objTurma.adicionarAluno(new Aluno("2", "Zezinho", 21));
		objTurma.adicionarAluno(new Aluno("3", "Luisinho", 22));
		
		System.out.println("A turma de " + objTurma.getObjCurso().getDescricao() + "com o professor " + objTurma.getObjProfessor().getNome() + 
				 																									"tem os seguintes alunos: ");
		objTurma.listarAlunos();
	}
}
