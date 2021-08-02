/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.controller;

import br.ufjf.dcc.dcc025.mercadooo.model.Item;
import br.ufjf.dcc.dcc025.mercadooo.model.Produto;
import br.ufjf.dcc.dcc025.mercadooo.view.ItemGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class AdicionaItem implements ActionListener{
    ItemGUI itemGUI;

    public AdicionaItem(ItemGUI itemGUI) {
        this.itemGUI = itemGUI;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        Item item = new Item();
        
        if( itemGUI.getCbProdutos().getSelectedIndex() != -1 )
        {//Validar se alguem selecionou algo
            item.setProduto((Produto) itemGUI.getCbProdutos().getSelectedItem());
            System.out.println(((Produto)itemGUI.getCbProdutos().getSelectedItem()).getNome());
        }
        else
            JOptionPane.showMessageDialog(null , "Selecione um Produto");
        
    }
    
    
}
