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
    private String codigo;

    public Produto(){
        
    }
            
    
    public Produto(String nome, String marca, int quantidadeEstoque, float preco, String descricao, String categoria, float peso, String codigo) {
        this.nome = nome;
        this.marca = marca;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
        this.peso = peso;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }


    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque < 0 )
        {
            JOptionPane.showMessageDialog(null, "Quantidade de estoque inválida...");
            return;
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }
    

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        if(preco <= 0 )
        {
            JOptionPane.showMessageDialog(null, "Preço inválido...");
            return;
        }
        this.preco = preco;
    }
    

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        if(peso < 0 )//Caso o produto seja vendido por quantidade o peso == 0
        {
            JOptionPane.showMessageDialog(null, "Peso inválido...");
            return;
        }
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
    
}
