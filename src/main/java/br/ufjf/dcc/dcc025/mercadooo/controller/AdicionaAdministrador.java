/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.controller;

import br.ufjf.dcc.dcc025.mercadooo.view.AdministradorGUI;
import br.ufjf.dcc.dcc025.mercadooo.model.Administrador;
import br.ufjf.dcc.dcc025.mercadooo.model.Dados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
/**
 *
 * @author danie
 */
public class AdicionaAdministrador implements ActionListener{
    
    AdministradorGUI administradorGUI;
    
    public AdicionaAdministrador(AdministradorGUI administradorGUI){
        this.administradorGUI = administradorGUI;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        Administrador administrador = new Administrador();
        
        administrador.setCpf(administradorGUI.getTfCpf().getText());
        administrador.setEmail(administradorGUI.getTfEmail().getText());
        administrador.setDataNascimento(administradorGUI.getTfDataNascimento().getText());
        administrador.setNome(administradorGUI.getTfNome().getText());
        administrador.setTelefone(administradorGUI.getTfTelefone().getText());
        
        Dados.administradores.add(administrador);
        
        for (Administrador administrador1 : Dados.administradores) {
            System.out.println(administrador1);
        }
        

    }
}
