public class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int experienciaAnos;

    public Instrutor(String nome, String formacao, String email, int experienciaAnos) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.experienciaAnos = experienciaAnos;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getFormacao() {return formacao;}
    public void setFormacao(String formacao) {this.formacao = formacao;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public int getExperienciaAnos() {return experienciaAnos;}
    public void setExperienciaAnos(int experienciaAnos) {this.experienciaAnos = experienciaAnos;}

    public void exibirInstrutor() {
        System.out.println("Instrutor: " + nome);
        System.out.println("Formação: " + formacao);
        System.out.println("Email: " + email);
        System.out.println("Experiência: " + experienciaAnos + " anos");
    }

    public void aplicarAvaliacao(String cursoNome) {
        System.out.println(nome + " aplicou uma avaliação no curso: " + cursoNome);
    }
    public void responderDuvidas(String duvida) {
        System.out.println("Dúvida recebida: \"" + duvida + "\"");
        System.out.println("Resposta: Verifique a seção correspondente no material de apoio.");
    }
    public void criarMaterialDeApoio(String titulo) {
        System.out.println("Material '" + titulo + "' criado com sucesso por " + nome + ".");
    }
    public void agendarLive(String dataHora) {
        System.out.println("Live agendada por " + nome + " para: " + dataHora);
    }
}