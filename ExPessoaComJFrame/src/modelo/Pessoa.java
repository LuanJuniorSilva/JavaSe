/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luan Júnior
 * @since 17/05/2017 - 13:53
 * @version 1.0 Beta Stark
 */
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;

    public Pessoa() {
    }
    /**
     * 
     * @param nome seta o atributo nome pelo construtor
     * @param idade seta o atributo idade pelo construtor
     */
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * 
     * @return retorna a idade em meses
     */
    public int calcularIdadeMeses(){
        return this.idade * 12;
    }

    @Override
    public String toString() {
        return "Nome: "+this.nome
                +"\nIdade: "+this.idade
                +"\nIdade em Meses: "+calcularIdadeMeses();
    }
    
    
    
            
}
