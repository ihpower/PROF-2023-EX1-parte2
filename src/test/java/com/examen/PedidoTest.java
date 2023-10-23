package com.examen;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {
    @Test
    public void testGetImportePedido() {
        int numUnidades = 5;
        double precioUnidad = 10.0;
        double precioEsperado = 50.0;
        Pedido pedido = new Pedido("Item Prueba", numUnidades, precioUnidad);
        assertEquals(precioEsperado, pedido.getImportePedido());
    }
}