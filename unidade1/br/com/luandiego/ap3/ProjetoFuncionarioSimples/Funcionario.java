package br.com.luandiego.ap3.ProjetoFuncionarioSimples;

public class Funcionario {

    private String nome;
    private int idade;
    private String cargo;
    private double salarioBruto;

    public Funcionario (String nome, int idade, String cargo, double salarioBruto) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salarioBruto= salarioBruto;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade (int idade){
        this.idade = idade;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalarioBruto(){
        return salarioBruto;
    }
    public void setSalario(double salario){
        this.salarioBruto=salario;
    }

    public double getSalarioLiquido(){
        return this.salarioBruto * 0.85;
    }

    public double getSalarioAnual(){
        return this.salarioBruto * 12;
    }


    @Override
    public String toString(){
        return  "Funcionário = ["      +
        "Nome = "               + nome              + ", " +
        "Idade = "              + idade             + ", " +
        "Cargo = "              + cargo             + ", " +
        "salário Bruto = "      + salarioBruto      + ", " +
        "salário Liquído = "    + getSalarioLiquido()+ ", "+
        "salario Anual ="       + getSalarioAnual()  + "] ";
    }

}
