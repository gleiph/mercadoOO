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
 * @author gleip
 */
public class Dados {
 
    public static List<Produto> produtos;
    public static Pedido pedido;
    
    static {
        produtos = new ArrayList<>();
        produtos.add(new Produto("Tv", "Samsung", 2, 3000, "42 polegadas", "Eletronicos", 10.0f, "0000"));
        produtos.add(new Produto("Mortadela", "Aurora", 100, 20.50f, "Mortadela defumada deliciosa", "Alimentos", 1, "0001"));
        produtos.add(new Produto("Pão", "Da casa", 30, 10, "Pão quentinho da casa", "Alimentos", 1, "0002"));
        produtos.add(new Produto("Bicicleta", "Caloi", 2, 1500, "Aro 15 quadro inox", "Brinquedos", 7.0f, "0003"));
        produtos.add(new Produto("Skate", "Santa Cruz", 4, 700, "Skate Profissional Santa Cruz 8.5 Completo Redbones Intruder", "Brinquedos", 3.0f, "0004"));
        
        pedido = new Pedido();
    }
    
}
