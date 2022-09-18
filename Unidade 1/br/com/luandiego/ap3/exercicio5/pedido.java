package br.com.luandiego.ap3.exercicio5;

import java.util.List;
import java.util.ArrayList;


public class pedido<Item> {
    
    private List <Item> itens = new ArrayList<>();
    
    public void Compra(Item item) {
        itens.add(item);
    }

    public void Remove(Item item) {
        itens.remove(item);
    }

    public Item Altera(Item item) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).equals(item)) {
                itens.set(i, item);
            }
        }
        return item;
    }

    public void itens(){
        for (Item item: itens) {
            System.out.println(item);
        }
    }
}
