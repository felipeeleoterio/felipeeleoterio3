/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_1_felipe;
import java.util.Scanner;
        
/**
 *
 * @author c.marques
 */


/**
 * Sistema de Aprovação de Alunos: Crie um programa que receba as notas de um aluno em 
três disciplinas e calcule sua média. Utilize estruturas IF e ELSE para determinar se o aluno 
foi aprovado, reprovado ou está em recuperação com base na média (Aprovado: média ≥ 7, 
Recuperação: 5 ≤ média < 7, Reprovado: média < 5)
 * 
 */
public class Exercicio_1_felipe {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float nota;
        float adicao = 0;
        float media;
        
        
        
        for(int i = 1; i <= 3; i++){
           System.out.println("digite sua nota: ");
           nota = ler.nextFloat();   
           
           adicao = (adicao + nota);
        }
        media = (adicao/3);
        if (media >= 7){
            System.out.println("Aprovado");
        }else if (media <= 5 && media < 7){
             System.out.println("Recuperação");
        }else if (media <5){
             System.out.println("Reprovado");
        }
        
        
        
        
        
    }
}