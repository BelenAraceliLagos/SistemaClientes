package vistas;

import servicio.ArchivoServicio;
import servicio.ClienteServicio;
import servicio.ExportadorCsv;
import servicio.ExportadorTxt;

import java.util.List;
import java.util.Scanner;

public class Menu {


    ClienteServicio clienteServicio = new ClienteServicio();
    ArchivoServicio archivoServicio = new ArchivoServicio();
    ExportadorCsv exportadorCsv = new ExportadorCsv();
    ExportadorTxt exportadorTxt;
    String fileName = "Clientes";
    String fileName1 = "DBClientes.csv";
    Scanner sc = new Scanner(System.in);


    public Menu(){
    }

    public Menu(Scanner sc) {
        this.sc = sc;
    }

    public void iniciarMenu() {

        int opcion = 0;
        do {
            System.out.println("Elija una opcion: \n" +
                               "1. Listar Clientes \n" +
                               "2. Agregar Cliente \n" +
                               "3. Editar Cliente \n" +
                               "4. Cargar Datos \n" +
                               "5. Exportar Datos \n" +
                               "6. Salir"
            );

            opcion = sc.nextInt();

            switch (opcion){
                case 1: clienteServicio.listarClientes();
                        break;
                case 2: clienteServicio.agregarCliente();
                        break;
                case 3: clienteServicio.editarCliente();
                        break;
                case 4: archivoServicio.cargarDatos(fileName);
                        break;
                case 5: exportadorCsv.exportar();
                        break;
                case 6:
                    System.out.println("Ha salido del programa");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida!");
            }
        }
        while (opcion !=6);

    }
}
