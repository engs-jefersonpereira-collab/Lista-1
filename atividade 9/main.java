package atividade9;

public class main {
        public static void main(String[] args) {

        Dado d1 = new Dado();
        Dado d2 = new Dado();

        int valor1 = d1.rolar();
        int valor2 = d2.rolar();

        int soma = valor1 + valor2;

        System.out.println("Dado 1: " + valor1);
        System.out.println("Dado 2: " + valor2);
        System.out.println("Soma: " + soma);

        if (soma == 7 || soma == 11) {
            System.out.println("Voce ganhou!");
        } else if (soma == 2 || soma == 3 || soma == 12) {
            System.out.println("Voce perdeu!");
        } else {
            System.out.println("Tente de novo");
        }
    }
}