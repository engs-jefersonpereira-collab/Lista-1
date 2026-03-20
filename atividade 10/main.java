package atividade10;
public class main {
    public static void main(String[] args) {

        BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.0, 100);

        bomba.abastecerPorValor(50);  
        bomba.abastecerPorLitro(10); 

        System.out.println("Restante na bomba: " + bomba.getQuantidadeCombustivel());
    }
}