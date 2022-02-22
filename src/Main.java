
public class Main {

	public static void main(String[] args) {
		Cliente josesclaudio = new Cliente();
		josesclaudio.setNome("Josesclaudio");
		
		Conta cc = new ContaCorrente(josesclaudio);
		Conta poupanca = new ContaPoupanca(josesclaudio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
