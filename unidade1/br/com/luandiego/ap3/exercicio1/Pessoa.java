package br.com.luandiego.ap3.exercicio1;

public class Pessoa{
    private String nome;
    private int idade;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome da Pessoa: "+this.nome+"/n"+
                "Idade da Pessoa: "+this.idade;
    }
}