package com.company.Models;

import com.company.Interface.Autenticar;

import java.util.Scanner;

/**
 *  Classe ponto de entrada da aplicação base.<br>
 *     Ela é responsável por criar um usuario com nome,email e senha, criando as instancias dos objetos por meio dela.
 *     implementando a interface autenticação
 * @author Caio Cruz Alfonso Garcia - caiogarcia96@hotmail.com
 * @since 25/06/2020
 * @version 1.0
 */
public class Usuario implements Autenticar {
    private String name;
    private String email;
    private String senha = "123456";

    /**
     * @param name enumeração que define o tipo do nome do usuario.
     * @param email enumeração que define o email do usuario.
     * @param senha enumeração que define a senha do usuario.
     */
    public Usuario(String name, String email, String senha) {
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    /**
     * @return senha especifica do enunciado feita pela interface Autenticar.
     */
    public boolean autenticarSenha(){
        Scanner name = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        String email = name.nextLine();
        System.out.println(email.equals(this.senha));
        return email.equals(this.senha);
    }

    /**
     * @return Getter para enumeração do nome do usuario.
     */
    public String getName() {
        return name;
    }

    /**
     * @return Getter para enumeração do nome do usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return Getter para enumeração do nome do usuario
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @return o parametro como escreve o a classe Usuario.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
