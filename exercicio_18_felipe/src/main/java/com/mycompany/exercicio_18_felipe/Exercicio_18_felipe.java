package com.mycompany.exercicio_18_felipe;
import java.util.Scanner;

public class Exercicio_18_felipe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o tipo de veículo (carro, moto, caminhão): ");
        String tipoVeiculo = scanner.nextLine().toLowerCase();

        
        double valorPedagio;

        
        if (tipoVeiculo.equals("carro")) {
            valorPedagio = 10.00;
        } else if (tipoVeiculo.equals("moto")) {
            valorPedagio = 5.00;
        } else if (tipoVeiculo.equals("caminhão")) {
            valorPedagio = 15.00;
        } else {
            System.out.println("Tipo de veículo inválido. Por favor, insira 'carro', 'moto' ou 'caminhão'.");
            scanner.close();
            return; 
        }

        
        System.out.println("O valor do pedágio para um " + tipoVeiculo + " é R$ " + valorPedagio + ".");

        
        scanner.close();
    }
}
