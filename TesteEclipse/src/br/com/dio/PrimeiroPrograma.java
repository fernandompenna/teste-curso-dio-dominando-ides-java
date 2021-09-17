package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a = 2; int b = 3; System.out.println("Hello Word "+(a+b));
		 */
		Gato gato = new Gato();
		Gato gato1 = new Gato();
		Livros livros = new Livros(); // Não precisa importar, pois está no mesmo arquivo
		System.out.println(gato);
		System.out.println(livros);
	}

}

class Livros {
	private String nome;
	private Integer npag;
}