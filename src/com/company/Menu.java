package com.company;

import com.company.Models.Usuario;

import java.util.Scanner;

public class Menu {
    final static Scanner scanner = new Scanner(System.in);
    public static void run(){
        System.out.println("Pizzaria o Rato que Ri:");
        Usuario usuario = new Usuario("Caio","caiogarcia96@hotmail.com","123456");
        boolean run = true;
        while(run){
            System.out.println("1- Nova venda");
            System.out.println("2- Verificar pedidos");
            System.out.println("3- Alterar pedidos");
            System.out.println("0- Sair");
            int menu = scanner.nextInt();

            switch (menu){
                case 1:


                break;
                case 2:


                break;
                case 3:


                break;
                case 4:
                    run = false;
                break;
                default:
                    break;
            }
        }
    }
}
