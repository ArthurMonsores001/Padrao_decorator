package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void lanchePuroDeveTerDescricaoEPrecoBase() {
        IPedido pedido = new Lanche("X-Burger", 12.0);

        assertEquals("X-Burger", pedido.getDescricao());
        assertEquals(12.0, pedido.getPreco(), 0.001);
    }

    @Test
    void deveAdicionarQueijoCorretamente() {
        IPedido pedido = new ComQueijo(new Lanche("X-Burger", 12.0));

        assertEquals("X-Burger + Queijo", pedido.getDescricao());
        assertEquals(15.0, pedido.getPreco(), 0.001);
    }

    @Test
    void deveAdicionarBaconCorretamente() {
        IPedido pedido = new ComBacon(new Lanche("X-Burger", 12.0));

        assertEquals("X-Burger + Bacon", pedido.getDescricao());
        assertEquals(16.5, pedido.getPreco(), 0.001);
    }

    @Test
    void deveAdicionarMolhoEspecialCorretamente() {
        IPedido pedido = new ComMolhoEspecial(new Lanche("X-Burger", 12.0));

        assertEquals("X-Burger + Molho Especial", pedido.getDescricao());
        assertEquals(14.0, pedido.getPreco(), 0.001);
    }

    @Test
    void deveEmpilharTresDecoradoresCorretamente() {
        IPedido pedido = new ComMolhoEspecial(new ComBacon(new ComQueijo(new Lanche("X-Burger", 12.0))));

        assertEquals("X-Burger + Queijo + Bacon + Molho Especial", pedido.getDescricao());
        assertEquals(21.5, pedido.getPreco(), 0.001);
    }

    @Test
    void ordemDosDecoradoresNaoAlteraOPrecoFinal() {
        IPedido pedidoA = new ComBacon(new ComQueijo(new Lanche("X-Burger", 12.0)));
        IPedido pedidoB = new ComQueijo(new ComBacon(new Lanche("X-Burger", 12.0)));

        assertEquals(pedidoA.getPreco(), pedidoB.getPreco(), 0.001);
        assertNotEquals(pedidoA.getDescricao(), pedidoB.getDescricao());
    }
}