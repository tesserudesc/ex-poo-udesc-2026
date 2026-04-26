package exercicio1oo;

import java.util.Scanner;

class TestaCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Circulo c = new Circulo();

        System.out.print("Raio do Círculo: ");
        c.raio = leitor.nextDouble();

        System.out.println("\nCírculo: Raio=" + c.raio);
    }
}