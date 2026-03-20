package atividade1;

public class main {
    public static void main(String[] args) {
       lampada lampada = new lampada();

       lampada.ligar();
       System.out.println("ligada:" + lampada.ligada);
         System.out.println("Potência: " + lampada.potencia);

        lampada.meiaLuz();
        System.out.println("Ligada: " + lampada.ligada);
        System.out.println("Potência: " + lampada.potencia);

        lampada.desligar();
        System.out.println("Ligada: " + lampada.ligada);
        System.out.println("Potência: " + lampada.potencia);
    }
}