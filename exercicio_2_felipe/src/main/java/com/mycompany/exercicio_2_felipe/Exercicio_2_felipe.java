package com.mycompany.exercicio_2_felipe;

import java.util.Random;
import java.util.Scanner;

public class Exercicio_2_felipe {
    public static void main(String[] args) {
        // Criar um objeto Random para gerar números aleatórios
        Random random = new Random();
        // Gerar um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
        
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        int palpite = 0; // Variável para armazenar o palpite do usuário
        int tentativas = 0; // Variável para contar o número de tentativas
        
        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        
        // Laço WHILE para permitir múltiplas tentativas
        while (palpite != numeroAleatorio) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt(); // Ler o palpite do usuário
            tentativas++; // Incrementar o número de tentativas
            
            // Usar IF-ELSE para fornecer dicas
            if (palpite < numeroAleatorio) {
                System.out.println("O número é maior do que " + palpite + ". Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor do que " + palpite + ". Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        }
        
        // Fechar o scanner
        scanner.close();
    }
}
