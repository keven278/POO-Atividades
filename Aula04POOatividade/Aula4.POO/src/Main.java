public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat");
        carro1.anoModelo = 2021;
        carro1.placa = "ABC-1234";
        carro1.cor = "Preto";

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Joao");
        pessoa1.setIdade(25);
        pessoa1.usarCarro(carro1);
        carro1.ligar();
        carro1.dirigir();
    }
}