package atividade4;

public class Conta {
     private double saldo;
    private double limite;

    
    public Conta(double saldo, double limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

     public void depositar(double valor) {
        saldo += valor;
    }

    
    public void sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

   
    public boolean usandoChequeEspecial() {
        return saldo < 0;
    }

    
    public double getSaldo() {
        return saldo;
    }
}