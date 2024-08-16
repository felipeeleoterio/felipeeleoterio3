package com.mycompany.exercicio_11_felipe;
import java.util.Scanner;

public class Exercicio_11_felipe {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        scanner.nextLine();  

        System.out.print("Digite a unidade de origem (C para Celsius, F para Fahrenheit): ");
        String unidadeOrigem = scanner.nextLine().toUpperCase();

        

        
        if (unidadeOrigem.equals("C")) {
            
            temperaturaConvertida = (temperatura * 9/5) + 32;
            System.out.printf("%.2f graus Celsius é igual a %.2f graus Fahrenheit.%n", temperatura, temperaturaConvertida);
        } else if (unidadeOrigem.equals("F")) {
            
            temperaturaConvertida = (temperatura - 32) * 5/9;
            System.out.printf("%.2f graus Fahrenheit é igual a %.2f graus Celsius.%n", temperatura, temperaturaConvertida);
        } else {
            
            System.out.println("Unidade de origem inválida. Por favor, digite 'C' para Celsius ou 'F' para Fahrenheit.");
        }

        
        scanner.close();
    }
}
