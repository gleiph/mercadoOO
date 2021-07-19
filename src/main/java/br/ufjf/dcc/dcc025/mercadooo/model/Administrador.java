package br.ufjf.dcc.dcc025.mercadooo.model;

import java.util.Date;
import javax.swing.JOptionPane;

public class Administrador {
    
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String email;
    private String telefone;

    public Administrador(String nome, String cpf, String dataNascimento, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
    }

    public Administrador() {
    }
    
    public void validaArrumaCpf(){
        String cpf;
        if(this.cpf.length() != 11){
            cpf = JOptionPane.showInputDialog("CPF inválido. Digite um novo CPF, sem traços ou pontos.");
            setCpf(cpf);
        }
        else
            this.cpf = this.cpf.substring(0, 3) + "." + this.cpf.substring(3, 6) + "." 
                    + this.cpf.substring(6, 9) + "-" + this.cpf.substring(9, 11);
    }
    
    public void validaArrumaTelefone(){
        String telefone;
        if(this.telefone.length() != 11){
            telefone = JOptionPane.showInputDialog("Telefone inválido. Digite um novo telefone, com DDD e sem parênteses ou traços.");
            setTelefone(telefone);
        }
        else
            this.telefone = "(" + this.telefone.substring(0, 2) + ")" 
                    + this.telefone.substring(2, 7) + "-" + this.telefone.substring(7, 11);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        validaArrumaCpf();
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
        validaArrumaTelefone();
    }
    
    public void edita() {
        String options[] = new String [3];
        options[0] = "E-mail";
        options[1] = "Telefone";

        int option = JOptionPane.showOptionDialog(null, "O que deseja editar?", "Editar dados", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, 
            null, options, options[0]);
        switch(option){
            case 0:
                String mail = JOptionPane.showInputDialog(null, "Digite o novo e-mail: ");
                setEmail(mail);
            case 1:
                String telefone = JOptionPane.showInputDialog(null, "Digite o novo número: (XX) XXXXX-XXXX");
                setTelefone(telefone);
            default:
                JOptionPane.showMessageDialog(null, "Nenhum dado alterado.");
        }
    }
   
}
