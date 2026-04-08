public class Carro {
    String modelo;
    int anoModelo;
    String placa;
    String cor;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public void dirigir() {
        System.out.println("Dirigindo o carro modelo " + modelo);
    }

    public void ligar() {
        System.out.println("Carro ligado");
    }

    public void desligar() {
        System.out.println("Carro desligado");
    }

    public void estacionar() {
        System.out.println("Carro estacionado");
    }
}