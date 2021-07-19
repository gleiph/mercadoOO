package br.ufjf.dcc.dcc025.mercadooo.controller;

import br.ufjf.dcc.dcc025.mercadooo.model.Cliente;
import br.ufjf.dcc.dcc025.mercadooo.model.Dados;
import br.ufjf.dcc.dcc025.mercadooo.view.ClienteGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.GridLayout;
//import javax.swing.JButton;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;

public class CadastraCliente implements ActionListener {

    ClienteGUI clienteGUI;

    public CadastraCliente(ClienteGUI clienteGUI) {
        this.clienteGUI = clienteGUI;
        
//        desenhaCadastro();
//        desenhaBotoes();
    }

//    public JPanel desenhaCadastro() {
//        JPanel painel = new JPanel();
//
//        JLabel jlNome = new JLabel("Nome: ");
//        JLabel jlCpfcnpj = new JLabel("CPF/CNPJ: ");
//        JLabel jlEndereco = new JLabel("Endereço: ");
//        JLabel jlDataNascimento = new JLabel("Data de nascimento(dd/mm/aaaa): ");
//        JLabel jlEmail = new JLabel("Email: ");
//        JLabel jlTelefone = new JLabel("Telefone (xx)xxxxx-xxxx: ");
//
//        JTextField tfNome = new JTextField(50);
//        JTextField tfCpfcnpj = new JTextField(50);
//        JTextField tfEndereco = new JTextField(50);
//        JTextField tfDataNascimento = new JTextField(50);
//        JTextField tfEmail = new JTextField(50);
//        JTextField tfTelefone = new JTextField(50);
//
//        painel.setLayout(new GridLayout(0, 2));
//
//        painel.add(jlNome);
//        painel.add(tfNome);
//
//        painel.add(jlCpfcnpj);
//        painel.add(tfCpfcnpj);
//
//        painel.add(jlEndereco);
//        painel.add(tfEndereco);
//
//        painel.add(jlDataNascimento);
//        painel.add(tfDataNascimento);
//
//        painel.add(jlEmail);
//        painel.add(tfEmail);
//
//        painel.add(jlTelefone);
//        painel.add(tfTelefone);
//
//        return painel;
//    }
//
//    public JPanel desenhaBotoes() {
//        JPanel painel = new JPanel();
//
//        JButton botaoCadastrar = new JButton("Cadastrar");
//        botaoCadastrar.addActionListener(new CadastraCliente(this.clienteGUI));
//
//        JButton botaoCancelar = new JButton("Cancelar");
//        botaoCancelar.addActionListener(new CancelaCliente());
//
//        painel.add(botaoCadastrar);
//
//        painel.add(botaoCancelar);
//
//        return painel;
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Cliente cliente = new Cliente(clienteGUI.getTfNome().getText(), 
                                        clienteGUI.getTfCpfcnpj().getText(),
                                        clienteGUI.getTfDataNascimento().getText(), 
                                        clienteGUI.getTfEmail().getText(),
                                        clienteGUI.getTfEndereco().getText(), 
                                        clienteGUI.getTfTelefone().getText());

        Dados.clientes.add(cliente);

         for (Cliente cliente1 : Dados.clientes) {
             System.out.println(cliente);
         }

    }

}
