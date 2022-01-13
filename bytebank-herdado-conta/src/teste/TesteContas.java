package teste;
public class TesteContas {

	public static void main(String[] args) {
		
		modelo.ContaCorrente cc = new modelo.ContaCorrente(542, 542);
		cc.deposita(200.0);
		
		modelo.ContaPoupanca cp = new modelo.ContaPoupanca(542, 543);
		cp.deposita(500.0);
		
		cc.transfere(100.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());

	}

}
