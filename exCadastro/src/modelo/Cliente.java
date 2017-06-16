/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Jonatã
 * @since 23/05
 */
public class Cliente {
    private String nome;
    private double valorTotal;
    private String formaPagamento;
    private String email;
    private String telefone;
    private ArrayList<String> receber;

    public Cliente() {
    }

    public Cliente(String nome, double valorTotal, String formaPagamento, String email, String telefone, ArrayList<String> receber) {
        this.nome = nome;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.email = email;
        this.telefone = telefone;
        this.receber = receber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
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
    }

    public ArrayList<String> getReceber() {
        return receber;
    }

    public void setReceber(ArrayList<String> receber) {
        this.receber = receber;
    }
    
    public double calcularFormaPagameto(){
        if(this.getFormaPagamento().equalsIgnoreCase("Vista")){
           return this.valorTotal - (this.valorTotal*0.5);
        }
        else if(this.getFormaPagamento().equalsIgnoreCase("1")){
            return this.valorTotal + (this.valorTotal * 0.5);
        }else if(this.getFormaPagamento().equalsIgnoreCase("2")){
            return this.valorTotal + (this.valorTotal * 0.10);
        }else{
            return this.valorTotal + (this.valorTotal * 0.15);
        }
    } 

    @Override
    public String toString() {
        return  "\nNome: "+nome
                +"\nValor Total: "+valorTotal
                +"\nForma de Pagamento: "+formaPagamento
                +"\nEmail: "+email
                +"\nTelefone: "+telefone
                +"\nRecebe: "+receber;
                
    }
    
    
}
