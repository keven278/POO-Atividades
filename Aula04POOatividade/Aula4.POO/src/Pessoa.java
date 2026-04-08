public class Pessoa {
    private String nome;
    private String email;
    private int cpf;
    private int idade;

    public Pessoa() {
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public int getCpf() {return cpf;}
    public void setCpf(int cpf) {this.cpf = cpf;}
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public void usarCarro(Carro carro) {
        System.out.println(nome + " está usando o carro");
        carro.dirigir();
    }
    public void lavarCarro() {
        System.out.println(nome + " está lavando o carro");
    }
    public void abastecerCarro() {
        System.out.println(nome + " está abastecendo o carro");
    }
    public void usarRadio() {
        System.out.println(nome + " está usando o rádio");
    }
}