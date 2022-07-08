package br.com.generation.Exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Isira o primeiro número: ");
		int n1 = entrada.nextInt();
		
		System.out.println("Isira o segundo número: ");
		int n2 = entrada.nextInt();
		
		System.out.println("Isira o terceiro número: ");
		int n3 = entrada.nextInt();
		
		
		int maior;
		
		if(n1 > n2 && n1 > n3) {
			maior = n1; 
		}else if(n2 > n3) {
			maior = n2;
		}
			
		else {
			maior = n3;
		}
		
		System.out.println("O maior numero é: " + maior);

}
}