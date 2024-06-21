package servicio;

import modelo.CategoriaEnum;
import modelo.Cliente;

import java.util.*;

public class ClienteServicio {

    List<Object> listaClientes = new ArrayList<>();
    private CategoriaEnum activo;

    public ClienteServicio(){
    }

    public ClienteServicio(List<Object> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Object> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Object> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Cliente agregarCliente(){
        System.out.println("Ingrese los datos del cliente: \n" +
                           "Rut: ");
        Scanner run = new Scanner(System.in);
        String rut = run.nextLine();
        System.out.println("Nombre: ");
        Scanner nom = new Scanner(System.in);
        String nombre = nom.nextLine();
        System.out.println("Apellido: ");
        Scanner ap = new Scanner(System.in);
        String apellido = ap.nextLine();
        System.out.println("Años como cliente: ");
        Scanner an = new Scanner(System.in);
        String anios = an.nextLine();

        Cliente nuevoCliente = new Cliente(rut, nombre, apellido, anios, activo);
        listaClientes.add(nuevoCliente);
        System.out.println("Cliente agregado con exito!");
        return nuevoCliente;
    }

    public List<Object> listarClientes(){

        Iterator<Object> it = listaClientes.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        return listaClientes;
    }

    public Cliente buscarCliente() {

        Cliente cliente = new Cliente();
        System.out.println("Ingrese el rut del cliente a editar: ");
        Scanner run = new Scanner(System.in);
        String rut = run.nextLine();

        String nuevoCliente = cliente.getRunCliente();


        return cliente;
    }

    public void editarCliente(){
        System.out.println("-----Editar Cliente-----\n" +
                           "1. Cambiar el estado del cliente\n" +
                           "2. Editar los datos ingresados del cliente");

        Scanner sc = new Scanner(System.in);
        String opcion = sc.nextLine();



        if (opcion.equals(1)){

        }
    }
}
