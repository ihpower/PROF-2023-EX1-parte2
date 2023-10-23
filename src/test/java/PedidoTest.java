

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.examen.slama.Pedido;

public class PedidoTest {

    @Test
    public void importe_pedido() {
        Pedido pedido = new Pedido("item", 1, 1.0);
        double importeEsperado = 1.0;
        assertEquals(importeEsperado, pedido.getImportePedido());
    }
}
