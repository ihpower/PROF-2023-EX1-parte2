package es.upm.examen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    private Cliente cliente;

    @BeforeEach
    public void init() {
        this.cliente = new Cliente();
    }

    @Test()
    void getNoHayPedidosException() {
        assertThrows(NoHayPedidosException.class, () -> {
            this.cliente.calculaImportePedidos();
        });
    }

    @Test()
    void calculaImportePedidos() throws NoHayPedidosException {
        this.cliente.setPedido(new Pedido("Test item", 1, 10.0));
        Double expectedAmount = 10.0;
        assertEquals(expectedAmount, this.cliente.calculaImportePedidos());
    }
}