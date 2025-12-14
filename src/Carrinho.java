import java.util.ArrayList;

public class Carrinho {

    private ArrayList<ItemCarrinho> itens;
    private static final int VALOR_MINIMO_DESCONT0 = 200;
    private static final double VALOR_PORCENTUAL_DESCONTO = 0.2;

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

        if (total >= VALOR_MINIMO_DESCONT0) {
            return total - (total * VALOR_PORCENTUAL_DESCONTO);
        }
        return total;
    }
}
