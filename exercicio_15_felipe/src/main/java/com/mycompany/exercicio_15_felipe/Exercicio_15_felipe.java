package com.mycompany.exercicio_15_felipe;
import java.util.Scanner;

public class Exercicio_15_felipe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        int numero = scanner.nextInt();

        
        if (numero < 0) {
            System.out.println("Número inválido! O fatorial só é definido para números inteiros não negativos.");
        } else {
            
            long fatorial = 1;

            
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            
            System.out.println("O fatorial de " + numero + " é " + fatorial + ".");
        }

       
        scanner.close();
    }
}
