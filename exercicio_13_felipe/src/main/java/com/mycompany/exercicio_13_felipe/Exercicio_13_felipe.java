package com.mycompany.exercicio_13_felipe;
import java.util.Scanner;

public class Exercicio_13_felipe {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite um ano para verificar se é bissexto: ");
        int ano = scanner.nextInt();

        
        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println(ano + " é um ano bissexto.");
                } else {
                    System.out.println(ano + " não é um ano bissexto.");
                }
            } else {
                System.out.println(ano + " é um ano bissexto.");
            }
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        
        scanner.close();
    }
}
