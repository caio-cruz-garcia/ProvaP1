package com.company.Models;

import com.company.Enum.Pagamento;

/**
 *  Classe.<br>
 *   Ela é responsável pela abstração de verificar os pedidos de pizza.
 * @author Caio Cruz Alfonso Garcia - caiogarcia96@hotmail.com
 * @since 25/06/2020
 * @version 1.0
 */
public class VerificarPedidos  {
    private Pagamento status;
    private int id;

    /**
     * @param status da condição do pagamento da pizza.
     * @param id da especifica da pizza.
     */
    public VerificarPedidos(Pagamento status, int id) {
        this.status = status;
        this.id = id;
    }

    /**
     * @return um status do pedido de pizza.
     */
    public Pagamento getStatus() {
        return status;
    }

    /**
     * @return o id do pedido de pizza.
     */
    public int getId() {
        return id;
    }

    /**
     * @return o parametro como escreve oa classe verificarPedidos.
     */
    @Override
    public String toString() {
        return "VerificarPedidos{" +
                "status=" + status +
                ", id=" + id +
                '}';
    }
}
