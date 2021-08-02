/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.view;

import br.ufjf.dcc.dcc025.mercadooo.controller.AdicionaItem;
import br.ufjf.dcc.dcc025.mercadooo.controller.AdicionaProduto;
import br.ufjf.dcc.dcc025.mercadooo.controller.CancelaProduto;
import br.ufjf.dcc.dcc025.mercadooo.model.Dados;
import br.ufjf.dcc.dcc025.mercadooo.model.Produto;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author pedro
 */
public class ItemGUI {
    private JComboBox cbProdutos;
    private JTextField tfQuantidade;

    public ItemGUI() {
        this.cbProdutos = new JComboBox();
        this.tfQuantidade = new JTextField(50);
    }
    
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        DefaultComboBoxModel<Produto> model = new DefaultComboBoxModel<>();
        
        for(Produto produto : Dados.produtos){
            model.addElement(produto);
        }
        
        cbProdutos.setMaximumSize(new Dimension(150, 25));
        cbProdutos.setModel(model);
        
        painel.setPreferredSize(new Dimension(180, 600));
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        
        JLabel jlProduto = new JLabel("Produto:");
        
        painel.add(jlProduto);
        painel.add(cbProdutos);
        
        return painel;
    }
    public JPanel desenhaBotoes() {

        JPanel painel = new JPanel();

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(new AdicionaItem(this));

        painel.add(botaoCadastrar);

        return painel;

    }
    
    public static void main(String[] args) {
        JFrame tela = new JFrame("Cadastra Pedido");
        tela.setLocationRelativeTo(null);
        ItemGUI itemGUI = new ItemGUI();
        
        tela.setSize(600, 300);
        tela.setLayout(new BorderLayout());
        
        tela.add(itemGUI.desenha(), BorderLayout.CENTER);
        
        tela.add(itemGUI.desenhaBotoes(), BorderLayout.SOUTH);
        
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JComboBox getCbProdutos() {
        return cbProdutos;
    }

    public void setCbProdutos(JComboBox cbProdutos) {
        this.cbProdutos = cbProdutos;
    }

    public JTextField getTfQuantidade() {
        return tfQuantidade;
    }

    public void setTfQuantidade(JTextField tfQuantidade) {
        this.tfQuantidade = tfQuantidade;
    }
    
}
