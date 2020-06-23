package com.company.Interface;

import com.company.Enum.Status;
import com.company.Models.AlterarPedidos;

import java.util.List;

public interface AlterarStatus {
    Status alterarStatus(List<AlterarPedidos> alterarStatus);
}
