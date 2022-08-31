package br.com.luandiego.ap3;

import java.util.Random;
import java.util.Scanner;

public class A4_Questao2 {

public static void main(String[] args) {

    int contadorDeTentativas = 0;

    Scanner scanner = new Scanner(System.in);
    int valorLido;
    boolean fimDeJogo = true;
    Random aleatorio = new Random();

    int numeroAleatorioEntre_0_a_100 = aleatorio.nextInt(100);

    System.out.println(numeroAleatorioEntre_0_a_100);

    while (fimDeJogo) {

        System.out.println("\n Pensei em um número de 0 à 100, qual é?: ");
        valorLido = scanner.nextInt();

        contadorDeTentativas++;

         if (valorLido < numeroAleatorioEntre_0_a_100) {
            System.out.println("\n Olha só... o valor que você digitou é bem menor que o escolhido... mas que pena");

        } else if (valorLido > numeroAleatorioEntre_0_a_100) {
             System.out.println("\n Olha só o valor que você digitou é maior que o escolhido, foi longe em camarada!! ");

         } else {
            fimDeJogo = false;
            System.out.println(contadorDeTentativas);
            System.out.println("\n É isso ai! Você acertou o número, chute certeiro !!");
            scanner.close();
            }

            System.out.println("\n O número escolhido de 0 até 100 é " + numeroAleatorioEntre_0_a_100 + "e as suas tentativas foram "
                    + contadorDeTentativas + "vezes distintas");



        }
    }
}

