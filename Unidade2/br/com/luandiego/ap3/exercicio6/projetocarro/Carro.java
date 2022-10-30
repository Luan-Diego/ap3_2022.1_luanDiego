package Unidade2.br.com.luandiego.ap3.exercicio6.projetocarro;


import java.time.LocalDate;

public class Carro {
    
    private String modelo;
    private String cor;
    private LocalDate ano;
    private Marca marca;
    private String numChassi;
    private String proprietario;
    private int velocidadeMaxima;
    private int velocidadeAtual;
    private int numeroPortas;
    private boolean tetoSolar;
    private int quantidadeMarchas;
    private Cambio cambio;
    private int volumeTanque;

    public Carro(String proprietario){
        this.proprietario = proprietario;
    }

    public void acelerar(){
        if(this.velocidadeAtual < this.velocidadeMaxima){
            this.velocidadeAtual++;
            System.out.println("Acelerando");
        } else {
            System.out.println("O carro já atingiu sua velocidade máxima!");
        }
    }

    public void frear(){
        if(this.velocidadeAtual > 0){
            this.velocidadeAtual = 0;
            System.out.println("Freando");
        } else {
            System.out.println("O carro já está parado!");
        }
    }

    public void trocarMarcha(int novaMarcha){
        if(novaMarcha == -1 && this.velocidadeAtual == 0){
            this.quantidadeMarchas = novaMarcha;
        } else if (novaMarcha > 0){
            this.quantidadeMarchas = novaMarcha;
        }
    }

    public void reduzirMarchar(){
        if(this.quantidadeMarchas > 0){
            this.quantidadeMarchas--;
        } else {
            System.out.println("no momento você está na menor marcha");
        }
    }

    public void calcularAutonomia(int litrosHora){
        System.out.println("Autonomia de " + this.volumeTanque*litrosHora*this.velocidadeMaxima + "Km com o volume de tanque atual");
    }

    public void verificarTamque(){
        System.out.println("Volume do tanque " + this.volumeTanque + " Litros");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(String numChassi) {
        this.numChassi = numChassi;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public boolean isTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public int getQuantidadeMarchas() {
        return quantidadeMarchas;
    }

    public void setQuantidadeMarchas(int quantidadeMarchas) {
        this.quantidadeMarchas = quantidadeMarchas;
    }

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public int getVolumeTanque() {
        return volumeTanque;
    }

    public void setVolumeTanque(int volumeTanque) {
        this.volumeTanque = volumeTanque;
    }

    @Override
    public String toString() {
        return "Carro"               + 
        "\n Modelo = "                + modelo             + 
        "\n Cor = "                   + cor                + 
        "\n Ano = "                   + ano                + 
        "\n Marca = "                 + marca              + 
        "\n Número do Chassi = "      + numChassi          + 
        "\n Proprietário = "          + proprietario       + 
        "\n Velocidade Máxima = "     + velocidadeMaxima   + 
        "\n Velocidade Atual = "      + velocidadeAtual    + 
        "\n Número de Portas = "      + numeroPortas       + 
        "\n Teto Solar = "            + tetoSolar          + 
        "\n Quantidade de Marchas = " + quantidadeMarchas  + 
        "\n Câmbio = "                + cambio             + 
        "\n Volume do Tanque = "      + volumeTanque       + "\n";
    }
}