package Trabalho_Programaçao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

public class Programa {

	public static List<Estudante> estudantes = new ArrayList<>();

//Método para cadastro de novos alunos

	public void cadastrarAluno() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de Identificação(ID) do Aluno / Aluna:");

		int id = sc.nextInt();

		sc.nextLine();// Consume newline

//Verificador de id repetido

		boolean replica = false;

		for (Estudante estudante : estudantes) {

			if (id == estudante.getIdEstudante()) {

				replica = true;

				break;

			}

		}

		if (replica) {

			System.out.println("ID já cadastrada");

			System.out.println("--------------");

			return;

		}

//Continuação do método de cadastro

		System.out.println("Digite o Primeiro Nome do Aluno / Aluna:");

		String nome = sc.nextLine();

		System.out.println("Digite o Curso do Aluno / Aluna:");

		String curso = sc.nextLine();

		System.out.println("Digite a idade do Aluno / Aluna:");

		int idade = sc.nextInt();

		sc.nextLine();

		System.out.println("Digite o ano de admissão do Aluno / Aluna:");

		int ano = sc.nextInt();

		sc.nextLine();

		System.out.println("Digite o turno do Aluno / Aluna:");

		String turno = sc.nextLine();

		System.out.println("Digite o semestre do Aluno / Aluna:");

		int semestre = sc.nextInt();

		Estudante estudante = new InfoCurso(id, nome, curso, idade, ano, turno, semestre);

		estudantes.add(estudante);

		System.out.println("Cadastro realizado com sucesso!");

		System.out.println("--------------");

	}

// Método para exibir a lista alunos cadastrados no sistema e exibir uma mensagem caso não haja nenhum

	public void listarAlunos() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha o critério de ordenação:");

		System.out.println("Digite (1) para ordenar por nome em ordem alfabética.");

		System.out.println("Digite (2) para ordenar por curso em ordem alfabética.");

		System.out.println("Digite (3) para ordenar por ID em ordem crescente.");

		int opcao = sc.nextInt();

		List<Estudante> alunosOrdenados = new ArrayList<>(estudantes);

		switch (opcao) {

		case 1:

			// Ordenar por nome em ordem alfabética usando Bubble Sort

			for (int i = 0; i < alunosOrdenados.size() - 1; i++) {

				for (int j = 0; j < alunosOrdenados.size() - i - 1; j++) {

					String nome1 = alunosOrdenados.get(j).getNomeEstudante();

					String nome2 = alunosOrdenados.get(j + 1).getNomeEstudante();

					if (nome1.compareToIgnoreCase(nome2) > 0) {

						Collections.swap(alunosOrdenados, j, j + 1);

					}

				}

			}

			break;

		case 2:

			// Ordenar por curso em ordem alfabética usando Bubble Sort

			for (int i = 0; i < alunosOrdenados.size() - 1; i++) {

				for (int j = 0; j < alunosOrdenados.size() - i - 1; j++) {

					String curso1 = alunosOrdenados.get(j).getCurso();

					String curso2 = alunosOrdenados.get(j + 1).getCurso();

					if (curso1.compareToIgnoreCase(curso2) > 0) {

						Collections.swap(alunosOrdenados, j, j + 1);

					}

				}

			}

			break;

		case 3:

			// Ordenar por ID em ordem crescente usando Bubble Sort

			for (int i = 0; i < alunosOrdenados.size() - 1; i++) {

				for (int j = 0; j < alunosOrdenados.size() - i - 1; j++) {

					int id1 = alunosOrdenados.get(j).getIdEstudante();

					int id2 = alunosOrdenados.get(j + 1).getIdEstudante();

					if (id1 > id2) {

						Collections.swap(alunosOrdenados, j, j + 1);

					}

				}

			}

			break;

		default:

			System.out.println("Opção inválida.");

			return;

		}

		System.out.println("Lista de alunos ordenada:");

		if (alunosOrdenados.isEmpty()) {

			System.out.println("Nenhum aluno cadastrado.");

			return;

		}

		for (Estudante estudante : alunosOrdenados) {

			System.out.println(estudante.Mostrar());

		}

	}

// Método para remover alunos cadastrados no sistemas

	public void excluirAluno() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ID do aluno que deseja excluir:");

		int id = sc.nextInt();

		Estudante alunoParaExcluir = null;

		for (Estudante estudante : estudantes) {

			if (estudante.getIdEstudante() == id) {

				alunoParaExcluir = estudante;

				break;

			}

		}

		if (alunoParaExcluir != null) {

			System.out.println("Deseja realmente excluir o aluno " + alunoParaExcluir.getNomeEstudante() + "?");

			System.out.println("Digite (1) para confirmar");

			System.out.println("Digite (2) para cancelar");

			int confirmacao = sc.nextInt();

			if (confirmacao == 1) {

				estudantes.remove(alunoParaExcluir);

				System.out.println("Aluno removido com sucesso.");

			} else if (confirmacao == 2) {

				System.out.println("Exclusão cancelada.");

			} else {

				System.out.println("Opção inválida. Exclusão cancelada.");

			}

		} else {

			System.out.println("Aluno não encontrado.");

		}

	}

	// Método para alterar os dados de um aluno cadastrado no sistema

	public void alterarAluno() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ID do aluno que deseja alterar:");

		int id = sc.nextInt();

		sc.nextLine(); //

		Estudante alunoParaAlterar = null;

		for (Estudante estudante : estudantes) {

			if (estudante.getIdEstudante() == id) {

				alunoParaAlterar = estudante;

				break;

			}

		}

		if (alunoParaAlterar != null) {

			System.out.println("Aluno encontrado. Informe as novas informações:");

			System.out.println("Digite o novo nome do aluno:");

			String novoNome = sc.nextLine();

			alunoParaAlterar.setNomeEstudante(novoNome);

			System.out.println("Digite o novo curso do aluno:");

			String novoCurso = sc.nextLine();

			alunoParaAlterar.setCurso(novoCurso);

			System.out.println("Digite a nova idade do aluno:");

			int novaIdade = sc.nextInt();

			alunoParaAlterar.setIdade(novaIdade);

			System.out.println("Digite o novo ano de admissão do aluno:");

			int novoAno = sc.nextInt();

			alunoParaAlterar.setAnoDeAdmissao(novoAno);

			sc.nextLine();

			System.out.println("Digite o novo turno do Aluno / Aluna:");

			String Turno = sc.nextLine();

			System.out.println("Digite o novo semestre do Aluno / Aluna:");

			int Semestre = sc.nextInt();

			System.out.println("As alterações foram concluídas com sucesso.");

			System.out.println("--------------------");

		} else {

			System.out.println("Aluno não encontrado.");

			System.out.println("--------------------");

		}

	}

// Método que irá permitir visualização de todas as informações de um aluno específico

	public void acharAluno() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha o critério de busca:");

		System.out.println("Digite (1) para buscar por ID");

		System.out.println("Digite (2) para buscar por nome");

		int opcao = sc.nextInt();

		sc.nextLine();

		List<Estudante> alunosEncontrados = new ArrayList<>();

		switch (opcao) {

		case 1:

			System.out.println("Digite o ID do aluno:");

			int id = sc.nextInt();

			for (Estudante estudante : estudantes) {

				if (estudante.getIdEstudante() == id) {

					alunosEncontrados.add(estudante);

				}

			}

			break;

		case 2:

			System.out.println("Digite o nome do aluno:");

			String nome = sc.nextLine();

			for (Estudante estudante : estudantes) {

				if (estudante.getNomeEstudante().equalsIgnoreCase(nome)) {

					alunosEncontrados.add(estudante);

				}

			}

			break;
		default:

			System.out.println("Opção inválida.");

			return;

		}

		for (Estudante estudante : alunosEncontrados) {

			if (estudante instanceof InfoCurso) {

				System.out.println(((InfoCurso) estudante).mostrarCompleto());

			} else {

				System.out.println(estudante.mostrarCompleto());

			}

		}

		if (alunosEncontrados.isEmpty()) {

			System.out.println("Aluno/Aluna não encontrado(a).");

		}

	}

// Pré cadastro de 7 alunos no sistema

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

// Lista de ações que podem ser executadas no sistema

		while (!sair) {

			System.out.println("Escolha uma das opções a seguir:");

			System.out.println("Digite (1) Para cadastrar novo aluno/aluna.");

			System.out.println("Digite (2) Para chegar a lista de alunos.");

			System.out.println("Digite (3) Para ver informações sobre um aluno específico.");

			System.out.println("Digite (4) Para Alterar o cadastro um aluno.");

			System.out.println("Digite (5) Para Excluir um aluno cadastrado.");

			System.out.println("Digite (6) Para encerrar o sistema.");

			int o = sc.nextInt();

			switch (o) {

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

				aluno.alterarAluno();

				break;

			case 5:

				aluno.excluirAluno();

				break;

			case 6:

				System.out.println("Sistema encerrado.");

				sair = true;

				break;

			}

		}

	}

}