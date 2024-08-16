package com.mycompany.exercicio_3_felipe;

import java.util.Scanner;

public class Exercicio_3_felipe {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário para escolher uma operação
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Digite o número da operação (1/2/3/4): ");
        int opcao = scanner.nextInt();
        
        // Solicitar ao usuário para inserir dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0; // Variável para armazenar o resultado
        
        // Usar IF-ELSE para determinar a operação e calcular o resultado
        if (opcao == 1) {
            // Adição
            resultado = num1 + num2;
            System.out.println("Resultado da adição: " + resultado);
        } else if (opcao == 2) {
            // Subtração
            resultado = num1 - num2;
            System.out.println("Resultado da subtração: " + resultado);
        } else if (opcao == 3) {
            // Multiplicação
            resultado = num1 * num2;
            System.out.println("Resultado da multiplicação: " + resultado);
        } else if (opcao == 4) {
            // Divisão
            if (num2 != 0) {
                resultado = num1 / num2;
                System.out.println("Resultado da divisão: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            // Opção inválida
            System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 4.");
        }
        
        // Fechar o scanner
        scanner.close();
    }
}
