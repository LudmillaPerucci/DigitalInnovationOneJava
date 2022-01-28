
public class Main {

	public static void main(String[] args) {
		Cliente Ludmilla = new Cliente();
		Ludmilla.setNome("Ludmilla");
		
		Conta cc = new ContaCorrente(Ludmilla);
		Conta poupanca = new ContaPoupanca(Ludmilla);
		
		cc.depositar(100);
		cc.transferir(100,poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
				
	}

}
