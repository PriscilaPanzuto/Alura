package br.com.bytebank.modelo;

public class GuardadorDeObject {
	
	private Object[] referencias;
	private int posicao;
	
	public GuardadorDeObject() {
		referencias = new Object[10];
		posicao = 0;
	}

	public void adiciona(Object obj) {
		this.referencias[this.posicao] = obj;
		posicao++;
		
	}

	public int quantidadeDeElementos() {
		return posicao;
	}

	public Object getReferencia(int i) {
		return referencias[i];
	}

}
