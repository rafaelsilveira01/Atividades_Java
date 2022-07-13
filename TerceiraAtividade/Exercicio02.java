package br.com.generation.VetorMatriz;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		/* 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
			  que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		      imprima a média aritmética dos lançamentos, contabilize e apresente também
		      quantas foram as ocorrências da maior pontuação.*/
		Random start = new Random();
	    int rodadas[] = new int[10];
	    int maiorNum = 0;
	    int qtdMaiorNum = 0;
	    int media = 0;

	    for (int i = 0; i < rodadas.length; i++) {
	      rodadas[i] = start.nextInt(1, 7);
	      if (maiorNum < rodadas[i]){
	        maiorNum = rodadas[i];
	        qtdMaiorNum = 1;
	      }else if (maiorNum == rodadas[i]){
	        qtdMaiorNum++;
	      }
	      media += rodadas[i];
	    }
	    for (int i = 0; i < rodadas.length; i++) {
	      System.out.print(rodadas[i] + " | ");
	    }
	    System.out.println();
	    System.out.println("\nMaior: " + maiorNum);
	    System.out.println("Maior Qtd: " + qtdMaiorNum);
	    System.out.println("Media: " + (media / rodadas.length));

	  }
	}