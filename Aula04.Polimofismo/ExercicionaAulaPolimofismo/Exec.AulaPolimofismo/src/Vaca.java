public class Vaca extends Animal{
    private int nmrMarcacao;

    public Vaca(String nome, int nmrMarcacao) {
        super(nome);
        this.nmrMarcacao = nmrMarcacao;
    }
    public int getIdade(){return nmrMarcacao;}
    public void setIdade(int idade){this.nmrMarcacao = idade;}

    @Override
    public void emitirSom() {
        System.out.println(nome + " Muuu! ");
    }
    public void emitirSom(String frase) {
        System.out.println(frase);
    }
    @Override
    public void mover() {
        System.out.println(nome + " Andando pelo pasto. ");
    }

}
