/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.model;

import javax.swing.JTextField;

public class Cliente {
    String nome;
    String cpfcnpj;
    String endereco;
    String dataNascimento;
    String email;
    String telefone;


    public Cliente (){
        this.nome = null;
        this.cpfcnpj = null;
        this.dataNascimento = null;
        this.email = null;
        this.endereco = null;
        this.telefone = null;
    }
    public Cliente (String name, String doc, String nasc, String mail, String cep, String tel){
        this.nome = name;
        this.cpfcnpj = doc;
        this.dataNascimento = nasc;
        this.email = mail;
        this.endereco = cep;
        this.telefone = tel;
    }

    public Cliente(JTextField tfNome, JTextField tfCpfcnpj, JTextField tfDataNascimento, JTextField tfEmail,
            JTextField tfEndereco, JTextField tfTelefone) {
        this.nome = tfNome.getText();
        this.cpfcnpj = tfCpfcnpj.getText();
        this.dataNascimento = tfDataNascimento.getText();
        this.email = tfEmail.getText();
        this.endereco = tfEndereco.getText();
        this.telefone = tfTelefone.getText();
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfcnpj() {
        return cpfcnpj;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


//    public void edita() {
//        String options[] = new String [4];
//        options[0] = "E-mail";
//        options[1] = "Endereço";
//        options[2] = "Telefone";
//
//        int option = JOptionPane.showOptionDialog(null, "O que deseja editar?", "Editar dados", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
//            null, options, options[0]);
//        switch(option){
//            case 0:
//                String mail = JOptionPane.showInputDialog(null, "Digite o novo e-mail: ");
//                setEmail(mail);
//            case 1:
//                String end = JOptionPane.showInputDialog(null, "Digite o novo endereço: ");
//                setEndereco(end);
//            case 2:
//                String telefone = JOptionPane.showInputDialog(null, "Digite o novo número: (XX) XXXXX-XXXX");
//                setTelefone(telefone);
//            default:
//                JOptionPane.showMessageDialog(null, "Nenhum dado alterado.");
//        }
//    }

}
