public interface IConta {
    Boolean sacar(Double valor);
    void depositar(Double Valor);
    Boolean transferir(Double valor, IConta contaDestino);
    void imprimirExtrato();
}
