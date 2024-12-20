public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public Boolean sacar(Double valor) {
		if (valor <= saldo)
        {
            saldo -= valor;
            return true;
        }
        else
        return false;
	}

	@Override
	public void depositar(Double valor) {
		saldo += valor;
	}

	@Override
	public Boolean transferir(Double valor, IConta contaDestino) {
        if (this.sacar(valor))
        {
		    contaDestino.depositar(valor);
            return true;
        }
        else
            return false;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
