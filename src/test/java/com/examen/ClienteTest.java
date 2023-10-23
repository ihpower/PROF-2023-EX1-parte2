package com.examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClienteTest {

    @Test
    public void testCalculaImportePedidos() throws NoHayPedidosException {
        Cliente cliente = new Cliente();
        int numUnidadesItem1 = 1;
        double precioUnidadItem1 = 100.0;
        int numUnidadesItem2 = 2;
        double precioUnidadItem2 = 200.0;
        Pedido pedido1 = new Pedido("item1", numUnidadesItem1, precioUnidadItem1);
        Pedido pedido2 = new Pedido("item2", numUnidadesItem2, precioUnidadItem2);
        cliente.setPedido(pedido1);
        cliente.setPedido(pedido2);
        double expectedImporte = 500;
        double actualImporte = cliente.calculaImportePedidos();
        assertEquals(expectedImporte, actualImporte);
    }

    /**
     * @throws NoHayPedidosException
     */
    @Test
    public void testCalculaImportePedidosSinPedidos() throws NoHayPedidosException {
        Cliente cliente = new Cliente();
        assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos());
    }

}