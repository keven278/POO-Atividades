public class Gato {
    //atributos
    String nome;
    int qtdComidaDisponivel;
    boolean sono;
    int qntRato;

    //construtor
    public Gato(String nome, int qtdComidaDisponivel, boolean sono) {
        this.nome = nome;
        this.qtdComidaDisponivel = qtdComidaDisponivel;
        this.sono = sono;
    }


    //metodos
    public void comer(){
        qtdComidaDisponivel-=1;
        System.out.println(nome+" comeu. Quantidade de comida restante: "+qtdComidaDisponivel);
    }
    public void dormir(){
        if(sono){
            sono = false;
            System.out.println(nome+" Dormiu =)");
        }else
            System.out.println(nome+" Não está com sono =D");
    }
    public void cacar(int qtdRato){
        qtdRato +=1;
        System.out.println(nome+" Caçou " +qtdRato+ " Ratos para o seu dono ");
    }
}
