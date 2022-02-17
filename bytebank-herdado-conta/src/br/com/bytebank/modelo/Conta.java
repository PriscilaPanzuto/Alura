package br.com.bytebank.modelo;

public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta segundaConta) {
		if(this.saldo >= valor) {
			this.saca(valor);
			segundaConta.deposita(valor);
			return true;
		} else {
			System.out.println("Não tem saldo suficiente!");
			return false;
		}	
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	public String ordenaClientePorNome() {
		return this.getTitular().getNome();
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) return false;
		
		if (this.numero != outra.numero) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ", Agência: " + this.agencia + ", Titular: " + this.titular.getNome();
	}
}
