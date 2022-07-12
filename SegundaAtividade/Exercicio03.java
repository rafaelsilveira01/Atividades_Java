package br.com.generation.segundaatividade;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		  21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
          idade for =-99. (WHILE)*/
		
		Scanner entrada = new Scanner(System.in);
				
		int idade = 1, x = 0, y = 0;
		System.out.print("Insira uma idade: ");
		idade = entrada.nextInt();
		   
		while(idade!=-99) {
			if (idade<=21)
			x++;
			if (idade>=50)
			y++;	
			System.out.print("Insira uma idade ou digite -99 para encerrar: ");	
			idade = entrada.nextInt();
		}
		
		System.out.println("\nO total de pessoas com menos de 21 anos é: " + x);					
		System.out.println("\nO total de pessoas com mais de 50 anos é: " + y);					
		
	}
	
		
		
		
	}


