package com.company;

import com.company.Interface.VerStatus;
import com.company.Models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    final static Scanner scanner = new Scanner(System.in);
    private static List<Pizza> pizzas = new ArrayList<>();
    private List<Descricao> descricao = new ArrayList<>();
    private List<Cadastrar> cadastraru  = new ArrayList<>();
    private List<String> pagamentos  = new ArrayList<>();
    private List<String> status = new ArrayList<>();

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
                    Usuario usuario = usuaioNovo();
                    var1.novaVenda();

                break;
                case 2:
                    Descricao pedido = new Descricao(,);
                    verPedidos(pedido.getVerificarPedidosList());
                    System.out.println("Pedidos"+pedido.checkStatus(pedido.getVerificarPedidosList()));

                break;
                case 3:
                    Descricao pedido1 = new Descricao(,);
                    trocarPedidos(pedido1.getAlterarPedidosList());
                    System.out.println("Pedidos"+pedido1.alterarStatus(pedido1.getAlterarPedidosList()));

                break;
                case 0:
                    run = false;
                break;
                default:
                    break;
            }
        }
    }
    public static Usuario usuaioNovo(){
        Usuario usuario = new Usuario("Caio","caiogarcia96@hotmail.com","123456");
        return usuario;
    }
    public static void verPedidos(List<VerificarPedidos> verStatus){
        System.out.println("Size: " +verStatus.size());
        for (VerificarPedidos verificarPedidos: verStatus) {
            System.out.println(verStatus);
        }
    }
    public static void trocarPedidos(List<AlterarPedidos> mudarStatus){
        System.out.println("Size: " +mudarStatus.size());
        for (AlterarPedidos alterarPedidos: mudarStatus) {
            System.out.println(mudarStatus);
        }
    }
    public void novaVenda(){
        if(!usuaioNovo().autenticarSenha()){
            System.out.println("Operacao nao permitida - senha invalida ");
        } else{
            boolean var1 = true;
            
        }
    }
}
