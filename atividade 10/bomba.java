package atividade10;

public class BombaCombustivel {
     private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

       public void abastecerPorValor(double valor) {

        double litros = valor / valorLitro;

        if (litros <= quantidadeCombustivel) {
            quantidadeCombustivel -= litros;
            System.out.println("Abastecido: " + litros + " litros");
        } else {
            System.out.println("Combustível insuficiente na bomba");
        }
    }