public class main {
      public static void main(String[] args) {

        Termometro t = new Termometro();

        t.aumentarTemp(25); 
        t.diminuirTemp(5); 

        System.out.println("Temperatura atual: " + t.getTemperaturaAtual());
        System.out.println("Em Fahrenheit: " + t.exibirFahrenheit());
    }
}