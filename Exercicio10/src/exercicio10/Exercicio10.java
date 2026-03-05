/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

/**
 *
 * @author aluno.saolucas
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Carro c = new Carro();

        c.setMarca("Toyota");
        c.setModelo("Corolla");
        c.setAno(2020);

        System.out.println("Marca: " + c.getMarca());
        System.out.println("Modelo: " + c.getModelo());
        System.out.println("Ano: " + c.getAno());

    }
    
}
