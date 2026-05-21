public class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, String corPelo) {
        super(nome);
        this.corPelo = corPelo;
    }
    public String getCorPelo() {return corPelo;}
    public void setCorPelo(String corPelo) {this.corPelo = corPelo;}

    @Override
    public void emitirSom() {
        System.out.println(nome + " Miau! ");
    }
    public void emitirSom(String frase) {
        System.out.println(frase);
    }
    @Override
    public void mover() {
        System.out.println(nome + " Saltando agilmente ");
    }

}
