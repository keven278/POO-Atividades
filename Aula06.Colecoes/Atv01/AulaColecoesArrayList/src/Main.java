public class Main {
    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();
        Item intem1 = new Item("Arroz");
        Item intem2 = new Item("Feijão");
        Item intem3 = new Item("Carne");

        lista.adicionarItem(intem1);
        lista.adicionarItem(intem2);
        lista.adicionarItem(intem3);

        lista.mostrarLista();
        lista.removerItem(intem2);
        lista.mostrarLista();

    }
}