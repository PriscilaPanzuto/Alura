
public class ControleBonificacao {
	
	double somaBonificacao;
	
	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.somaBonificacao = this.somaBonificacao + bonificacao;
	}

		public double getSomaBonificacao() {
			return somaBonificacao;
		}
}
