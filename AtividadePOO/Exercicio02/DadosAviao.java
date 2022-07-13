package br.com.generation.Exercicio02;

public class DadosAviao {

	public static void main(String[] args) {
		
		Aviao x = new Aviao();
		
		x.setModelo("Boing");
		x.setAno("2020");
		x.setCapacidade("250 pessoas");
		
		System.out.println("Modelo: " + x.getModelo());
		System.out.println("Ano: " + x.getAno());
		System.out.println("Capacidade: " + x.getCapacidade());

	}

}
