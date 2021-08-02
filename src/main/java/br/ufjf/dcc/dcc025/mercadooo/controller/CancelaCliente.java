/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class CancelaCliente implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showMessageDialog(null, "Nenhum dado cadastrado ou alterado!");
    }
    
}
