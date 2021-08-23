/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.controller;

import br.ufjf.dcc.dcc025.mercadooo.model.Dados;
import br.ufjf.dcc.dcc025.mercadooo.model.Produto;
import br.ufjf.dcc.dcc025.mercadooo.view.ProdutoGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author gleip
 */
public class AdicionaProduto implements ActionListener{

    ProdutoGUI produtoGUI;

    public AdicionaProduto(ProdutoGUI produtoGUI) {
        this.produtoGUI = produtoGUI;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) throws NumberFormatException {
        
        Produto produto = new Produto();
        
        
        produto.setCategoria(produtoGUI.getTfCategoria().getText());
        produto.setDescricao(produtoGUI.getTfDescricao().getText());
        produto.setMarca(produtoGUI.getTfMarca().getText());
        produto.setNome(produtoGUI.getTfNome().getText());
        produto.setPeso(Float.parseFloat(produtoGUI.getTfPeso().getText()));
        produto.setPreco(Float.parseFloat(produtoGUI.getTfPreco().getText()));
        produto.setQuantidadeEstoque(
                Integer.parseInt(produtoGUI.getTfQuantidade().getText()));
        produto.setCodigo(produtoGUI.getTfCodigo().getText());
        
        Dados.produtos.add(produto);
        
        
        for (Produto produto1 : Dados.produtos) {
            System.out.println(produto1);
        }
        

    }
    
    
    
}
