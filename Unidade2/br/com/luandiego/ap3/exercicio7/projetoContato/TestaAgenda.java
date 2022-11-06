package Unidade2.br.com.luandiego.ap3.exercicio7.projetoContato;

import java.util.Scanner;

public class TestaAgenda {
    public static void main(String[] args) {
        
        Scanner inputNumero = new Scanner(System.in);
        Scanner inputTexto = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean sair = false;

        do {
            sair = menu(agenda, inputNumero, inputTexto);
        } while (!sair);

        inputNumero.close();
        inputTexto.close();
    }

    public static boolean menu(Agenda agenda, Scanner numero, Scanner texto) {
        
        int opcao = 0;

        try {
            System.out.println("\n 1 - para consultar um contato da agenda");
            System.out.println("2 - para adicionar um contato na agenda.");
            
            opcao = numero.nextInt();
        } catch (Exception e) {
            System.out.println("\n Dado Inválido");
        }

        switch (opcao) {
            case 1:
                try {
                    System.out.println("\n Informe o indentificador do contato:");
                    int identificador = numero.nextInt();
                    agenda.consulta(identificador);
                } catch (Exception e) {
                    System.out.println("\n Dado Inválido");
                }

                break;

            case 2:
                try {
                    System.out.println("\n Informe o nome do contato:");
                    String nome = texto.nextLine();
                    System.out.println("\n Informe o telefone do contato:");
                    String telefone = texto.nextLine();

                    agenda.adicionar(new Contato(nome, telefone));
                } catch (Exception e) {
                    System.out.println("\n Dado Inválido");
                }
                break;
            default:
                return true;
        }
        return false;
    }
}