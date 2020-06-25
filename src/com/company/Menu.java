package com.company;
import com.company.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe ponto de entrada da aplicação base.<br>
 *     Ela é responsável a dar o inicio da aplicação, criando as instancias dos objetos por meio dela.
 *     Pórem está incompleta
 * @author Caio Cruz Alfonso Garcia - caiogarcia96@hotmail.com
 * @since 25/06/2020
 * @version 1.0
 */
public class Menu {
    final static Scanner scanner = new Scanner(System.in);
    private static List<Pizza> pizzas = new ArrayList<>();
    private List<Descricao> descricao = new ArrayList<>();
    private List<Cadastrar> cadastraru  = new ArrayList<>();
    private List<String> pagamentos  = new ArrayList<>();
    private List<String> status = new ArrayList<>();

    /**
     * Cria um menu usando switch case dentro de um looping while.
     */
    public static void run(){
        System.out.println("Pizzaria o Rato que Ri:");
        boolean run = true;
        while(run){
            System.out.println("1- Nova venda");
            System.out.println("2- Verificar pedidos");
            System.out.println("3- Alterar pedidos");
            System.out.println("0- Sair");
            int menu = scanner.nextInt();

            switch (menu){
                case 1:
//                    Usuario usuario = usuarioNovo();
//                    //var1.novaVenda();

                break;
                case 2:
//                    Descricao pedido = new Descricao(,);
//                    verPedidos(pedido.getVerificarPedidosList());
//                    System.out.println("Pedidos"+pedido.checkStatus(pedido.getVerificarPedidosList()));

                break;
                case 3:
//                    Descricao pedido1 = new Descricao(,);
//                    trocarPedidos(pedido1.getAlterarPedidosList());
//                    System.out.println("Pedidos"+pedido1.alterarStatus(pedido1.getAlterarPedidosList()));

                break;
                case 0:
                    run = false;
                break;
                default:
                    break;
            }
        }
    }
    /**
     * @param usuarioNovo cria um usuario com nome email e senha.
     */

//    public static Usuario usuarioNovo(){
//        Usuario usuario = new Usuario("Caio","caiogarcia96@hotmail.com","123456");
//        return usuario;
//    }
    /**
     * @param verStatus ver o tamanho da lsta de pedidos implementada no problema.
     */
    public static void verPedidos(List<VerificarPedidos> verStatus){
        System.out.println("Size: " +verStatus.size());
        for (VerificarPedidos verificarPedidos: verStatus) {
            System.out.println(verStatus);
        }
    }

    /**
     * @param mudarStatus ver o tamanho da lista alterando o pedido.
     */
    public static void trocarPedidos(List<AlterarPedidos> mudarStatus){
        System.out.println("Size: " +mudarStatus.size());
        for (AlterarPedidos alterarPedidos: mudarStatus) {
            System.out.println(mudarStatus);
        }
    }
    /**
     * @param novaVenda criaria um pedido de pizza com uma determinado usuario.
     */
//    public void novaVenda(){
//        if(!usuaioNovo().autenticarSenha()){
//            System.out.println("Operacao nao permitida - senha invalida ");
//        } else{
//            boolean var1 = true;
//
//        }
//    }
}
