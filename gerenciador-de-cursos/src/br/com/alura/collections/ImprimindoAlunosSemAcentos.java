package br.com.alura.collections;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<String>();
		
		alunos.add("Paulo");
		alunos.add("Priscila");
		alunos.add("Lara");
		alunos.add("Eduardo");
		alunos.add("Julia");
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		System.out.println(alunos.size());
		
		alunos.add("Eduardo");
		
		System.out.println(alunos.size());
	}

}
