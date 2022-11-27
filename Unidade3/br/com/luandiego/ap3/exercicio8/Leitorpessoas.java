package Unidade3.br.com.luandiego.ap3.exercicio8;

import java.io.BufferedReader;
import java.io.FileReader;

public class Leitorpessoas {
    public static void main(String[] args) {

        int contador = 0;

        try {
            FileReader arquivo = new FileReader("pessoas.csv");
            BufferedReader leitor = new BufferedReader(arquivo);

            while (leitor.ready()) {
                String linhaLida = leitor.readLine();

                if (linhaLida.split(",")[4].equalsIgnoreCase("policial")) {
                    contador++;
                }
            }

            System.out.println("\n Existem " + contador + " policias");

            leitor.close();
            arquivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}