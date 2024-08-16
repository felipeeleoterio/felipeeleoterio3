package com.mycompany.exercicio_4_felipe;

import java.util.Scanner;

public class Exercicio_4_felipe {
    public static void main(String[] args) {
        // Definir nome de usuário e senha corretos
        final String USUARIO_CORRETO = "admin";
        final String SENHA_CORRETA = "1234";
        
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar as tentativas e a autenticação
        int tentativas = 0;
        boolean autenticado = false;
        
        // Laço WHILE para permitir até 3 tentativas de login
        while (tentativas < 3 && !autenticado) {
            // Solicitar o nome de usuário e a senha
            System.out.print("Digite o nome de usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();
            
            // Verificar a autenticidade dos dados
            if (usuario.equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
                autenticado = true;
                System.out.println("Login bem-sucedido! Bem-vindo, " + usuario + ".");
            } else {
                tentativas++;
                if (tentativas < 3) {
                    System.out.println("Nome de usuário ou senha incorretos. Você ainda tem " + (3 - tentativas) + " tentativa(s).");
                } else {
                    System.out.println("Número máximo de tentativas atingido. Acesso bloqueado.");
                }
            }
        }
        
        // Fechar o scanner
        scanner.close();
    }
}
