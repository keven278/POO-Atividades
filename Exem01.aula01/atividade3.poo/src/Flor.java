public class Flor {
    String nome;
    String cor;
    boolean possuiPerfume;

    void mostrarDados() {
        System.out.println("Nome da flor: " + nome);
        System.out.println("Cor da flor: " + cor);
        if (possuiPerfume) {
            System.out.println("Possui perfume: Sim");
        } else {
            System.out.println("Possui perfume: Não");
        }
    }
}