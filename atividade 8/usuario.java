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

       public boolean autenticar(String senha) {

        if (bloqueado) {
            System.out.println("Usuário bloqueado");
            return false;
        }

        if (this.senha.equals(senha)) {
            tentativasFalhas = 0;
            return true;
        } else {
            tentativasFalhas++;
            System.out.println("Senha incorreta");

            if (tentativasFalhas >= 3) {
                bloqueado = true;
                System.out.println("Usuário bloqueado por excesso de tentativas");
            }

            return false;
        }
    }
}