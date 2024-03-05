/*
 	Nome: Rafael Augusto Bacinello da Silva 
 	Prof: Flávio Navarro Fernandes
 	Exercício 001 - Lista 1
 	
 	Exercício 1
	Escreva um programa que leia um número inteiro. Se o número lido for positivo,
	escreva uma mensagem indicando se ele é par ou ímpar. Se o número for negativo,
	escreva a seguinte mensagem “Este número não é positivo”.

*/

package exercicio001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");

        int numero = scanner.nextInt();

        // Verifique se o número é positivo ou negativo
        if (numero > 0) 
        {
            // Se o número for positivo, verifique se é par ou ímpar
            if (numero % 2 == 0) 
            {
                System.out.println("O número é positivo e par.");
            } 
            else 
            {
                System.out.println("O número é positivo e ímpar.");
            }
        } 
        else 
        {
            // Se o número for negativo, exiba a mensagem apropriada
            System.out.println("Este número não é positivo.");
        }

        scanner.close();
    }
}

