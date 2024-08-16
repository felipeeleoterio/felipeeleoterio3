package com.mycompany.exercicio_17_felipe;
import java.util.Scanner;

public class Exercicio_17_felipe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite uma frase para contar o número de vogais: ");
        String frase = scanner.nextLine();

        
        int contadorVogais = 0;

        
        frase = frase.toLowerCase();

        
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);

            
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contadorVogais++;
            }
        }

        
        System.out.println("Número de vogais na frase: " + contadorVogais);

        
        scanner.close();
    }
}
