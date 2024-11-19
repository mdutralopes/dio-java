public class App {
    public static void main(String[] args) throws Exception {
        Cliente marcos = new Cliente();
		marcos.setNome("Marcos");
		
		IConta cc = new ContaCorrente(marcos);
		IConta poupanca = new ContaPoupanca(marcos);

		cc.depositar(100.0);
		if (cc.transferir(80.0, poupanca))
        {
            System.out.println("Transferênca concluída com sucesso!");
        }
        else
            System.out.println("Saldo insuficiente para transferência!");
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
    }
}
