package es.upm.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private final static int NUMBER_OF_ITEMS_1 = 28;

    private final static double ITEM_PRICE_1 = 2.99;

    private final static int NUMBER_OF_ITEMS_2 = 2;

    private final static double ITEM_PRICE_2 = 299.99;

    private Cliente cliente;

    @BeforeEach
    void prepararTest(){
        cliente = new Cliente();
    }


    @Test
    void calcularPreciosSinPedidos(){
        Assertions.assertThrows(NoHayPedidosException.class, () -> {
            cliente.calculaImportePedidos();
        });
    }

    @Test
    void calcularPedidosDeCliente() throws NoHayPedidosException {
        Pedido pedido1 = new Pedido("Item 1", NUMBER_OF_ITEMS_1, ITEM_PRICE_1);
        Pedido pedido2 = new Pedido("Item 1", NUMBER_OF_ITEMS_2, ITEM_PRICE_2);

        cliente.setPedido(pedido1);
        cliente.setPedido(pedido2);

        double expectingPrice = (NUMBER_OF_ITEMS_1 * ITEM_PRICE_1) + (NUMBER_OF_ITEMS_2 * ITEM_PRICE_2);

        Assertions.assertEquals(expectingPrice, cliente.calculaImportePedidos());

    }
}
