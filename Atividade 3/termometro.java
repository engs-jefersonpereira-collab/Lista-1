public class Termometro {

    
    private double temperaturaAtual;

    
    public void aumentarTemp(double valor) {
        temperaturaAtual += valor;
    }

    
    public void diminuirTemp(double valor) {
        temperaturaAtual -= valor;
    }

    
    public double exibirFahrenheit() {
        return (temperaturaAtual * 1.8) + 32;
    }

    
    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }
}