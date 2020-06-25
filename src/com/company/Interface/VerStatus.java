package com.company.Interface;

import com.company.Enum.Status;
import com.company.Models.VerificarPedidos;

import java.util.List;

/**
 * Interface.<br>
 *      Ela é responsável por fazer uma verificação no pedido de pizza.
 * @author Caio Cruz Alfonso Garcia - caiogarcia96@hotmail.com
 * @since 25/06/2020
 * @version 1.0
 */
public interface VerStatus {
    Status checkStatus(List<VerificarPedidos> verStatus);
}
