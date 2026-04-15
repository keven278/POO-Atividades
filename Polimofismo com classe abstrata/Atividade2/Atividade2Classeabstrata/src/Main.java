//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioCLT("Ana", 3000);
        Funcionario f2 = new FuncionarioFreelancer("Carlos", 40, 50);

        System.out.println("Salário de " + f1.nome + ": " + f1.calcularSalario());
        System.out.println("Salário de " + f2.nome + ": " + f2.calcularSalario());

    }
}