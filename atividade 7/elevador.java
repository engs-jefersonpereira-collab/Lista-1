package atividade7;

public class Elevador {
    private int andarAtual;
    private double pesoAtual;
    private double pesoMaximo;


    public Elevador(int andarAtual, double pesoMaximo) {
        this.andarAtual = andarAtual;
        this.pesoMaximo = pesoMaximo;
        this.pesoAtual = 0;
    }

    public void entrar(double pesoPessoa) {
        pesoAtual += pesoPessoa;

        if (pesoAtual > pesoMaximo) {
            System.out.println(" Sobrecarga! Elevador não pode subir.");
        }
    }

    public void sair(double pesoPessoa) {
        pesoAtual -= pesoPessoa;

        if (pesoAtual < 0) {
            pesoAtual = 0; 
        }
    }

    public void subir() {
        if (pesoAtual > pesoMaximo) {
            System.out.println(" Sobrecarga! Não é possível subir.");
        } else {
            andarAtual++;
            System.out.println("Subiu para o andar: " + andarAtual);
        }
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public int getAndarAtual() {
        return andarAtual;
    }
}