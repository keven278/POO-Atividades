public class Main {
    public static void main(String[] args) {
        Animal vaca = new Vaca("joana",10025);
        Animal papagaio = new Papagaio("Louro","verde");
        Animal gato = new Gato("Tom","preto");

        vaca.emitirSom();
        vaca.mover();
        papagaio.emitirSom();
        papagaio.mover();
        gato.emitirSom();
        gato.mover();
    }
}