import java.util.Scanner;
    
    public class A3_Questao4_luanDiego {
   
   public static void main (String[] args){
    Scanner entradaPadrao = new Scanner (System.in);
    int valorEm [] = new int [30];

    for (int i = 0; i < valorem.length; i++){
        System.out.println ("Inserir valor:");
        valorEm [i] = entradaPadrao.nextInt();
    }

    for (int i = 0; i < valorem.length; i++) {
        if (valorEm [i] == 7){
            valorEm [i] = -7;
        }
    }

    for (int i = 0; i < valorem.length; i++){
            System.out.println("Resultado final: " + valorEm[i]);

    }
    entradaPadrao.close();
    }
}
