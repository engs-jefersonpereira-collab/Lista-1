    package atividade1;

    public class lampada {
        boolean ligada;
        int potencia;


    void ligar(){
      ligada = true;
      potencia = 100;
     }

    void desligar(){
      ligada = false;
      potencia = 0;
     }

    void meiaLuz() {
      ligada = true;
      potencia = 50;
    }

    }