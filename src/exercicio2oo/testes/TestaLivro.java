package exercicio2oo.testes;
import exercicio2oo.classes.Livro;
import java.util.Scanner;

public class TestaLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Livro l = new Livro();

        System.out.print("Título: ");
        l.titulo = leitor.nextLine();
        System.out.print("Autor: ");
        l.autor = leitor.nextLine();
        System.out.print("Gênero: ");
        l.genero = leitor.nextLine();
        System.out.print("Está emprestado? (true/false): ");
        l.emprestado = leitor.nextBoolean();

        System.out.println("\nLivro: " + l.titulo + " | Autor: " + l.autor + " | Gênero: " + l.genero + " | Emprestado: " + l.emprestado);
    }
}