/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

/**
 *
 * @author aluno.saolucas
 */
public class Animal {
       protected void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {

    @Override
    protected void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

class Gato extends Animal {

    @Override
    protected void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }

}
