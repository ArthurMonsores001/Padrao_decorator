package decorator;

public class Lanche implements IPedido {
    private final String nome;
    private final double precoBase;

    public Lanche(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    @Override
    public String getDescricao() {
        return nome;
    }

    @Override
    public double getPreco() {
        return precoBase;
    }
}
