import java.util.Scanner;

public class A3_Questao6_luanDiego {

    public static void main(String[] args) {
        Scanner veloz= new Scanner(System.in);

        int velocidadeMaxima = 60;
        int velocidadeInicial = 0;

        System.out.println("insira a velocidade de seu veiculo: ");
        velocidadeInicial = veloz.nextInt();

        int velozResult = velocidadeInicial - velocidadeMaxima;

        if (velozResult > 0 && velozResult <= 10) {
            System.out.println("O motorista excedeu a velocidade e deve pagar R$50 em multa");

        } else if (velozResult >= 11 && velozResult <= 30) {
            System.out.println("O motorista excedeu a velocidade e deve pagar R$100 em multa");

        } else if (velozResult > 30) {
            System.out.println("O motorista excedeu a velocidade e deve pagar R$200 em multa");

        } else {
            System.out.println("Nenhuma multa precisa ser paga pelo motorista");
        }
        veloz.close();
    }
}