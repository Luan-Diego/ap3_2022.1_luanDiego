
public class TestaCaneta {

    public static void main (String[] args){
        Caneta pineApple = new Caneta();

        pineApple.setModelo("nanquim");
        pineApple.setCor("preta");
        pineApple.setNumero(36);
        pineApple.setTinta(54);
        pineApple.setTampa(true);

        System.out.println (pineApple);

        pineApple.tirarTampa();
        System.out.println(pineApple);
        
        pineApple.botarTampa();
        System.out.println(pineApple + "\n");
    }
}
    
