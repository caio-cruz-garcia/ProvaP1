package com.company.Models;

import com.company.Enum.Pagamento;

public class VerificarPedidos  {
    private Pagamento status;
    private int id;

    public VerificarPedidos(Pagamento status, int id) {
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
        return "VerificarPedidos{" +
                "status=" + status +
                ", id=" + id +
                '}';
    }
}
