import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        // Criando a pilha
        Stack<Mercadoria> pilhaMercadorias = new Stack<>();
        pilhaMercadorias.push(new Mercadoria("Mouse"));
        pilhaMercadorias.push(new Mercadoria("Teclado"));
        pilhaMercadorias.push(new Mercadoria("Monitor"));
        System.out.println(" ELEMENTOS DA PILHA ");

        for (Mercadoria produto : pilhaMercadorias) {
            System.out.println(produto);
        }
        System.out.println("\n TOPO DA PILHA ");
        System.out.println(pilhaMercadorias.peek());
        System.out.println("\n REMOVENDO ELEMENTO ");
        Mercadoria removido = pilhaMercadorias.pop();
        System.out.println("Removido: " + removido);
        System.out.println("\n PILHA APÓS REMOÇÃO ");

        // for-each novamente
        for (Mercadoria produto : pilhaMercadorias) {
            System.out.println(produto);
        }

        System.out.println("\n QUANTIDADE DE ELEMENTOS ");
        System.out.println(pilhaMercadorias.size());
        System.out.println("\n PILHA ESTÁ VAZIA? ");
        System.out.println(pilhaMercadorias.empty());
    }
}