package bytebank;

public class CriaConta {

		public static void main(String[] args) {
			
			Conta primeiraConta = new Conta(1223, 456978);
			Cliente cliente = new Cliente();
			primeiraConta.setTitular(cliente);
			primeiraConta.getTitular().setNome("Priscila panzuto");
			
			Conta conta2 = new Conta(1223, 569876);
			
			
			System.out.println(primeiraConta.getTitular().getNome());
			System.out.println(Conta.getTotal());
			
			
		}
}
