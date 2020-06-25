package com.company.Models;

import com.company.Interface.Autenticar;

import java.util.Scanner;

public class Usuario implements Autenticar {
    private String name;
    private String email;
    private String senha = "123456";

    public Usuario(String name, String email, String senha) {
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    public boolean autenticarSenha(){
        Scanner name = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String email = name.nextLine();
        System.out.println(email.equals(this.senha));
        return email.equals(this.senha);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
