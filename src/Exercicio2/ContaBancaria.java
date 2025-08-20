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
        saldoInicial += valor;

    }

    @Override
    public void sacar(double valor) {
        if (valor > saldoInicial ) {
            System.out.println("Erro: Valor inserido maior que o Saldo.");
        } else {
            saldoInicial -= valor;
        }

    }

    @Override
    public double consultarSaldo() {
        return 0;

    }
    public void exibirDados() {
        System.out.println(numeroConta);
        System.out.println(saldoInicial);

    }
}
