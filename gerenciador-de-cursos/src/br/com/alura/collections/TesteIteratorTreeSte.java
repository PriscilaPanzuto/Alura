package br.com.alura.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteIteratorTreeSte {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Priscila", 40);
		Funcionario f2 = new Funcionario("Lara", 9);
		Funcionario f3 = new Funcionario("Eduardo", 41);
		
		Set<Funcionario> funcionarios = new TreeSet<Funcionario>(new OrdenaPorIdade());
		funcionarios.add(f1);
		funcionarios.add(f2);
		funcionarios.add(f3);
		
		Iterator<Funcionario> iterator = funcionarios.iterator();
		
		while(iterator.hasNext()) {
			Funcionario proximoFuncionario = iterator.next();
			System.out.println(proximoFuncionario);
		}

	}

}
