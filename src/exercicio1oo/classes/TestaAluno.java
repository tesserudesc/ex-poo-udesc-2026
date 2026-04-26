package exercicio1oo.classes;

import java.sql.SQLOutput;
import java.util.Scanner;

class TestaAluno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Aluno fulano = new Aluno();

        System.out.print("Nome: ");
        fulano.nome = leitor.nextLine();

        System.out.print("Matricula: ");
        fulano.matricula = leitor.nextLine();

        System.out.print("idade: ");
        fulano.idade = leitor.nextInt();

        System.out.print("nota1: ");
        fulano.nota1 = leitor.nextInt();

        System.out.print("nota2: ");
        fulano.nota2 = leitor.nextInt();

        System.out.print("nota3: ");
        fulano.nota3 = leitor.nextInt();

        System.out.print("nota4: ");
        fulano.nota4 = leitor.nextInt();

        System.out.println("\nDados do Aluno");
        System.out.println("-------------");
        System.out.println("Nome: " + fulano.nome);
        System.out.println("Matricula: " + fulano.matricula);
        System.out.println("Idade: " + fulano.idade);
        System.out.println("nota1: " + fulano.nota1);
        System.out.println("nota2: " + fulano.nota2);
        System.out.println("nota3: " + fulano.nota3);
        System.out.println("nota4: " + fulano.nota4);



    }
}
