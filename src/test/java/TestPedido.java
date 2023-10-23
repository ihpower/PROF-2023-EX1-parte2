import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import examen1.Pedido;

class TestPedido {
    final String item = "item";
    final int unidades = 1;
    final double precio = 1.0;
    
    @Test
    public void testGetImportePedido() {
        Pedido pedido = new Pedido(item, unidades, precio);
        assertEquals(1.0, pedido.getImportePedido());
    }

}
