package com.company.Models;

import com.company.Enum.Status;
import com.company.Interface.AlterarStatus;
import com.company.Interface.VerStatus;

import java.util.HashMap;
import java.util.List;

public class Descricao implements VerStatus, AlterarStatus {
    private List<VerificarPedidos> verificarPedidosList;
    private List<AlterarPedidos> alterarPedidosList;

    public Descricao(List<VerificarPedidos> verificarPedidosList, List<AlterarPedidos> alterarPedidosList) {
        this.verificarPedidosList = verificarPedidosList;
        this.alterarPedidosList = alterarPedidosList;
    }

    public List<VerificarPedidos> getVerificarPedidosList() {
        return verificarPedidosList;
    }

    public List<AlterarPedidos> getAlterarPedidosList() {
        return alterarPedidosList;
    }

    @Override
    public Status alterarStatus(List<AlterarPedidos> alterarStatus) {
        Status statusvalue = Status.NONE;
        HashMap<Status,Integer> StatusMap = new HashMap<>();
        for (Status status:Status.values()) {
            StatusMap.put(status, 0);
        }
        for (AlterarPedidos alterarPedidos:alterarStatus) {
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
        HashMap<Status,Integer> StatusMap = new HashMap<>();
        for (Status status:Status.values()) {
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
}
