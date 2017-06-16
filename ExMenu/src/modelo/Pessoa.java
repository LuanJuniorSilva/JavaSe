package modelo;

/**
 *
 * @author Luan Júnior
 * @version 1.0 Beta
 * @since 23/05/2017
 */
public class Pessoa {
    
    //Atributos
    private String nome;
    private int idade;

    public Pessoa() {
    }

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
    public  int calcularIdade(){
        return this.idade * 12;
    }

    @Override
    public String toString() {
        return "\nNome: "+this.nome
                +"\nIdade: "+this.idade
                +"\nIdade em meses: "+this.calcularIdade();
    }
    
    
}
