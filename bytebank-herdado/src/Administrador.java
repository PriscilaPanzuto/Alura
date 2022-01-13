
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoSistema autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoSistema();
	}
	
	@Override
	public double getBonificacao() {
		return 250;
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
