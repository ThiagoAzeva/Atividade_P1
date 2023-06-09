package Trabalho_Programaçao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Programa  {
public static  List<Estudante> estudantes = new ArrayList<>();

//Método para cadastro de novos alunos
public void cadastrarAluno() {
Scanner sc = new Scanner(System.in);
System.out.println("Digite o numero de Identificação(ID) do Aluno / Aluna:");
int id = sc.nextInt();
sc.nextLine();//Consume newline

//Verificador de id repetido
boolean replica = false;
for(Estudante estudante : estudantes) {
if(id == estudante.getIdEstudante() ) {
replica = true;
break;
}
}
if(replica) {
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


System.out.println("Digite o ano de admissão do Aluno / Aluna:");
int ano = sc.nextInt();

Estudante estudante = new Estudante(id, nome, curso, idade, ano);
estudantes.add(estudante);
System.out.println("Cadastro Realizado com sucesso!");
System.out.println("--------------");
}
// Método para exibir a lista alunos cadastrados no sistema e exibir uma mensagem caso não haja nenhum
public void listarAlunos() {

System.out.println("Alunos");

if (estudantes.isEmpty()) {
System.out.println("Nenhum aluno cadastrado.");
return;
}

for(Estudante estudante : estudantes) {
System.out.println(estudante.Mostrar());
}

}

// Método que ira remover alunos cadastrados no sistemas
	public void excluirAluno() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o ID do aluno que quer excluir.");
	int s = sc.nextInt() ;
	for(int i = 0; i < estudantes.size();i++) {
		if(estudantes.get(i).getIdEstudante()== s) {
			estudantes.remove(i);
		}
		
	}
	
}

// Método que irá permitir visualização de todas as informações de um aluno específico
public void acharAluno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o critério de busca:");
        System.out.println("Digite (1) para buscar por ID");
        System.out.println("Digite (2) para buscar por nome");
        int opcao = sc.nextInt();
        sc.nextLine(); // Consumir nova linha

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

        if (alunosEncontrados.isEmpty()) {
            System.out.println("Aluno/Aluna não encontrado(a).");
        } else {
            for (Estudante estudante : alunosEncontrados) {
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

// Lista de ações que podem ser executadas no sistema
while(!sair) {
System.out.println("Escolha uma das opções a seguir:");
System.out.println("Digite (1) Para cadastrar novo aluno/aluna.");
System.out.println("Digite (2) Para chegar a lista de alunos.");
System.out.println("Digite (3) Para ver informações sobre um aluno específico.");
System.out.println("Digite (4) Para Excluir um aluno cadastrado.");
System.out.println("Digite (5) Para encerrar o sistema.");
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
aluno.excluirAluno();
break;
case 5:
System.out.println("Sistema encerrado.");
sair = true;
break;
}

}
}

}