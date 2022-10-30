package br.com.luandiego.ap3.ProjetoFuncionarioSimples;
    
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) throws Exception {
        Scanner entradaPadrao = new Scanner(System.in);

        String nome;
        int idade;
        String cargo;
        double salarioBruto;

        List<Funcionario>funcionarios = new ArrayList<>();

        while(funcionarios.size() <3){
        System.out.println("\n Nome do novo funcionário: ");
        nome = entradaPadrao.next();

        System.out.println("\n Idade do novo funcioário ");
        idade = entradaPadrao.nextInt();

        System.out.println("\n Cargo/função do novo funcioário: ");
        cargo = entradaPadrao.next();

        System.out.println("\n Sálario bruto do novo funcioário ");
        salarioBruto = entradaPadrao.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, cargo, salarioBruto);

        funcionarios.add(funcionario);
        }

        funcionarios.forEach(System.out::println);
        entradaPadrao.close();
    }
}

