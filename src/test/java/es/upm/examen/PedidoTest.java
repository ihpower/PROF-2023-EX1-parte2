package es.upm.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {

    private Pedido pedido;

    @BeforeEach
	public void init() {
		this.pedido = new Pedido("Test item", 1, 10.0);
	}

    @Test()
	void getImportePedido() {
        Double expectedAmount = 10.0;
        assertEquals(expectedAmount, this.pedido.getImportePedido());
	}
}
