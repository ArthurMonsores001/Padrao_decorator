package decorator;

public class ComQueijo extends DecoradorPedido {

    private static final double PRECO_ADICIONAL = 3.0;

    public ComQueijo(IPedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " + Queijo";
    }

    @Override
    public double getPreco() {
        return pedido.getPreco() + PRECO_ADICIONAL;
    }
}