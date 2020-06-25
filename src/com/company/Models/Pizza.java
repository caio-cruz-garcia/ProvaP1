package com.company.Models;

import com.company.Enum.Tipos;

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
