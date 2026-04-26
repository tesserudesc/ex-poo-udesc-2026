package exercicio1oo;

import java.util.Scanner;

class TestaRetangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Retangulo r = new Retangulo();

        System.out.print("Largura: ");
        r.largura = leitor.nextDouble();
        System.out.print("Altura: ");
        r.altura = leitor.nextDouble();

        System.out.println("\nRetângulo: Largura=" + r.largura + ", Altura=" + r.altura);
    }
}