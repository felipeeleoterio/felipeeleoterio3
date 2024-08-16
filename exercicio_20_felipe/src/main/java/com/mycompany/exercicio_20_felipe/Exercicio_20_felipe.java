package com.mycompany.exercicio_20_felipe;
import java.util.Scanner;

public class Exercicio_20_felipe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();

        
        System.out.print("Digite o percentual de desconto (0 a 100): ");
        double percentualDesconto = scanner.nextDouble();

        
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            System.out.println("Percentual de desconto inválido. Deve estar entre 0 e 100.");
        } else {
            
            double desconto = valorCompra * (percentualDesconto / 100);

            
            double valorFinal = valorCompra - desconto;

            
            System.out.printf("Valor da compra: R$ %.2f\n", valorCompra);
            System.out.printf("Percentual de desconto: %.2f%%\n", percentualDesconto);
            System.out.printf("Desconto aplicado: R$ %.2f\n", desconto);
            System.out.printf("Valor final após o desconto: R$ %.2f\n", valorFinal);
        }

        
        scanner.close();
    }
}

