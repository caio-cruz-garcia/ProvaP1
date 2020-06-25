package com.company.Models;

import com.company.Enum.Pagamento;

/**
 * Classe.<br>
 *   Ela é responsável pela abstração de alterar os pedidos de pizza.
 * @author Caio Cruz Alfonso Garcia - caiogarcia96@hotmail.com
 * @since 25/06/2020
 * @version 1.0
 */
public  class AlterarPedidos  {
    private Pagamento status;
    private int id;

    public AlterarPedidos(Pagamento status, int id) {
        this.status = status;
        this.id = id;
    }

    public Pagamento getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "AlterarPedidos{" +
                "status=" + status +
                ", id=" + id +
                '}';
    }
}
