import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import examen1.Cliente;
import examen1.NoHayPedidosException;
import examen1.Pedido;

class TestCliente {
    
    final String item = "item";
    final int unidades = 1;
    final double precio = 1.0;

    @Test
    public void testCalculaImportePedidos() {
        Cliente cliente = new Cliente();
        assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos());
    }

    @Test
    public void testCalculaImportePedidos2() throws NoHayPedidosException{
        Cliente cliente = new Cliente();
        cliente.setPedido(new Pedido(item, unidades, precio));
        assertEquals(1.0, cliente.calculaImportePedidos());
    }
}
