package br.com.generation.quintaAtividade;

public class TestaTudo {

	public static void main(String[] args) {
		
		Cachorro meuCachorro = new Cachorro();
		meuCachorro.setNome("Rex");
		meuCachorro.setIdade(7);
		System.out.println(meuCachorro.getNome());
		System.out.println(meuCachorro.getIdade());
		meuCachorro.somAnimal();
		meuCachorro.correr();
		
		Cavalo meuCavalo = new Cavalo();
		meuCavalo.setNome("Azarão");
		meuCavalo.setIdade(10);
		
		
		System.out.println(meuCavalo.getNome());
		System.out.println(meuCavalo.getIdade());
		meuCavalo.somAnimal();
		meuCavalo.correr();
		
		Preguica minhaPreguica = new Preguica();
		minhaPreguica.setNome("Ted");
		minhaPreguica.setIdade(2);
		
		
		System.out.println(minhaPreguica.getNome());
		System.out.println(minhaPreguica.getIdade());
		minhaPreguica.somAnimal();
		minhaPreguica.subirNaArvore();

	}
	
   
}
