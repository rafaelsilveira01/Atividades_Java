package be.com.generation.Exercicio4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");
		
		int num, pote;
		
		num = entrada.nextInt();
		pote = (num%2);
		
		if (pote == 0) {
		System.out.println("O número "  +num+ " é par.");
		
		}else {
		System.out.println("O número "  +num+  " é impar.");	
		}

}
}