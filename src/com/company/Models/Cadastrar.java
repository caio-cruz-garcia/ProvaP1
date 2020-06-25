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

    /**
     * @param verificarPedidosList enumeração da lista do pedido de pizza.
     * @param alterarPedidosList enumeração da lista da alteraçao caso tenha da pizza.
     * @param id enumeração do id random da pizza.
     * @param itens enumaração da quantidade de pizzas que há na lista.
     * @param value enumeração do valor total da pizza.
     * @param status enumeração do estado em que se encontra a pizza.
     */
    public Cadastrar(List<VerificarPedidos> verificarPedidosList, List<AlterarPedidos> alterarPedidosList, String id, List<Descricao> itens, Pagamento value, Status status) {
        super(verificarPedidosList, alterarPedidosList);
        this.id = id;
        this.itens = itens;
        this.value = value;
        this.status = status;
    }


    /**
     * @return Getter da enumeração da condição da pizza
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @return um id random.
     */
    private String geradorID(){
        Random random = new Random();
        String idGerado = "";
        for(int i = 0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }

    /**
     * @return Getter da enumeração do id.
     */
    public String getId() {
        return id;
    }

    /**
     * @return Getter da enumeração do valor do pagamento.
     */
    public Pagamento getValue() {
        return value;
    }
}
