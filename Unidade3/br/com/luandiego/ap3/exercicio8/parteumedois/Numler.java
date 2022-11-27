package Unidade3.br.com.luandiego.ap3.exercicio8.parteumedois;

import java.io.BufferedReader;
import java.io.FileReader;

public class Numler {
    public static void main(String[] args) {

        int acumulador = 0;
        int contador = 0;

        try {
            FileReader arquivo = new FileReader("numerosAleatorios.txt");
            BufferedReader leitor = new BufferedReader(arquivo);

            while (leitor.ready()) {
                String linhaLida = leitor.readLine();

                acumulador = acumulador + Integer.parseInt(linhaLida);
                contador++;
            }

            System.out.println("\n Media de números lidos:\n" + acumulador / contador);
            System.out.println("\n Linhas lidas:\n" + contador);

            leitor.close();
            arquivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

