/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.model;

/**
 *
 * @author pedro
 */
public class Item {
    private Produto produto;
    private int quantidade;

    public Item() {
    }
    
    public Item(Produto item, int quantidade) {
        this.produto = item;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto item) {
        this.produto = item;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public float getTotal(){
        return quantidade * produto.getPreco();
    }
    
}
