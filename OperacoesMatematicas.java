/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematicas;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematicas {

    public static void main(String[] args) {
          //Definição de dois números
        double num1 = 40.5;
        double num2 = 12.2;
        double lado = 5;
        double base = 2;
        double altura = 4;
        double diagonalMaior = 7;
        double diagonalMenor = 2;
        double pi = 3.14;                        
        double r = 6;
        double n1 = 7;
        double n2 = 6;
        double n3 = 8;
        
        //Realizando as operações matemáticas
        double soma = num1 + num2; // Soma
        double subtracao = num1 - num2; // Subtração
        double multiplicacao = num1 * num2; // Multiplicação
        double divisao = num2 != 0 ? num1 / num2 : Double.NaN; //Evita divisão por 0
        double resto = num1 % num2; // Resto de uma divisão
        double quadrado = lado * lado; // Área do Quadrado
        double triangulo = base * altura / 2; // Área do Triângulo
        double losango = diagonalMaior * diagonalMenor / 2; // Área do Losango
        double retangulo = base * altura; //Área do Retângulo
        double circunferencia = pi * (r * r); // Área da Circunferência
        double media = n1 + n2 + n3 / 3; //Média
        
        
        
        
        //Exibir resultados
        System.out.println("Resultado das operações:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + (num2 != 0 ? divisao : "Indefinida (divisão por zero)"));
        System.out.println("Resto da divisão: " + resto);
        System.out.println("Área do Quadrado: " + quadrado);
        System.out.println("Área do Triângulo: " + triangulo);
        System.out.println("Área do Losango: " + losango);
        System.out.println("Área do Retângulo: " + retangulo);
        System.out.println("Área da Circunferência: " + circunferencia);
        System.out.println("Média: " + media);
        
   
    }
}
