package atividade5;

public class main {
      public static void main(String[] args) {

        Produto p1 = new Produto("Camiseta", 20, 50, 10);

        System.out.println("Lucro: " + p1.lucroPresumido());

        p1.vender(5); 
        p1.vender(10); 

        System.out.println("Estoque final: " + p1.getQtdEstoque());
    }
}