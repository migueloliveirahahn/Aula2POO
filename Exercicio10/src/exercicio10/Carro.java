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
public class Carro {
       private String marca;
    private String modelo;
    public int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano >= 1886) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido! O primeiro carro foi criado em 1886.");
        }
    }

    public int getAno() {
        return ano;
    }
}
