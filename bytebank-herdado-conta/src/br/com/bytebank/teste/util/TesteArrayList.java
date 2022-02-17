package br.com.bytebank.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(11, 22);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(11, 33);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());


		//for(Conta contas : lista) System.out.println(contas);
		
		ArrayList<String> lista2 = new ArrayList(26); //capacidade inicial
		lista2.add("RJ");
		lista2.add("SP");
		//outros estados
		List<String> nova = new ArrayList(lista2); //criando baseado na primeira lista
		nova.add("MG");
		
//		for(Object estados : nova) System.out.println(estados);
		
		//refiz o código com method reference
		nova.forEach(System.out::println);
		
	}

}
