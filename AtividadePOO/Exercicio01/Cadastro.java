package br.com.generation.Exercicio01;

public class Cadastro {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.setNome("Ana");
		c1.setEmail("ana-2022@gmail.com");
		c1.setTel("9090-7070");
		
		System.out.println("Cliente: " + c1.getNome());
		System.out.println("Email: " + c1.getEmail());
		System.out.println("Telefone: " + c1.getTel());
		
		
		
	}

}
