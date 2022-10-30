package Unidade2.br.com.luandiego.ap3.exercicio6.projetocarro;

import java.util.ArrayList;
import java.util.List;

import Unidade2.br.com.luandiego.ap3.exercicio6.projetocarro.endereco.Endereco;

public class Dono implements Pessoa{
    
    private String nome;
    private Endereco endereco;
    private List<Carro> carros;

    public Dono(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.carros = new ArrayList<>();
    }

    @Override
    public String getNomeCompleto() {
        return this.nome;
    }

    @Override
    public void setNomeCompleto(String nomeCompleto) {
        this.nome = nomeCompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }  

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return "\n Dono"     + 
        "\n Nome = "         + nome       +  
        "\n Endereço = "     + endereco   + "\n";    
    }  
}