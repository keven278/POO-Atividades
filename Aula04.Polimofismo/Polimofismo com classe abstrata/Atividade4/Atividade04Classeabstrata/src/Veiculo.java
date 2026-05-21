public abstract class Veiculo {
    String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public abstract void mover();
}