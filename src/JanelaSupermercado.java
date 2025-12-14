import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JanelaSupermercado {
    private JFrame janela;
    private JButton botaoArroz, botaoFeijao;
    private Carrinho carrinho;
    private JLabel labelValorTotal, labelValorTotalDesconto;

    public JanelaSupermercado() {
        carrinho = new Carrinho();

        janela = new JFrame("Supermercado Java");

        janela.setSize(420, 220);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        botaoArroz = new JButton("Adicionar arroz");
        botaoArroz.setBounds(20, 20, 150, 30);

        botaoFeijao = new JButton("Adicionar Feijão");
        botaoFeijao.setBounds(20, 60, 150, 30);

        labelValorTotal = new JLabel("0");
        labelValorTotal.setBounds(320, 40, 120, 30);

        JLabel labelTotal = new JLabel("Total: ");
        labelTotal.setBounds(190, 40, 120, 30);

        JLabel labelValorTotalComDesconto = new JLabel("Total com desconto: ");
        labelValorTotalComDesconto.setBounds(190, 100, 120, 30);

        labelValorTotalDesconto = new JLabel("0");
        labelValorTotalDesconto.setBounds(320, 100, 120, 30);

        janela.add(botaoArroz);
        janela.add(botaoFeijao);
        janela.add(labelValorTotal);
        janela.add(labelTotal);
        janela.add(labelValorTotalComDesconto);
        janela.add(labelValorTotalDesconto);

        criarEventos();

    }

    public void criarEventos() {
        Produto arroz = new Produto(1, "Arroz", 40);
        Produto feijao = new Produto(2, "Feijão", 7.60);

        botaoArroz.addActionListener(e -> {
            carrinho.adicionarProduto(arroz, 1);
            atualizarTotais();
        });

        botaoFeijao.addActionListener(e -> {
            carrinho.adicionarProduto(feijao, 1);
            atualizarTotais();
        });

    }

    public void atualizarTotais() {
        double total = carrinho.getTotal();
        double totalComDesconto = carrinho.getTotalComDesconto();

        labelValorTotal.setText("R$ " + total);
        labelValorTotalDesconto.setText("R$ " + totalComDesconto);
    }

    public void mostrarJanela() {
        janela.setVisible(true);
    }
}
