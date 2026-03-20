package atividade7;

public class main {
       public static void main(String[] args) {

        Elevador e = new Elevador(0, 200);

        e.entrar(80);
        e.entrar(90);
        e.entrar(50); 

        System.out.println("Peso atual: " + e.getPesoAtual());

        e.subir(); 

        e.sair(50); 

        e.subir();
    }
}