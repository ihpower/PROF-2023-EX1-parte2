package com.examen1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PedidoTest {

    @Test
    public void testGetImportePedido() {
        final int unidades = 1;
        final double precio = 1.0;
        final double importe = 1.0;

        Pedido pedido = new Pedido("item", unidades, precio);

        assertEquals(pedido.getImportePedido(), importe);
    }
    
}