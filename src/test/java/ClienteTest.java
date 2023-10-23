import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.examen.slama.Cliente;
import com.examen.slama.NoHayPedidosException;
import com.examen.slama.Pedido;

public class ClienteTest {
    
    @Test
    public void cliente_sin_pedidos(){
        Cliente cliente = new Cliente();
        assertThrows(NoHayPedidosException.class, () -> cliente.calculaImportePedidos());
    }

    @Test
    public void cliente_con_pedidos() throws NoHayPedidosException{
        Cliente cliente = new Cliente();
        cliente.setPedido(new Pedido("item", 1, 1.0));
        double importeEsperado = 1.0;
        assertEquals(importeEsperado, cliente.calculaImportePedidos());
    }

}
