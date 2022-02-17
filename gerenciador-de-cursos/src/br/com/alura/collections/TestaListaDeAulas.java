package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {

	public static void main(String[] args) {

		Aula a1 = new Aula("Revisitando os Arrays", 21);
		Aula a2 = new Aula("Lista de Objetos", 20);
		Aula a3 = new Aula("Relacionamento de Listas e Objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<Aula>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		
		System.out.println("-----Após Collections.sort-----");
		
		System.out.println(aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println("-----Após Comparator-----");
		
		System.out.println(aulas);

	}

}
