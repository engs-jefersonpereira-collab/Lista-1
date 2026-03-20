package atividade8;

public class Usuario {
     private String login;
    private String senha;
    private int tentativasFalhas;
    private boolean bloqueado;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
        this.tentativasFalhas = 0;
        this.bloqueado = false;
    }