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

    public Pizza(Tipos nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public Tipos getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
