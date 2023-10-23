package es.upm.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@SelectClasses({PedidoTest.class, ClienteTest.class})
@Suite
public class ClientePedidoTestSuite {
}
