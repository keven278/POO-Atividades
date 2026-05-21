public class Papagaio extends Animal {
    private String CorPena;

    public Papagaio(String nome, String CorPena) {
        super(nome);
        this.CorPena = CorPena;
    }
    public String getCorPena() {return CorPena;}
    public void setCorPena(String corPena) {CorPena = corPena;}

    @Override
    public void emitirSom() {
        System.out.println(nome + " Curupaco! " );
    }
    public void emitirSom(String frase) {
        System.out.println(frase);
    }
    @Override
    public void mover() {
        System.out.println(nome + " Voando pelos céus! ");
    }
}