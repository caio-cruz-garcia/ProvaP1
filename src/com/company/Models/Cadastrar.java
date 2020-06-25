package com.company.Models;

import com.company.Enum.Pagamento;
import com.company.Enum.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *  Classe.<br>
 *     Ela é responsável por cadatrar o pedido de pizza gerarando um id, além de observa sua descriçao a partir da herança da descrição de pedido.
 * @author Caio Cruz Alfonso Garcia - caiogarcia96@hotmail.com
 * @since 25/06/2020
 * @version 1.0
 */
public  class Cadastrar extends Descricao{
    private String id = this.geradorID();
    private List<Descricao> itens = new ArrayList();
    private Pagamento value;
    private Status status;

    public Cadastrar(List<VerificarPedidos> verificarPedidosList, List<AlterarPedidos> alterarPedidosList, String id, List<Descricao> itens, Pagamento value, Status status) {
        super(verificarPedidosList, alterarPedidosList);
        this.id = id;
        this.itens = itens;
        this.value = value;
        this.status = status;
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

    public Pagamento getValue() {
        return value;
    }
}
