package com.company.Models;

import com.company.Enum.Pagamento;
import com.company.Enum.Status;

import java.util.Random;

public  class Cadastrar {
    private String id = this.geradorID();
    private String descricao;
    private Pagamento value;
    private Status status;

    public Cadastrar(String idGerado, String descricao, Pagamento value, Status status) {
        this.id = idGerado;
        this.descricao = descricao;
        this.value = value;
        this.status = status;
    }

    public Pagamento getValue() {
        return value;
    }

    public Status getStatus() {
        return status;
    }

    private String geradorID(){
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }

    public String getId() {
        return id;
    }
}
