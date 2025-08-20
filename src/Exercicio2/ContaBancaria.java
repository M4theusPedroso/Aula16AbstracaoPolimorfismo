package Exercicio2;

public class ContaBancaria implements OperacoesConta {
    private int numeroConta;
    private double saldo;
    private double saldoInicial;

    public ContaBancaria(int numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldoInicial = saldoInicial;
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo ) {
            System.out.println("Erro: Valor inserido maior que o Saldo.");
        }

    }

    @Override
    public double consultarSaldo() {
        return 0;



    }
}
