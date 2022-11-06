package Unidade2.br.com.luandiego.ap3.exercicio7.projetoContato;


import java.util.ArrayList;
import java.util.List;



public class Agenda {
    
    private List<Contato> contatos = new ArrayList<>();

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public void adicionar(Contato contato) {
        try {
            if (contatos.size() < 20) {
                this.contatos.add(contato);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("\n Agenda Cheia!");
        }
    }

    public void consulta(int identificador) {
        try {
            boolean encontrol = false;

            for (Contato contato : this.contatos) {
                if (contato.getIdentificador() == identificador) {
                    System.out.println(contato);
                    encontrol = true;
                    break;
                }
            }

            if(!encontrol){
                throw new Exception();
            }        
        } catch (Exception e) {
            System.out.println("\n Contato não Existente");
        }
    }
}