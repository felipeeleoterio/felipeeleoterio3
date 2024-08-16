package com.mycompany.exercicio_12_felipe;
import java.util.Scanner;

public class Exercicio_12_felipe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String[] candidatos = {"Candidato 1", "Candidato 2", "Candidato 3"};
        int[] votos = new int[3]; 

        
        System.out.print("Digite o número de eleitores: ");
        int numeroDeEleitores = scanner.nextInt();

        
        for (int i = 0; i < numeroDeEleitores; i++) {
            System.out.println("\nEleitor " + (i + 1) + ":");
            System.out.println("Digite o número do candidato para votar (1 para " + candidatos[0] + ", 2 para " + candidatos[1] + ", 3 para " + candidatos[2] + "): ");
            int voto = scanner.nextInt();

            
            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
            } else {
                System.out.println("Voto inválido. Por favor, digite um número entre 1 e 3.");
                i--; 
            }
        }

        
        System.out.println("\nResultado da votação:");
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println(candidatos[i] + ": " + votos[i] + " votos");
        }

        
        int maxVotos = votos[0];
        int vencedorIndex = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                vencedorIndex = i;
            }
        }

        System.out.println("\nO vencedor é " + candidatos[vencedorIndex] + " com " + votos[vencedorIndex] + " votos.");

        
        scanner.close();
    }
}
