package Unidade2.br.com.luandiego.ap3.exercicio6.projetocarro;

import java.time.LocalDate;

public class Marca {
    
    private String nome;
    private int numDeModelos;
    private LocalDate anoLancamento;
    private int codigoIdentificador;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNrDeModelos() {
        return numDeModelos;
    }

    public void setNrDeModelos(int nrDeModelos) {
        this.numDeModelos = nrDeModelos;
    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    @Override
    public String toString() {
        return ""                         +
        "\n Nome = "                      + nome                + 
        "\n Número de Modelos = "         + numDeModelos         + 
        "\n Ano de Lançamento = "         + anoLancamento       + 
        "\n Código do Identificador = "   + codigoIdentificador + "\n";
    }
}