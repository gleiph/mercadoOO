/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gleip
 */
public class ProdutoGUI {

    private JTextField tfQuantidade;
    private JTextField tfNome;
    private JTextField tfPreco;
    private JTextField tfMarca;
    private JTextField tfCategoria;
    private JTextField tfPeso;
    private JTextField tfDescricao;

    

    public ProdutoGUI() {
        this.tfQuantidade = new JTextField(50);
        this.tfNome = new JTextField(50);
        this.tfPreco = new JTextField(50);
        this.tfMarca = new JTextField(50);
        this.tfCategoria = new JTextField(50);
        this.tfPeso = new JTextField(50);
        this.tfDescricao = new JTextField(50);

    }

    public JPanel desenha() {

        JPanel painel = new JPanel();

        JLabel jlQuantidade = new JLabel("Quantidade: ");
        JLabel jlNome = new JLabel("Nome: ");
        JLabel jlPreco = new JLabel("Preço: ");
        JLabel jlMarca = new JLabel("Marca: ");
        JLabel jlCategoria = new JLabel("Categoria: ");
        JLabel jlPeso = new JLabel("Peso: ");
        JLabel jlDescricao = new JLabel("Descrição: ");

        painel.setLayout(new GridLayout(0, 2));

        painel.add(jlNome);
        painel.add(tfNome);

        painel.add(jlMarca);
        painel.add(tfMarca);

        painel.add(jlDescricao);
        painel.add(tfDescricao);

        painel.add(jlCategoria);
        painel.add(tfCategoria);

        painel.add(jlPreco);
        painel.add(tfPreco);

        painel.add(jlPeso);
        painel.add(tfPeso);

        painel.add(jlQuantidade);
        painel.add(tfQuantidade);

        return painel;

    }

    public JPanel desenhaBotoes() {

        JPanel painel = new JPanel();

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(new AdicionaProduto(this));

        JButton botaoCancelar = new JButton("Cancelar");

        painel.add(botaoCadastrar);

        painel.add(botaoCancelar);

        return painel;

    }

    public static void main(String[] args) {

        JFrame tela = new JFrame("Cadastra Produto");
        ProdutoGUI produtoGUI = new ProdutoGUI();
        
        tela.setSize(600, 300);

        tela.setLayout(new BorderLayout());

        tela.add(produtoGUI.desenha(), BorderLayout.CENTER);

        tela.add(produtoGUI.desenhaBotoes(), BorderLayout.SOUTH);

        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public JTextField getTfQuantidade() {
        return tfQuantidade;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public JTextField getTfPreco() {
        return tfPreco;
    }

    public JTextField getTfMarca() {
        return tfMarca;
    }

    public JTextField getTfCategoria() {
        return tfCategoria;
    }

    public JTextField getTfPeso() {
        return tfPeso;
    }

    public JTextField getTfDescricao() {
        return tfDescricao;
    }
}
