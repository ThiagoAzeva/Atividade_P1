package Trabalho_Programaçao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

 class Estudante {
	// atributtos da classe estudante
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
	
	
	// metodos get e set

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
		
	// Metodo Mostrar() Para exibir informação dos alunos
	public String Mostrar() {
		StringBuilder p1 = new StringBuilder();
	p1.append("Aluno/Aluna: ").append(getNomeEstudante()).append(".\n");
		    p1.append("Curso: ").append(getCurso()).append(".\n");
		    p1.append("Identificação: ").append(getIdEstudante()).append(".\n");
		    p1.append("--------------");

		    return p1.toString();
		
	}
// metodo para mostras todas as informações de um aluno especifico
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

public class Programa  {
public static  List<Estudante> estudantes = new ArrayList<>();
	
	//Metodo para cadastro de novos alunos
	public void cadastrarAluno() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o numero de Identificação(ID) do Aluno / Aluna:");
	int id = sc.nextInt();	
	sc.nextLine();//Consume newline
	
	
	
	System.out.println("Digite o Primeiro Nome do Aluno / Aluna:");
	String nome = sc.nextLine();	
	
	System.out.println("Digite o Curso do Aluno / Aluna:");
	String curso = sc.nextLine();
	
	System.out.println("Digite a idade do Aluno / Aluna:");
	int idade = sc.nextInt();
	
	
	System.out.println("Digite o ano de admissão do Aluno / Aluna:");
	int ano = sc.nextInt();
	
	Estudante estudante = new Estudante(id, nome, curso, idade, ano);	
	estudantes.add(estudante);
	System.out.println("Cadastro Realizado com sucesso!");
	System.out.println("--------------");
	}
	// Metodo para exibir a lista alunos cadastrados no sistema e exibir uma mensagem caso não haja nenhum
	public void listarAlunos() {
		
		System.out.println("Alunos");
		
		if (estudantes.isEmpty()) {
			System.out.println("Nenhum aluno cadastradso.");
			return;
		}
		
		
		
		
		for(Estudante estudante : estudantes) {
			System.out.println(estudante.Mostrar());
		}
		
		
	}
	// metodo que irá permitir visualização de todas as informações de um aluno especifico
	public void acharAluno(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID do aluno/aluna:");
		int id = sc.nextInt();
		
		List<Estudante> aluno = new ArrayList<>();
	
	for(Estudante estudante : estudantes) {
		if(estudante.getIdEstudante()== id) {
			aluno.add(estudante);
		}
	}
	if(aluno.isEmpty()) {
		System.out.println("Aluno/Aluna nao encontrado/a.");
	}
	else {
		for(Estudante estudante : aluno) {
			System.out.println(estudante.mostrarCompleto());
		}
	}
	
	}

	public static void main(String[] args) {
		Programa aluno = new Programa();
		Estudante aluno1 = new Estudante(1, "Josefina", "ADM", 24, 2020);
		Estudante aluno2 = new Estudante(2, "Mario", "Direito", 22, 2020);
		Estudante aluno3 = new Estudante(3, "Paula", "ADM", 24, 2022);
		Estudante aluno4 = new Estudante(4, "Flavia", "Design", 18, 2023);
		Estudante aluno5 = new Estudante(5, "Jair", "Medicina", 25, 2023);
		Estudante aluno6 = new Estudante(6, "Luis Inacio", "Artes", 17, 2023);
		Estudante aluno7 = new Estudante(7, "Claudio", "Gastronomia", 26, 2022);
		estudantes.add(aluno1);
		estudantes.add(aluno2);
		estudantes.add(aluno3);
		estudantes.add(aluno4);
		estudantes.add(aluno5);
		estudantes.add(aluno6);
		estudantes.add(aluno7);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja Bem vindo!");
		System.out.println("---------------");
		boolean sair = false;
		// lista de ações que podem ser executadas no sistema
		while(!sair) {
		System.out.println("Escolha uma das opções a seguir:");
		System.out.println("Digite (1) Para cadastrar novo aluno/aluna.");
		System.out.println("Digite (2) Para chegar a lista de alunos.");
		System.out.println("Digite (3) Para ver informações sobre um aluno específico.");
		System.out.println("Digite (4) Para encerrar o sistema.");
		int o = sc.nextInt();
		
		switch(o) {
		
		case 1:
			aluno.cadastrarAluno();
			break;
			
			
		case 2:
			aluno.listarAlunos();
			break;	
		
		case 3:
			aluno.acharAluno();
			break;
		
		case 4:
			System.out.println("Sistema encerrado.");
			sair = true;
			break;
		}
		
		}
	}

	}
