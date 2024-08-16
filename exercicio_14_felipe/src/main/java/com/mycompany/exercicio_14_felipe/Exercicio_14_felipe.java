package com.mycompany.exercicio_14_felipe;
import java.util.Random;
import java.util.Scanner;

public class Exercicio_14_felipe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("Escolha um número entre 1 e 10: ");
        int numeroUsuario = scanner.nextInt();

        
        System.out.print("Você escolhe Par ou Ímpar? (Digite 'par' ou 'ímpar'): ");
        String escolhaUsuario = scanner.next().toLowerCase();

        
        int numeroSorteado = random.nextInt(10) + 1;

        
        int soma = numeroUsuario + numeroSorteado;

        
        boolean somaPar = soma % 2 == 0;

        
        System.out.println("Número sorteado: " + numeroSorteado);
        System.out.println("Soma dos números: " + soma);
        System.out.println("A soma é " + (somaPar ? "Par" : "Ímpar"));

        
        if ((escolhaUsuario.equals("par") && somaPar) || (escolhaUsuario.equals("ímpar") && !somaPar)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }

        
        scanner.close();
    }
}
