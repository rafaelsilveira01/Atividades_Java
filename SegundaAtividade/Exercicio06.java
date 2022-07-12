package br.com.generation.segundaatividade;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*6- Escrever um programa que receba vários números inteiros no teclado. E no
			 final imprimir a média dos números múltiplos de 3. Para sair digitar
			 0(zero).(DO...WHILE) */

		int a=0, soma = 0, i=0;
		Scanner leia = new Scanner(System.in);
		
		do { 
			System.out.println("Digite um número para a soma e zero para sair: ");
			a = leia.nextInt();
			if(a%3==0) {
			soma = a + soma;
			i++;
			}
		}while(a !=0);
		i--;
		System.out.println("A média dos numeros multiplos de 3 é: " + soma/i);
		
	}

}
