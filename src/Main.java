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
        ContaBancaria conta1 = new ContaBancaria(54789,798.46);
        conta1.depositar(500);
        conta1.sacar(250);

        conta1.consultarSaldo();

    }
}