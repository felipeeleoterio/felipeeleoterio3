package com.mycompany.exercicio_9_felipe ;
import java.util.Scanner;

public class Exercicio_9_felipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita um número ao usuário
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é primo
        boolean ehPrimo = true;

        // Número menor ou igual a 1 não é primo
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            // Verifica se o número é divisível por algum número de 2 até a raiz quadrada do número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        // Exibe o resultado
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
