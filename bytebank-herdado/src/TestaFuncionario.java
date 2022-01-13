public class TestaFuncionario {

	public static void main(String[] args) {
		
		Gerente funcionario = new Gerente();
		funcionario.setNome("Priscila");
		funcionario.setCpf("290.199.456-55");
		funcionario.setSalario(5000.0);
		
		EditorVideo ed = new EditorVideo();
		ed.setSalario(2500.0);
				
		
		ControleBonificacao boni = new ControleBonificacao();
		
		boni.registra(funcionario);
		boni.registra(ed);
		
		System.out.println(boni.getSomaBonificacao());
		
		Administrador adm = new Administrador();
		SistemaInterno si = new SistemaInterno();
		Cliente c = new Cliente();
		c.setSenha(2222);
		adm.setSenha(2222);
		funcionario.setSenha(3333);
		
		si.autentica(adm);
		si.autentica(funcionario);
		si.autentica(c);

		
		
	}
	
}
