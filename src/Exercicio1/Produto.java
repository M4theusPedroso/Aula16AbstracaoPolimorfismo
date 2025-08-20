package Exercicio1;

public class Produto implements Exibivel {
    String nome;
    double preco;
    String categoria;

    public Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(categoria);
    }
}
