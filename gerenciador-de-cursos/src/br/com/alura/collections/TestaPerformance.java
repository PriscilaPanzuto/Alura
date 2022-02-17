package br.com.alura.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaPerformance {

	public static void main(String[] args) {

		Collection<Integer> numerosArray = new ArrayList<Integer>();
		
		long inicioArray = System.currentTimeMillis();
		
		for(int i = 1; i <= 50000; i++	) {
			numerosArray.add(i);
		}
		
		for (Integer numero : numerosArray) {
			numerosArray.contains(numero);
		}
		
		long fimArray = System.currentTimeMillis();
		
		long tempoTotalArray = fimArray - inicioArray;
		
		System.out.println("----- Com ArrayList -----\n");
		
		System.out.println("Tempo total gasto: " + tempoTotalArray);
		
		System.out.println("\n ----- Com HashSet -----\n");
		
		Set<Integer> numerosHashSet = new HashSet<Integer>();
		
		long inicioHashSet = System.currentTimeMillis();
		
		for(int i = 1; i <= 50000; i++	) {
			numerosHashSet.add(i);
		}
		
		for (Integer numero2 : numerosHashSet) {
			numerosHashSet.contains(numero2);
		}
		
		long fimHashSet = System.currentTimeMillis();
		
		long tempoTotalHashSet = fimHashSet - inicioHashSet;
		
		System.out.println("Tempo total gasto: " + tempoTotalHashSet);

	}

}
