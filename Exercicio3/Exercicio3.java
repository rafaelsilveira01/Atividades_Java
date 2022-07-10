package br.com.generation.Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
	
		int infantil = 0;
				
		System.out.println("Se você tem entre 10 e 25 anos, digite sua idade para saber sua faixa etaria: ");
		infantil = entrada.nextInt(); 	
		
		if(infantil >= 10 && infantil <= 14) {
		System.out.println("Sua faixa etaria é: infantil");
		  		
	} else if(infantil >= 15 && infantil <= 17) {
		System.out.println("Sua faixa etaria é: juvenil");
		
	}else if(infantil >= 18 && infantil <= 25) {
		System.out.println("Sua faixa etaria é: adulto");
		

} else {
	System.out.println("você não se enquadra em nenhuma faixa etaria.");
}

	}

	private static Scanner nextInt() {
		
		return null;
	}
}