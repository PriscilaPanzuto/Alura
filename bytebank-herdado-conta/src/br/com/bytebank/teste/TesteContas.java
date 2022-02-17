package br.com.bytebank.teste;

import br.com.bytebank.modelo.*;

public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(542, 542);
		cc.deposita(200.0);
		
		ContaPoupanca cp = new ContaPoupanca(542, 543);
		cp.deposita(500.0);
		
		cc.transfere(100.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		System.out.println(cc);
		System.out.println(cp);

	}

}
