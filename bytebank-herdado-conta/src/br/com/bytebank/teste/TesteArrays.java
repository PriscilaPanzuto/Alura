package br.com.bytebank.teste;

import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;

public class TesteArrays {

	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente(11, 22);
		ContaPoupanca cp = new ContaPoupanca(33, 44);
		
		Conta[] contas = new Conta[2];
		
		contas[0] = cc;
		contas[1] = cp;
		
		System.out.println(contas[0].getNumero());
		System.out.println(contas[1].getNumero());

	}

}
