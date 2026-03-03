/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

/**
 *
 * @author aluno.saolucas
 */
public class Veiculo {
    protected int velocidadeMaxima;
    public void setspeedLimit(int velocidadeMaxima) {
        if (velocidadeMaxima <= 500) {
            this.velocidadeMaxima = velocidadeMaxima;
        } else {
            System.out.println("Velocidade máxima atingida");
        }
    }

    public int getspeedLimit() {
        return velocidadeMaxima;
    }
}
   
