//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartao(150.00);
        Pagamento pagamento2 = new PagamentoPix(80.00);
        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
    }
}