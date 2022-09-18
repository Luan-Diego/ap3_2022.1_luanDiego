package br.com.luandiego.ap3.exercicio5.ProjetoContato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Agenda {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String nome;
        String email;
        String telefone;
        String dataDeNascimento;

        List<Contato> osContatos = new ArrayList<>();

        while (osContatos.size() < 5) {
            System.out.println("\n Digite o nome do novo contato: ");
            nome = entrada.nextLine();

            System.out.println("\n Digite o e-mail do seu novo contato: ");
            email = entrada.nextLine();

            System.out.println("\n Digite o telefone do seu novo contato: ");
            telefone = entrada.nextLine();

            System.out.println("\n Digite a data de nascimento do novo contato no formato (dia/mês/ano): ");
            dataDeNascimento = entrada.next();

            Contato contato = new Contato(nome, email, telefone,
                    LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));

            osContatos.add(contato);
        }

        osContatos.forEach(System.out::println);
        /*
        for (Contato contato : osContatos) {
            System.out.println(contato);
        }
        */
        entrada.close();
    }
}