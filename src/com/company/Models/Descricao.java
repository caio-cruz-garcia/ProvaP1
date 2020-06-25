package com.company.Models;

import com.company.Enum.Pagamento;
import com.company.Enum.Status;
import com.company.Enum.Tipos;
import com.company.Interface.AlterarStatus;
import com.company.Interface.VerStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *  Classe ponto de entrada da aplicação base.<br>
 *     Ela é responsável pela Descrição do pedido de pizza,implementando duas interfaces de controle.
 *     VerStatus permite olhar o pagamento e a condição.
 *     AlterarStatus permite olhar o pagamento e caso seja necessario uma troca no pedido.
 * @author Caio Cruz Alfonso Garcia - caiogarcia96@hotmail.com
 * @since 25/06/2020
 * @version 1.0
 */
public class Descricao implements VerStatus, AlterarStatus {
    private List<Pizza> pizzas;
    private List<VerificarPedidos> verificarPedidosList;
    private List<AlterarPedidos> alterarPedidosList;

    public Descricao(List<VerificarPedidos> verificarPedidosList, List<AlterarPedidos> alterarPedidosList) {
        this.verificarPedidosList = verificarPedidosList;
        this.alterarPedidosList = alterarPedidosList;
    }

    @Override
    public Status alterarStatus(List<AlterarPedidos> mudarStatus) {
        Status statusvalue = Status.NONE;
        HashMap<Pagamento,Integer> StatusMap = new HashMap<>();
        for (Pagamento status:Pagamento.values()) {
            StatusMap.put(status, 0);
        }
        for (AlterarPedidos alterarPedidos:mudarStatus) {
            StatusMap.replace(alterarPedidos.getStatus(), StatusMap.get(alterarPedidos.getStatus())+1);
        }
        StatusMap.forEach((Status_hashMapKey,integer_hashMapKey)-> {
            System.out.println("Chave: "+ Status_hashMapKey + "Value: "+integer_hashMapKey);
        });

        if(StatusMap.containsValue(5)){
            statusvalue = Status.DEVOLVIDO;
        } else if (StatusMap.containsValue(4)){
            statusvalue = Status.ENTREGUE;
        } else if (StatusMap.containsValue(3)){
            statusvalue = Status.PREPARACAO;
        } else if (StatusMap.containsValue(2)){
            statusvalue = Status.REALIZADO;
        } else if (StatusMap.containsValue(1)){
            statusvalue = Status.SAIU_PARA_ENTREGA;
        } else{
            statusvalue = Status.NONE;
        }
        return statusvalue;
    }

    @Override
    public Status checkStatus(List<VerificarPedidos> verStatus) {
        Status statusvalue = Status.NONE;
        HashMap<Pagamento,Integer> StatusMap = new HashMap<>();
        for (Pagamento status:Pagamento.values()) {
            StatusMap.put(status,0);
        }
        for (VerificarPedidos verificarPedidos:verStatus) {
            StatusMap.replace(verificarPedidos.getStatus(), StatusMap.get(verificarPedidos.getStatus())+1);
        }
        StatusMap.forEach((Status_hashMapKey,integer_hashMapKey)->{
            System.out.println("Chave: "+ Status_hashMapKey + "Value: "+ integer_hashMapKey);
        });
        if(StatusMap.containsValue(5)){
            statusvalue = Status.DEVOLVIDO;
        } else if (StatusMap.containsValue(4)){
            statusvalue = Status.ENTREGUE;
        } else if (StatusMap.containsValue(3)){
            statusvalue = Status.PREPARACAO;
        } else if (StatusMap.containsValue(2)){
            statusvalue = Status.REALIZADO;
        } else if (StatusMap.containsValue(1)){
            statusvalue = Status.SAIU_PARA_ENTREGA;
        } else{
            statusvalue = Status.NONE;
        }
        return statusvalue;
    }

    public List<VerificarPedidos> getVerificarPedidosList() {
        return verificarPedidosList;
    }

    public List<AlterarPedidos> getAlterarPedidosList() {
        return alterarPedidosList;
    }
    public List<Pizza> pizzas() {
        List<Pizza> newPizzas = new ArrayList<Pizza>();
        for (Tipos tiposPizza : Tipos.values()) {
            for (int verificarPedidos = 0; verificarPedidos < 5; verificarPedidos++) {
                newPizzas.add(new Pizza(tiposPizza, verificarPedidos));
            }
        }
        return newPizzas;
    }
}
