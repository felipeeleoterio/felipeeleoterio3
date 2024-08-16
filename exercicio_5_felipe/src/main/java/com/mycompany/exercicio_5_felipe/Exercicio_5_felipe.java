package com.mycompany.exercicio_5_felipe;

import java.util.Scanner;

public class Exercicio_5_felipe {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário para inserir um número
        System.out.print("Digite um número para gerar a tabuada: ");
        int numero = scanner.nextInt();
        
        // Exibir a tabuada do número inserido usando um laço FOR
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        
        // Fechar o scanner
        scanner.close();
    }
}
