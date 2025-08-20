package Exercicio2;

public interface OperacoesConta {
    void depositar(double valor);
    void sacar(double valor);
    void transferir(ContaBancaria destino, double valor);
    double consultarSaldo();

}
