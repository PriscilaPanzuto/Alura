package br.com.bytebank.teste.util;

import java.util.ArrayList;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(11, 22);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(11, 33);
		lista.add(cc2);


		for(Conta contas : lista) System.out.println(contas);
		
		System.out.println("Ja existe essa conta? " + lista.contains(cc2));
		
		Conta cc3 = new ContaCorrente(11, 22);
		
		System.out.println("Ja existe essa conta? " + lista.contains(cc3));
		
		
	}

}
