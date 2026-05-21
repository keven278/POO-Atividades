//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Suchi", 3, true);
        Gato gato2 = new Gato("cachaça", 1, false);
        gato1.comer();
        gato1.comer();
        gato1.comer();
        gato1.dormir();
        gato1.cacar(2);
        gato2.comer();
        gato2.dormir();
        gato2.cacar(5);
    }
}