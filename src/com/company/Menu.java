package com.company;

import java.util.Scanner;

public class Menu {
    final static Scanner scanner = new Scanner(System.in);
    public static void run(){
        System.out.println("Pizzaria o Rato que Ri:");
        boolean run = true;
        while(run){
            System.out.println("1- Nova venda");
            System.out.println("2- Verificar pedidos");
            System.out.println("3- Alterar pedidos");
            System.out.println("0- Sair");
            int menu = scanner.nextInt();

        }
    }
}
