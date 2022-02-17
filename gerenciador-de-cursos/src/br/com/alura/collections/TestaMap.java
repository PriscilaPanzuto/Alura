package br.com.alura.collections;

import java.util.HashMap;
import java.util.Map;

public class TestaMap {

	public static void main(String[] args) {
		
	Map<Integer, String> pessoas = new HashMap<>();
	
	pessoas.put(1, "Priscila");
	pessoas.put(2, "Eduardo");
	pessoas.put(3, "Camila");
	pessoas.put(4, "Lara");
	
	pessoas.keySet().forEach(idade -> {
		System.out.println(pessoas.get(idade));
	});

	}

}
