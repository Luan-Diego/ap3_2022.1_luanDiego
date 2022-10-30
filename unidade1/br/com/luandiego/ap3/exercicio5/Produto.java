package br.com.luandiego.ap3.exercicio5;

public class Produto {

    private double preco;
    private int qtd_estoque;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    @Override
    public String toString() {
        return "Produto" +
                "\npreço = " + preco +
                "\nQuantidade no estoque = " + qtd_estoque + "\n";
    }

}
