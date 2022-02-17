package br.com.alura.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestaCursocomAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Criando uma aula", 21));
		javaColecoes.adiciona(new Aula("Modelando com Colecoes", 18));

		Aluno a1 = new Aluno("Priscila Panzuto", 1234);
		Aluno a2 = new Aluno("Lara Vincenzo", 2345);
		Aluno a3 = new Aluno("Eduardo Vincenzo", 4567);
		Aluno a4 = new Aluno("Julia", 1564);
		Aluno a5 = new Aluno("Ignez", 1549);
		Aluno a6 = new Aluno("Joao", 9875);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		javaColecoes.matricula(a5);
		javaColecoes.matricula(a6);

		System.out.println("Alunos Matriculados:\n");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});

		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a5);
		alunos.add(a6);

//		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
//
//		System.out.println("\n-----------------------\n");
//
//		System.out.println(alunosSincronizados);
//
//		alunosSincronizados.remove(a5);
//
//		System.out.println(alunosSincronizados);
//
//		System.out.println("Alunos Matriculados:\n");
//		javaColecoes.getAlunos().forEach(a -> {
//			System.out.println(a);
//		});

//		System.out.println("O aluno" + a1 + " está matriculado?");
//		System.out.println(javaColecoes.estaMatriculado(a1));
//		
//		Aluno priscila = new Aluno("Priscila Panzuto", 1234);
//		System.out.println("O aluno " + a1 + "é igual ao aluno " + priscila + "?");
//		System.out.println(a1.hashCode() == priscila.hashCode());
		
		System.out.println(javaColecoes.buscaMatriculado(1564));
	}

}
