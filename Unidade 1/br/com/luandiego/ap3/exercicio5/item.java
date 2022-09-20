package br.com.luandiego.ap3.exercicio5;

public class item {
    
    private Produto produto;
    private int qtd;

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    @Override
    public String toString() {
        return "Item"                 +
        "\n Produto = "                + produto           +
        "\n Quantidade no estoque = "  + qtd        + "\n";
    }



}
