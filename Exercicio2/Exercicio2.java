package br.com.generation.Exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner crescente = new Scanner(System.in);
		
		int n1, n2, n3, auxiliar;
		
		System.out.println("Insira o primeiro numero: ");
		n1 = crescente.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		n2 = crescente.nextInt();
		
		System.out.println("Insira o terceiro numero: ");
		n3 = crescente.nextInt();
		
		if(n1 > n2) {
		   auxiliar = n1;
		   n1 = n2;
		   n2 = auxiliar;
		   
		} else if(n2 > n3) {
			auxiliar = n2;
			n2 = n3;
			n3 = auxiliar;
					
		} else {
			auxiliar = n3;
			n3 = n1;
			n1 = auxiliar;
		}
		 System.out.println("Ordem crescente: ");
		 System.out.println(n1 + " " + n2 + " " + n3);
		 
				
			}
		
				
		
	}


