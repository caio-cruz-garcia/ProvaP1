package com.company.Models;

import com.company.Enum.Status;
import com.company.Interface.AlterarStatus;
import com.company.Interface.VerStatus;

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
        return null;
    }

    @Override
    public Status checkStatus(List<VerificarPedidos> verStatus) {
        return null;
    }
}
