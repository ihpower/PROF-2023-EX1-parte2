package com.examen1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    public void testCalculaImportePedidosVacio() {
        
        Cliente cliente = new Cliente();
        assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos());
    }

    @Test
    public void testCalculaImportePedidos() throws NoHayPedidosException{
        Cliente cliente = new Cliente();
        final int unidades = 1;
        final double precio = 1.0;
        final double importe = 1.0;
        Pedido pedido = new Pedido("item", unidades, precio);
        cliente.setPedido(pedido);
        assertEquals(cliente.calculaImportePedidos(), importe);
    }
    
}
