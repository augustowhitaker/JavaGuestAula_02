public class App {
    public static void main(String[] args) throws Exception {

        Produto sabaoEmPo = new Produto(1, "Sabão em pó", 11.20);

        Produto cafe = new Produto(2, "Café", 30.64);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(sabaoEmPo, 2);
        carrinho.adicionarProduto(cafe, 5);

        double total = carrinho.getTotal();

        System.out.println("Total " + total);

        JanelaSupermercado janela = new JanelaSupermercado();
        janela.mostrarJanela();
    }
}
