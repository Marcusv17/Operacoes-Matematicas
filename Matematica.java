/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.opracoesmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
import java.util.Scanner;
       
public class Matematica {
// Eu, Marcus Vinícius Marins estou fazendo uma calculadora de areas no netbeans
    
    public static void main(String[] args) {
        //Definição de dois números
        double num1 = 40.5;
        double num2 = 12.2;
        
        //Realizando as operações matemáticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; //Evita divisão por 0
        double resto = num1 % num2;
        
        //Exibir resultados
        System.out.println("Resultado das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao :
                "Indefinida (divisão por zero)"));
        System.out.println("Resto da divisão: " + resto);
    }
    
}