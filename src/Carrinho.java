import java.util.ArrayList;

public class Carrinho {

    private ArrayList<ItemCarrinho> itens;

    public Carrinho() {
        itens = new ArrayList<ItemCarrinho>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        ItemCarrinho itemCarrinho = new ItemCarrinho(produto, quantidade);
        itens.add(itemCarrinho);
    }

    public double getTotal() {
        double total = 0;

        for (ItemCarrinho item : itens) {
            double itemSubtotal = item.getSubtotal();
            total += itemSubtotal;
        }

        return total;

    }

    public double getTotalComDesconto() {
        double total = getTotal();

        if (total >= 200) {
            return total - (total * 0.2);
        }
        return total;
    }
}
