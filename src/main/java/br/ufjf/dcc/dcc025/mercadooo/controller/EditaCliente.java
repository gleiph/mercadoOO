package br.ufjf.dcc.dcc025.mercadooo.controller;

import br.ufjf.dcc.dcc025.mercadooo.model.Cliente;
import br.ufjf.dcc.dcc025.mercadooo.model.Dados;
import br.ufjf.dcc.dcc025.mercadooo.view.ClienteGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EditaCliente implements ActionListener{

    ClienteGUI clienteGUI;

    public EditaCliente(ClienteGUI clienteGUI) {
        this.clienteGUI = clienteGUI;
    }

    public JPanel editaCliente(Cliente cliente) {
        JPanel painel = new JPanel();

        JLabel jlNome = new JLabel("Nome: ");
        JLabel jlEndereco = new JLabel("Endereço: ");
        JLabel jlEmail = new JLabel("Email: ");
        JLabel jlTelefone = new JLabel("Telefone (xx)xxxxx-xxxx: ");
        

        painel.setLayout(new GridLayout(0, 2));

        painel.add(jlNome);
        painel.add(clienteGUI.getTfNome());

        painel.add(jlEndereco);
        painel.add(clienteGUI.getTfEndereco());

        painel.add(jlEmail);
        painel.add(clienteGUI.getTfEmail());

        painel.add(jlTelefone);
        painel.add(clienteGUI.getTfTelefone());

        cliente.setNome(clienteGUI.getTfNome().getText());
        cliente.setEndereco(clienteGUI.getTfEndereco().getText());
        cliente.setEmail(clienteGUI.getTfEmail().getText());
        cliente.setTelefone(clienteGUI.getTfTelefone().getText());

        return painel;
    }    
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        Cliente cliente = new Cliente();
        
        editaCliente(cliente);
        
        Dados.clientes.add(cliente);
        
        
        // for (Cliente cliente1 : Dados.clientes) {
        //     System.out.println(cliente);
        // }

    }
    
}