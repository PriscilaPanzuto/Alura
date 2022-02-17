package br.com.alura.collections;

public class TesteCurso {

	public static void main(String[] args) {


		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com Colecoes", 18));
		
		System.out.println(javaColecoes.getAulas());


	}

}
