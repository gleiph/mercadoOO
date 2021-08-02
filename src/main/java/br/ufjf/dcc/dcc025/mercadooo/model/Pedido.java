/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author pedro
 */
public class Pedido {
    private List<Item> itens;

    public Pedido() {
        this.itens = new ArrayList<>();
    }
    
    
    public float valorTotal(){
        float valor = 0;
        
        for(Item item : itens){
            valor += item.getTotal();
        }
        
        return valor;
    }
    
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }
    
    
}
