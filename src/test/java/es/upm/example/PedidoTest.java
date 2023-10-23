package es.upm.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {

    private final static int NUMBER_OF_ITEMS = 28;

    private final static double ITEM_PRICE = 2.99;

    private Pedido pedido;

    @Test
    void testTotalPedido(){
        pedido = new Pedido("Item", NUMBER_OF_ITEMS,ITEM_PRICE);

        Assertions.assertEquals(NUMBER_OF_ITEMS * ITEM_PRICE, pedido.getImportePedido());
    }
}
