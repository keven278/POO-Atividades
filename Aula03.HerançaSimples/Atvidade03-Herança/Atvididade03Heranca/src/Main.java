public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Mimi", 2, "Branca");
        Cachorro cachorro = new Cachorro("Rex", 5, "Grande");
        gato.emitirSom();
        gato.emitirSom("Miau");
        cachorro.emitirSom();
        cachorro.emitirSom("Au Au");

        gato.brincar();
        gato.brincar("novelo de lã");
        cachorro.correr();
        cachorro.correr(100);
    }
}