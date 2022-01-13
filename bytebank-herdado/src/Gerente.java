
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoSistema autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoSistema();
	}
	
	//Bonificacao do Gerente, salario mais a bonificacao do funcionario
	public double getBonificacao() {
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
