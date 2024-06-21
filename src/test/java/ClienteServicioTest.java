import org.junit.jupiter.api.*;
import servicio.ClienteServicio;

import java.util.List;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Test clase ClienteServicio")
public class ClienteServicioTest {

    ClienteServicio nuevoCliente = new ClienteServicio();

    @Test
    public void agregarClienteTest() {

        String respuestaServicio = String.valueOf(nuevoCliente.agregarCliente());
        assertEquals("Cliente agregado con exito!", respuestaServicio);
    }

    @Test
    public void AgregarClienteNullTest(){
        List<Object> listaClientes = nuevoCliente.listarClientes();
        assertNotNull(listaClientes);
    }
}
