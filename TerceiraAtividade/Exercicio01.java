package br.com.generation.VetorMatriz;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		/*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */
		
		int numMaior = 0;
		Scanner entrada = new Scanner(System.in);
		int nota[] = new int[5];
		
		System.out.println("Insira 5 notas: ");
			for(int i = 0; i < nota.length; i++) {
				System.out.println((i+1) + "º Nota: ");
				nota[i] = entrada.nextInt();
			
			if(nota[i] > numMaior) {
				numMaior = nota[i];
			}
			
		}
			System.out.println("\n");
			for(int i = 0; i <= 4; i++) {
							
				System.out.println("\n\nO maior número é: " + numMaior); 
				System.out.println("\n");
	}

 }
}
