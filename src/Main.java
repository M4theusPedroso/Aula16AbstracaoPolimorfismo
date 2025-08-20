//import formas.Circulo;
//import formas.FormaGeometrica;
import Exercicio1.Produto;
import Exercicio2.ContaBancaria;
import formas.Quadrado;

public class Main {
    public static void main(String[] args) {

        // CLASSE: CIRCULO, QUADRADO - calcularArea();
        // A ideia da abstracao eh criar INTERFACES

        //FormaGeometrica forma = new Circulo(4);

        //EXERCICIO 1
        //Produto caneta = new Produto("Caneta BIC", 6.99, "Material Escolar");
        //caneta.exibirDetalhes();

        //EXERCICIO 2
        ContaBancaria conta1 = new ContaBancaria(54789,500);
        conta1.depositar(250);
        conta1.sacar(150);
        conta1.exibirDados();

        System.out.println();

        ContaBancaria conta2 = new ContaBancaria(68478, 250);
        //conta2.depositar(100);
        //conta2.sacar(20);
        //conta2.exibirDados();

        conta1.transferir(conta2, 50);
        conta2.exibirDados();

    }
}