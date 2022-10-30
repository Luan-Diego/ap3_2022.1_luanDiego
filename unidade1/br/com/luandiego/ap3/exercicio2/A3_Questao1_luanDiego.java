package br.com.luandiego.ap3.exercicio2;

public class A3_Questao1_luanDiego {
  
    public static void main (String[] args){
        Scanner entradaPadrao = new Scanner (System.in);
        Double valor;

        System.out.println(" Quantidade latão em KG:");
        valor = entradaPadrao.nextDouble();

        System.out.println("Quantidade de cobre em KG: " + valor * 0.7);
        System.out.println("Quantidade de zinco em KG: " + valor * 0.3);

        entradaPadrao.close;
    }
}

