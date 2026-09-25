package decorator;

public abstract class DecoradorPedido implements IPedido {
    protected final IPedido pedido;

    public DecoradorPedido(IPedido pedido) {
        this.pedido = pedido;
    }
}
