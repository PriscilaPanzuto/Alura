package br.com.bytebank.teste;

import br.com.bytebank.modelo.Cliente;
import br.com.bytebank.modelo.Conta;
import br.com.bytebank.modelo.ContaCorrente;
import br.com.bytebank.modelo.ContaPoupanca;
import br.com.bytebank.modelo.GuardadorDeObject;

public class TestaGuardadorDeObject {

	public static void main(String[] args) {
	
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		ContaPoupanca cp1 = new ContaPoupanca(11, 33);
		
		GuardadorDeObject ref = new GuardadorDeObject();
		
		ref.adiciona(cc1);
		ref.adiciona(cp1);
		
		Conta refObject = (Conta) ref.getReferencia(0);
		
		System.out.println(refObject.getNumero());
		

	}

}
