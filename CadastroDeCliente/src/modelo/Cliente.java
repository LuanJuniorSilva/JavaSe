/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Luan Júnior
 * @version 1.0 Beta
 * @since 22/05/2017
 */
public class Cliente {
    private String nome;
    private String sexo;
    private String verificaCartao;
    private int qtde;
    private ArrayList<String>nomeCartao;
    private ArrayList<String>contas;

    public Cliente() {
    }

    public Cliente(String nome, String sexo, String verificaCartao, int qtde, ArrayList<String> nomeCartao, ArrayList<String> contas) {
        this.nome = nome;
        this.sexo = sexo;
        this.verificaCartao = verificaCartao;
        this.qtde = qtde;
        this.nomeCartao = nomeCartao;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getVerificaCartao() {
        return verificaCartao;
    }

    public void setVerificaCartao(String verificaCartao) {
        this.verificaCartao = verificaCartao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public ArrayList<String> getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(ArrayList<String> nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public ArrayList<String> getContas() {
        return contas;
    }

    public void setContas(ArrayList<String> contas) {
        this.contas = contas;
    }

    @Override
    public String toString() {
        
        String strCartao = "";
        String strConta = "";
        
        for(int i = 0;i<nomeCartao.size();i++){
            strCartao += "\n "+nomeCartao.get(i);
        }
        
        for(int i = 0;i<contas.size();i++){
            strConta += "\n "+contas.get(i);
        }
        
        
        return "Nome: "+nome
                +"\nSexo: "+sexo
                +"\n Possui Cartão? "+verificaCartao
                +"\n quantidade: "+qtde
                +"\n Nome dos Cartões:"+strCartao
                +"\n Contas do Cartão: "+strConta;
    }
    
    
    
}
