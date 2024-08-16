package com.mycompany.exercicio_7_felipe ;
import java.util.Scanner;

public class Exercicio_7_felipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Inicializa as contagens
        int contagemPares = 0;
        int contagemImpares = 0;

        // Percorre todos os números de 1 até o número inserido
        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                // O número é par
                contagemPares++;
            } else {
                // O número é ímpar
                contagemImpares++;
            }
        }

        // Exibe a quantidade de números pares e ímpares
        System.out.println("Quantidade de números pares: " + contagemPares);
        System.out.println("Quantidade de números ímpares: " + contagemImpares);

        // Fecha o scanner
        scanner.close();
    }
}
