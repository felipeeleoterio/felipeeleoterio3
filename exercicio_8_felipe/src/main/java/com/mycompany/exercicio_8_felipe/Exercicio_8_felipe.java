package com.mycompany.exercicio_8_felipe ;
import java.util.Scanner;

public class Exercicio_8_felipe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        boolean senhaValida = false;

        
        while (!senhaValida) {
            
            System.out.print("Digite uma senha (mínimo de 8 caracteres): ");
            senha = scanner.nextLine();

            
            if (senha.length() >= 8) {
                senhaValida = true;
                System.out.println("Senha válida!");
            } else {
                System.out.println("Senha inválida. A senha deve ter no mínimo 8 caracteres.");
            }
        }

        
        scanner.close();
    }
}
