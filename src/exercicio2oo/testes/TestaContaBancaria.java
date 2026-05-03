package exercicio2oo.testes;

import exercicio2oo.classes.ContaBancaria;

import java.util.Scanner;

public class TestaContaBancaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();

        System.out.print("Número da Conta: ");
        cb.numeroConta = leitor.nextLine();
        System.out.print("Titular: ");
        cb.titular = leitor.nextLine();
        System.out.print("Saldo Inicial: ");
        cb.saldo = leitor.nextDouble();

        System.out.println("\nConta: " + cb.numeroConta + " | Titular: " + cb.titular + " | Saldo: " + cb.saldo);
    }
}