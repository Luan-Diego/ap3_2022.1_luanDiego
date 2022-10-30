package br.com.luandiego.ap3.exercicio5;

public class Supermercado {

    private String produto;
    private double preco;
    private int estoque;
    private String item;
    private String pedido;

    public Supermercado(String produto, double preco, int estoque, String item, String pedido) {
        this.produto = produto;
        this.preco = preco;
        this.estoque = estoque;
        this.item = item;
        this.pedido = pedido;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getPedido() {
        return pedido;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Supermercado" +
                "\n estoque= " + estoque +
                "\n item= " + item +
                "\n pedido= " + pedido +
                "\n preco= " + preco +
                "\n produto =" + produto + "]";
    }

}
