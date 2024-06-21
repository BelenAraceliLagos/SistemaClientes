package servicio;

import modelo.Cliente;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Exportador {

    public abstract void exportar();

    //public abstract void exportar(ArrayList<Cliente> cliente) throws IOException;

    public abstract void exportar(String fileName, ArrayList<Cliente> cliente) throws IOException;
}
