/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author aluno.saolucas
 */
public class Produto {
     private String Nome;
    private double preço;
    
    public String getNome() {
    return Nome;
    }
    
    public double getPreço(){
    return preço;
    }
    
    public void setNome(String Nome){
    this.Nome = Nome;
    }
    
    public void setPreço(double preço){
    if(preço == 15.50) {
        this.preço = preço;
    }
    else {
       System.out.println("Preço inválido, Retorne o produto"); 
    }
    }
}
