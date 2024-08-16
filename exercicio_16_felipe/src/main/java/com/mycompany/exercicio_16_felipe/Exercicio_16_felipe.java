package com.mycompany.exercicio_16_felipe;
import java.util.Scanner;

public class Exercicio_16_felipe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();

        
        String palavraNormalizada = palavra.replaceAll("\\s+", "").toLowerCase();

        
        int tamanho = palavraNormalizada.length();
        boolean ehPalindromo = true;

        
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavraNormalizada.charAt(i) != palavraNormalizada.charAt(tamanho - 1 - i)) {
                ehPalindromo = false;
                break; 
            }
        }

        
        if (ehPalindromo) {
            System.out.println("\"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("\"" + palavra + "\" não é um palíndromo.");
        }

        
        scanner.close();
    }
}
