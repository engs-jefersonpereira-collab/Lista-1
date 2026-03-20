package atividade4;
public class main {
    
     public static void main(String[] args) {

        Conta c1 = new Conta(100, 50);

        c1.depositar(50);   
        c1.sacar(180);      

        System.out.println("Saldo: " + c1.getSaldo());

        if (c1.usandoChequeEspecial()) {
            System.out.println("Está usando cheque especial");
        } else {
            System.out.println("Não está usando cheque especial");
        }
    }
}