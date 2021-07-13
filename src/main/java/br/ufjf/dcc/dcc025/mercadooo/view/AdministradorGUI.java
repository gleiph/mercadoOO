/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.view;

import br.ufjf.dcc.dcc025.mercadooo.controller.AdicionaAdministrador;
import br.ufjf.dcc.dcc025.mercadooo.controller.CancelaAdministrador;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author danie
 */
public class AdministradorGUI {
    
    private JTextField tfNome;
    private JTextField tfCpf;
    private JTextField tfDataNascimento;
    private JTextField tfEmail;
    private JTextField tfTelefone;
    
  //----------------------------------------------------------------------------  
  //Constructor  
    public AdministradorGUI(){
        this.tfNome = new JTextField(50);
        this.tfCpf = new JTextField(11);
        this.tfDataNascimento = new JTextField(50);
        this.tfEmail = new JTextField(50);
        this.tfTelefone = new JTextField(50);
    }
    
    public JPanel desenha(){
        JPanel painel = new JPanel();
        
        JLabel jlNome = new JLabel("Nome: ");
        JLabel jlCpf = new JLabel("CPF/CNPJ: ");
        JLabel jlDataNascimento = new JLabel("Data de Nascimento (dd/mm/aa): ");
        JLabel jlEmail = new JLabel("Email: ");
        JLabel jlTelefone = new JLabel("Telefone (xx)xxxxx-xxxx: ");
        
        painel.add(jlNome);
        painel.add(tfNome);
        
        painel.add(jlCpf);
        painel.add(tfCpf);
        
        painel.add(jlDataNascimento);
        painel.add(tfDataNascimento);
        
        painel.add(jlEmail);
        painel.add(tfEmail);
        
        painel.add(jlTelefone);
        painel.add(tfTelefone);
        
        return painel;
    }
    
    public JPanel desenhaBotoes() {

        JPanel painel = new JPanel();

        JButton botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.addActionListener(new AdicionaAdministrador(this));

        JButton botaoCancelar = new JButton("Cancelar");
        botaoCancelar.addActionListener(new CancelaAdministrador());

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

    public JTextField getTfNome() {
        return tfNome;
    }

    public JTextField getTfCpf() {
        return tfCpf;
    }

    public JTextField getTfDataNascimento() {
        return tfDataNascimento;
    }

    public JTextField getTfEmail() {
        return tfEmail;
    }

    public JTextField getTfTelefone() {
        return tfTelefone;
    }
   
   
    
    
}
