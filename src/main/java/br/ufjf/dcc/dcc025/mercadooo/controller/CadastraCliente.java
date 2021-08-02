package br.ufjf.dcc.dcc025.mercadooo.controller;

import br.ufjf.dcc.dcc025.mercadooo.model.Cliente;
import br.ufjf.dcc.dcc025.mercadooo.model.Dados;
import br.ufjf.dcc.dcc025.mercadooo.view.ClienteGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CadastraCliente implements ActionListener {

    ClienteGUI clienteGUI;

    public CadastraCliente(ClienteGUI clienteGUI) {
        this.clienteGUI = clienteGUI;
    }

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
             System.out.println(cliente1);
         }

    }

}
