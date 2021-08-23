/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.utils;

import br.ufjf.dcc.dcc025.mercadooo.model.Produto;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

/**
 *
 * @author gleip
 */
public class JSON {
    
    public static String toJson(Produto produto){
        
        Gson gson = new Gson();
        String toJson = gson.toJson(produto);
        return toJson;
    }
    
    public static Produto toProduto(String produto){
        
        Gson gson = new Gson();
        Produto toJson = gson.fromJson(produto, Produto.class);
        return toJson;
    }
    
    public static String toJson(List<Produto> produtos) {
        Gson gson = new Gson();
        String json = gson.toJson(produtos);
        return json;
    }
    
    public static List<Produto> toProdutos(String conteudo) {
        Gson gson = new Gson();
        Type produtosTipo = new TypeToken<ArrayList<Produto>>() {
        }.getType();
        List<Produto> produtos = gson.fromJson(conteudo, produtosTipo);

        return produtos;
    }
    
    public static void main(String[] args) {
        
        List<Produto> produtos = new ArrayList<>(), produtosResultado;
        
        Produto p = new Produto("TV", "LG", 5, 253.00f, "TV boa", "Eletronico", 10000, "123456");
        
        produtos.add(p);
        produtos.add(p);
        
        String toJson = toJson(produtos);
        
        System.out.println(toJson);
        
        produtosResultado = toProdutos(toJson);
        
        System.out.println(produtosResultado);
    }
    
}
