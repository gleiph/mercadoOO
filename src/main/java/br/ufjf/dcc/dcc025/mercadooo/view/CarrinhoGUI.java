/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.view;

import br.ufjf.dcc.dcc025.mercadooo.controller.AdicionaItem;
import br.ufjf.dcc.dcc025.mercadooo.model.Dados;
import br.ufjf.dcc.dcc025.mercadooo.model.Item;
import br.ufjf.dcc.dcc025.mercadooo.model.Produto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 *
 * @author pedro
 */
public class CarrinhoGUI {
    private JTable jtPedido;

    public CarrinhoGUI() {
        this.jtPedido = new JTable();
    }
    
    public JPanel desenha(){
        JPanel painel = new JPanel();
        painel.setSize( 600,300 );
        String[] nomeColunas = {"Produto","Quantidade"};
        
        DefaultTableModel model = new DefaultTableModel(nomeColunas, 0);
        
        jtPedido.setModel(model);
        
        JLabel jlPedido =  new JLabel("Pedido: ");
        
        painel.add(jlPedido);
        painel.add(new JScrollPane(jtPedido));
        
        return  painel;
    }
    
    public JPanel desenhaBotoes(ItemGUI itemGUI) {

        JPanel painel = new JPanel();

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(new AdicionaItem(itemGUI));

        painel.add(botaoCadastrar);

        return painel;

    }
    
    
    public static void main(String[] args) {
        JFrame tela = new JFrame("Pedidos");
        CarrinhoGUI carrinhoGUI = new CarrinhoGUI();
        ItemGUI itemGUI = new ItemGUI();

        tela.setSize(800, 300);
        tela.setLayout(new BorderLayout());

        tela.add(carrinhoGUI.desenha(), BorderLayout.EAST);
        tela.add(itemGUI.desenha(), BorderLayout.WEST);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JTable getJtPedido() {
        return jtPedido;
    }

    public void setJtPedido(JTable jtPedido) {
        this.jtPedido = jtPedido;
    }
}
