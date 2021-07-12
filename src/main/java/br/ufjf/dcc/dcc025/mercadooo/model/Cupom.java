/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc.dcc025.mercadooo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class Cupom {

    private String nome;
    private Map<String, Boolean> chaveCupom;
    private double desconto;
    private int numeroDeCupons = -1;
    private LocalDate dataVencimento;
    
    public Cupom(String nome_, int desconto_, String data_) {
        this.nome = nome_;
        this.desconto = (double)(desconto_/100);
        chaveCupom.put(nome_, Boolean.TRUE);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataVencimento = LocalDate.parse(data_, dateTimeFormatter);
    }

    public Cupom(String nome_, int desconto_, int numero) {

        this.nome = nome_;
        this.desconto = (double)(desconto_/100);
        chaveCupom.put(nome_, Boolean.TRUE);
        this.numeroDeCupons = numero;
        

    }

    protected boolean verificaSeEstaAtivo(String nome_) {
        if (chaveCupom.containsKey(nome_)) {
            if(chaveCupom.containsValue(true)){
                return true;
            }else{
                return false;
            }
        } else {
            //cupom não existe
            return false;
        }
       
    }

    protected double usaCupom(String nome_) {
        if (verificaSeEstaAtivo(nome_)) {
            if(this.numeroDeCupons == -1 || this.numeroDeCupons > 0 || getTempo()>=0){
                this.numeroDeCupons -= 1;
            return getDesconto();
            }
            else{
                System.out.println("O cupom acabou, ou o tempo do cumpom expirou");
                return 1;
            }
        } else {
            System.out.println("O cupom nao existe");
            // vai retornar 1 pq dps esse valor é o q sera multiplicado ao preço original do produto.
            return 1;
        }


    }

    protected void ativaCupom(String nome_) {
        if(chaveCupom.containsKey(nome_)){
            chaveCupom.put(nome_, Boolean.TRUE);
        }else{
            //nao existe esse cupom
        }
           
    }
    
    protected void desativaCupom(String nome_) {
        if(chaveCupom.containsKey(nome_)){
            chaveCupom.put(nome_, Boolean.FALSE);
        }else{
            //nao existe esse cupom
        }
           
    }

    protected double getDesconto() {
        return this.desconto;
    }
    
    // nao sei como implementar esse dai
    protected void deletarCupom(){
     
    }
    
    public int getTempo(){
        return (int) ChronoUnit.DAYS.between( LocalDate.now() , this.dataVencimento);
    }
    
    protected void mudaDataDeVencimento(){
        Scanner teclado = new Scanner(System.in);
        String novaData = teclado.nextLine();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataVencimento = LocalDate.parse(novaData, dateTimeFormatter);
              
    }
                
}
