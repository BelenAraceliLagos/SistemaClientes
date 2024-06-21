package servicio;

import modelo.Cliente;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorTxt extends Exportador{

    @Override
    public void exportar() {

    }

    @Override
    public void exportar(String fileName, ArrayList<Cliente> clientes) throws IOException {


        try {
            File archivo = new File(fileName);
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe!");
            }
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error!");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(String.valueOf(clientes));
            myWriter.close();
            System.out.println("Archivo escrito correctamente!");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error!");
            e.printStackTrace();
        }
    }
}
