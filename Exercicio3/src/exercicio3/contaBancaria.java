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
public class contaBancaria {
    public class ContaBancaria {

    public String titular;
    private double saldo;

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        } else {
            System.out.println("Deposito Indisponivel");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saque indisponivel");
        }
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }
   }
}