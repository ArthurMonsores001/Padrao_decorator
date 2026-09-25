package decorator;

public class ComMolhoEspecial extends DecoradorPedido {

    private static final double PRECO_ADICIONAL = 2.0;

    public ComMolhoEspecial(IPedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " + Molho Especial";
    }

    @Override
    public double getPreco() {
        return pedido.getPreco() + PRECO_ADICIONAL;
    }
}