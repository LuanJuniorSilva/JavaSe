/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luan Júnior
 * @version 1.0 Beta Stark
 * @since 18/05/2017 - 00:12
 */
public class Calculadora {
    private String nome;
    private double num1;
    private double num2;

    public Calculadora() {
    }
    /**
     * 
     * @param nome seta o atributo nome pelo construtor
     * @param num1 seta o atributo num1 pelo construtor
     * @param num2 seta o atributo num2 pelo construtor
     */
    public Calculadora(String nome, double num1, double num2) {
        this.nome = nome;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    /**
     * 
     * @return retorna a soma de num1 com num2
     */
    public double calcularSoma(){
        return this.num1 + this.num2;
    }
    /**
     * 
     * @return retorna a subtração de num1 com num2
     */
    public double calcularSubtracao(){
        return this.num1 - this.num2;
    }
    /**
     * 
     * @return     retorna a multipicação de num1 com num2
     */
    public double calcularMultiplicao(){
        return this.num1 * this.num2;
    }
    /**
     * 
     * @return     retorna a divisão de num1 com num2
     */
    public double calcularDivisao(){
        return this.num1 / this.num2;
    }
    /**
     * 
     * @param opt recebe o parametro de opção para mostrar com calculo deve mostrar
     * @return retorna o calculo de acorda com a opção indicada pelo usuário
     */
    public String fazerCalculo(String opt){
      if(opt.equalsIgnoreCase("Somar")){
          return "A soma de "+this.num1+" + "+this.num2+" é: "+calcularSoma();
      }else if(opt.equalsIgnoreCase("Subtrair")){
          return "A subtração de "+this.num1+" - "+this.num2+" é: "+calcularSubtracao();
      }else if(opt.equalsIgnoreCase("Multiplicar")){
          return "A multiplicação de "+this.num1+" * "+this.num2+" é: "+calcularMultiplicao();
      }else if(opt.equalsIgnoreCase("Dividir")){
          return "A divisão de "+this.num1+" / "+this.num2+" é: "+calcularDivisao();
      }else{
          return this.toString();
      }
    }

    @Override
    public String toString() {
        return "A soma de "+this.num1+" + "+this.num2+" é: "+calcularSoma()
                       +"\nA subtração de "+this.num1+" - "+this.num2+" é: "+calcularSubtracao()
                       +"\nA multiplicação de "+this.num1+" * "+this.num2+" é: "+calcularMultiplicao()
                       +"\nA divisão de "+this.num1+" / "+this.num2+" é: "+calcularDivisao();
    }
    
    
}
