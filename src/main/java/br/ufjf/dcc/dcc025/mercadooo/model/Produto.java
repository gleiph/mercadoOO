/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.model;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class Produto {
    private String nome;
    private String marca;
    private int quantidadeEstoque;
    private float preco;
    private String descricao;
    private String categoria;
    private float peso;

    public Produto(){
        
    }
            
    
    public Produto(String nome, String marca, int quantidadeEstoque, float preco, String descricao, String categoria, float peso) {
        this.nome = nome;
        this.marca = marca;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
        this.peso = peso;
    }
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque < 0 )
        {
            JOptionPane.showMessageDialog(null, "Quantidade de estoque inválida...");
            return;
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setPreco(float preco) {
        if(preco <= 0 )
        {
            JOptionPane.showMessageDialog(null, "Preço inválido...");
            return;
        }
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPeso(float peso) {
        if(peso < 0 )//Caso o produto seja vendido por quantidade o peso == 0
        {
            JOptionPane.showMessageDialog(null, "Peso inválido...");
            return;
        }
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public float getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", marca=" + marca + ", quantidadeEstoque=" + quantidadeEstoque + ", preco=" + preco + ", descricao=" + descricao + ", categoria=" + categoria + ", peso=" + peso + '}';
    }
    
    
    
}
