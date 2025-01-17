package com.mycompany.exercicio_6_felipe;
import java.util.Scanner;

public class Exercicio_6_felipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        
        double imc = peso / (altura * altura);

        
        System.out.printf("Seu IMC é: %.2f\n", imc);

        
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else {
            System.out.println("Classificação: Obesidade");
        }

    }
}
