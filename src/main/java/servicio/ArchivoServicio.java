package servicio;

import modelo.Cliente;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArchivoServicio extends Exportador {
    @Override
    public void exportar() {
    }

    @Override
    public void exportar(String fileName, ArrayList<Cliente> cliente) throws IOException {
    }

    public void cargarDatos(String fileName) {

        List<Object> nuevaLista = new ArrayList<>();
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                nuevaLista.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error!");
            e.printStackTrace();
        }

    }
}
