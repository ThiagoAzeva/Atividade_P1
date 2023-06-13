package Trabalho_Programaçao;

public class InfoCurso extends Estudante {

	// Atributos da classe infocurso

	private String turno;

	private int semestre;

	// Construtor da classe

	public InfoCurso(int idEstudante, String nomeEstudante, String curso, int idade, int anoDeAdmissao, String turno,
			int semestre) {

		super(idEstudante, nomeEstudante, curso, idade, anoDeAdmissao);

		this.turno = turno;

		this.semestre = semestre;

	}

	// Métodos getter e setter

	public String getTurno() {

		return turno;

	}

	public void setTurno(String turno) {

		this.turno = turno;

	}

	public int getSemestre() {

		return semestre;

	}

	public void setSemestre(int semestre) {

		this.semestre = semestre;

	}

	// Método Mostrar() para exibir informações de um aluno específico

	public String mostrarCompleto() {

		StringBuilder infoCurso = new StringBuilder(super.mostrarCompleto());

		infoCurso.append("Turno: ").append(turno).append(".\n");

		infoCurso.append("Semestre: ").append(semestre).append(".\n");

		infoCurso.append("--------------");

		return infoCurso.toString();

	}

}