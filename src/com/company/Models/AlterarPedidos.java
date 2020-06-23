package com.company.Models;

import com.company.Enum.Status;

public class AlterarPedidos {
    private Status status;
    private int id;

    public AlterarPedidos(Status status, int id) {
        this.status = status;
        this.id = id;
    }

    public Status getStatus() {
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