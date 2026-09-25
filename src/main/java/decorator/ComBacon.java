package decorator;

public class ComBacon extends DecoradorPedido {

    private static final double PRECO_ADICIONAL = 4.5;

    public ComBacon(IPedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " + Bacon";
    }

    @Override
    public double getPreco() {
        return pedido.getPreco() + PRECO_ADICIONAL;
    }
}