import java.util.Scanner;

public class A3_Questao3_luanDiego {
    public static void main(String[] args){
        Scanner entradaPadrao = new Scanner(System.in);
        int age;

        int contagem = 0;
        for(int i = 0; i < 4096; i++){
            System.out.println("Insira a idade:");
            age = entradaPadrao.nextInt();
        
            if(age >= 18){
                contagem = contagem + 1;
            }
        }  
        
        System.out.println("A quantidade de pessoas acima de 18 anos" + contagem);
        
        entradaPadrao.close();
    }
}
