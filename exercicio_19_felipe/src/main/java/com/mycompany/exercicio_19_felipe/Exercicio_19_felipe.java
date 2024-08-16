package com.mycompany.exercicio_19_felipe;
import java.util.Scanner;

public class Exercicio_19_felipe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();

        
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();

        
        double resultado = 1;

        
        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }

        
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado + ".");

        
        scanner.close();
    }
}
