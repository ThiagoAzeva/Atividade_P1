package Trabalho_Programaçao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 class Estudante {
	// atributos da classe estudante
	public int idEstudante;
	public String nomeEstudante;
	public String curso;
	public int idade;
	public int anoDeAdmissao;
	// construtor da classe
	public Estudante(int idEstudante, String nomeEstudante, String curso, int idade, int anoDeAdmissao) {
		super();
		this.idEstudante = idEstudante;
		this.nomeEstudante = nomeEstudante;
		this.curso = curso;
		this.idade = idade;
		this.anoDeAdmissao = anoDeAdmissao;
	}
	
	
	// métodos getter e setter

	public int getIdEstudante() {
		return idEstudante;
		}
	
	public void setIdEstudante(int idEstudante) {
			this.idEstudante = idEstudante;
		}
	
	public String getNomeEstudante() {
			return nomeEstudante;
		}
	
	public void setNomeEstudante(String nomeEstudante) {
			this.nomeEstudante = nomeEstudante;
		}
	
	public String getCurso() {
			return curso;
		}
	
	public void setCurso(String curso) {
			this.curso = curso;
		}
	
	public int getIdade() {
			return idade;
		}
	
	public void setIdade(int idade) {
			this.idade = idade;
		}
	
	public int getAnoDeAdmissao() {
			return anoDeAdmissao;
		}
	
	public void setAnoDeAdmissao(int anoDeAdmissao) {
			this.anoDeAdmissao = anoDeAdmissao;
		}
		
	// Método "Mostrar" para exibir informação dos alunos
	public String Mostrar() {
		StringBuilder p1 = new StringBuilder();
	p1.append("Aluno/Aluna: ").append(getNomeEstudante()).append(".\n");
		    p1.append("Curso: ").append(getCurso()).append(".\n");
		    p1.append("Identificação: ").append(getIdEstudante()).append(".\n");
		    p1.append("--------------");

		    return p1.toString();
		}
	
// Método para mostrar todas as informações de um aluno específico
	public String mostrarCompleto() {
		StringBuilder p2 = new StringBuilder();
		p2.append("Aluno/Aluna: ").append(getNomeEstudante()).append(".\n");
	    p2.append("Curso: ").append(getCurso()).append(".\n");
	    p2.append("Identificação: ").append(getIdEstudante()).append(".\n");
	    p2.append("Idade: ").append(getIdade()).append(".\n");
	    p2.append("Ano de Admissão: ").append(getAnoDeAdmissao()).append(".\n");
	    p2.append("--------------");
	    return p2.toString();
	}
}


