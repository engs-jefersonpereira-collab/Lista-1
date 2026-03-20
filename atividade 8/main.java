package atividade8;

public class main {
     public static void main(String[] args) {

        Usuario u = new Usuario("arthur", "1234");

        System.out.println(u.autenticar("1111"));  
        System.out.println(u.autenticar("2222")); 
        System.out.println(u.autenticar("3333")); 

        System.out.println(u.autenticar("1234")); 
    }
}