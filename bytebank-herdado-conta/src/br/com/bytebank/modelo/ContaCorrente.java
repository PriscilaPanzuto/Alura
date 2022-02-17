package br.com.bytebank.modelo;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valosASacar = valor + 0.2;
		return super.saca(valosASacar);
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}

}
