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
 * @since 22/05/2017
 * @version 1.0
 */
public class Pessoa {
    private String nome;
    private ArrayList<String>console;

    public Pessoa() {
    }

    public Pessoa(String nome, ArrayList<String> console) {
        this.nome = nome;
        this.console = console;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getConsole() {
        return console;
    }

    public void setConsole(ArrayList<String> console) {
        this.console = console;
    }

    @Override
    public String toString() {
        
        String x = "";
        
        for(int i = 0; i<console.size();i++){
            x += "\n"+console.get(i);
        }
        
        
        
        return "\nNome: "+this.nome
                +"\nConsole: "+x;
    }
    
    
}
