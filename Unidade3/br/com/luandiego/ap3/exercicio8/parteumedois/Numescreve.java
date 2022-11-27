package Unidade3.br.com.luandiego.ap3.exercicio8.parteumedois;

import java.util.Random;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Numescreve {
 
    public static void main(String[] args) {

        Random numero = new Random();

        try {
            FileWriter arquivo = new FileWriter("numerosAleatorios.txt", true);
            PrintWriter impressora = new PrintWriter(arquivo);
            
            for (int i = 0; i < 200; i++) {
                impressora.println(numero.nextInt(1000));
                impressora.flush();
            }
            impressora.close();

        } catch(Exception e ) {
            e.printStackTrace();
        }
    }
}

