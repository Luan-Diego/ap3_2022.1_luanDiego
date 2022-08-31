package br.com.luandiego.ap3.exercicio2.A3_Questao5_luanDiego5;

    public class Caneta{
        String modelo;
        String cor;
        Double numero;
        Double tinta;
        Boolean tampa = true;
    
        public String getModelo(){
            return modelo;
    
        }
       public String getCor(){
            return cor;
       } 
    
       public double getNumero(){
            return numero;
       }
    
       public double getTinta(){
            return tinta;
       }
    
       public boolean Tampa(){
              return tampa;
       }
       public void setModelo (String modelo){
         this.modelo = modelo;
       }
       public void setCor (String cor){
         this.cor = cor;
       }
       public void setNumero (double numero){
         this.numero = numero;
       }
    
       public void setTinta (double tinta){
         this.tinta = tinta;
       }
       public void setTampa (boolean tampa){
         this.tampa = tampa;
       }
       public void botarTampa(){
         if (tampa){
              System.out.println("Caneta tampada nesse momento.");
         }else{
              tampa = true;
              System.out.println("Caneta tampada com sucesso.");
         }
       }
    
       public void tirarTampa(){
         if (tampa){
              tampa = false;
              System.out.println("A tampa foi removida da caneta.")
         }else{
              System.out.println("Caneta já foi destampada no momento. ")
         }
       }
    
       @Override
       public String toString(){
         return modelo +"\n" cor +"\n" numero +"\n" tinta +"\n" tampa
       }
    }
}
