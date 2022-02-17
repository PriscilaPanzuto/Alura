package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String curso1 = "Java 8: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificação Java SE 8 Programmer I";
		
		ArrayList<String> cursos = new ArrayList<String>();
		
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		
		System.out.println("O primeiro curso da lista é o: " + cursos.get(0));
		
		for (String curso : cursos) {
			System.out.println(curso);
		}
		
		Collections.sort(cursos);
		System.out.println("-----Apos ordenar-----");
		System.out.println(cursos);

	}

}
