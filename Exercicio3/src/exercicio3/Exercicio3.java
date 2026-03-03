/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria();
        
        conta.titular = "João";

        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Titular: " + conta.titular);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
    
}
