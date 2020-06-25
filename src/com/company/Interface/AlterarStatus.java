package com.company.Interface;

import com.company.Enum.Status;
import com.company.Models.AlterarPedidos;

import java.util.List;

/**
 * Interface.<br>
 *       Ela é responsável por fazer uma alteração no pedido caso seja necessario.
 * @author Caio Cruz Alfonso Garcia - caiogarcia96@hotmail.com
 * @since 25/06/2020
 * @version 1.0
 */
public interface AlterarStatus {
    Status alterarStatus(List<AlterarPedidos> mudarStatus);
}
