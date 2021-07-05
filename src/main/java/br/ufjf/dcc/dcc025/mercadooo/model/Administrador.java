package br.ufjf.dcc.dcc025.mercadooo.model;

import java.util.Date;
import javax.swing.JOptionPane;

public class Administrador {
    
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String email;
    private String telefone;

    public Administrador(String nome, String cpf, Date dataNascimento, String email, String telefone) {
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
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
   
}
