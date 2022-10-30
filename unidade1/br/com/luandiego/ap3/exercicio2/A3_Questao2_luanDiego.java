package br.com.luandiego.ap3.exercicio2;

public class A3_Questao2_luanDiego  {
    public static void main (String[] args){
       Scanner entradaPadrao = new Scanner(System.in);
       String nome;
       int idade;
 
       System.out.println("Digite o seu nome");
       nome = entradaPadrao.nextLine();
       System.out.println("Digite sua idade:");
       idade = entradaPadrao.nextInt();
 
       System.out.println(nome + "você já viveu: " + idade * 365);
 
       entradaPadrao.close();
 
    } 
 }
