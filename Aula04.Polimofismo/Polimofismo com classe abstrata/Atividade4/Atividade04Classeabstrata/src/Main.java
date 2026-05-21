//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Carro("Fusca");
        Veiculo v2 = new Bicicleta("Caloi");
        System.out.println("Modelo: " + v1.modelo);
        v1.mover();
        System.out.println("Modelo: " + v2.modelo);
        v2.mover();
    }
}