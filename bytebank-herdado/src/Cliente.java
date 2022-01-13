
public class Cliente implements Autenticavel {
	
	private AutenticacaoSistema autenticador;

	public Cliente() {
		this.autenticador = new AutenticacaoSistema();
	}
	
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
