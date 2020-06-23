package com.company.Interface;

import com.company.Enum.Status;
import com.company.Models.VerificarPedidos;

import java.util.List;

public interface VerStatus {
    Status checkStatus(List<VerificarPedidos> verStatus);
}
