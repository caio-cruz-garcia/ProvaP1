package com.company.Models;

import com.company.Enum.Tipos;

/**
 * Classe ponto de entrada da aplicação base.<br>
 *     Ela é responsável por ter a Pizza requisitado e seu valor.
 * @author Caio Cruz Alfonso Garcia - caiogarcia96@hotmail.com
 * @since 25/06/2020
 * @version 1.0
 */
public class Pizza {
    public Tipos nome;
    public double valor;

    /**
     * @param nome enumeração que define o nome da pizza.
     * @param valor enumeração do valor da pizza.
     */
    public Pizza(Tipos nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    /**
     * @return Getter da enumeração da pizza.
     */
    public Tipos getNome() {
        return nome;
    }

    /**
     * @return Getter da enumeração da pizza.
     */
    public double getValor() {
        return valor;
    }
}
