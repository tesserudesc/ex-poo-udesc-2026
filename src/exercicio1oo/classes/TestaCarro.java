package exercicio1oo;

import java.util.Scanner;

class TestaCarro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carro car = new Carro();

        System.out.print("Modelo: ");
        car.modelo = leitor.nextLine();
        System.out.print("Marca: ");
        car.marca = leitor.nextLine();
        System.out.print("Ano: ");
        car.ano = leitor.nextInt();
        System.out.print("Velocidade Atual: ");
        car.velocidade = leitor.nextDouble();

        System.out.println("\nCarro: " + car.marca + " " + car.modelo + " (" + car.ano + ") - Vel: " + car.velocidade + "km/h");
    }
}