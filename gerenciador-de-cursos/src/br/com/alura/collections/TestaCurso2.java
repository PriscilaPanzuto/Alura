package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	
	public static void main(String[] args) {
		

	Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
	
	javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
	javaColecoes.adiciona(new Aula("Criando uma aula", 21));
	javaColecoes.adiciona(new Aula("Modelando com Colecoes", 18));
	
	List<Aula> aulasImutaveis = javaColecoes.getAulas();
	
	System.out.println(aulasImutaveis);
	
	List<Aula> aulasMutaveis = new ArrayList<Aula>(aulasImutaveis);
	Collections.sort(aulasMutaveis);
	
	System.out.println("\n---- Após criar novo ArrayList ----\n");
	System.out.println(aulasMutaveis);
	
	System.out.println("\n---- Tempo Total do Curso ----\n");
	
	System.out.println(javaColecoes.getTempoTotal());
	
	System.out.println("\n---- Cursos ----\n");
	
	System.out.println(javaColecoes);
	
	

}
	
}
