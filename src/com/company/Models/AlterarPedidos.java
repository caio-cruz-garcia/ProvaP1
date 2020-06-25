package com.company.Models;

import com.company.Enum.Pagamento;

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
