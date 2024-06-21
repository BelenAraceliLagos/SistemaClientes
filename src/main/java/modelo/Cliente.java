package modelo;

public class Cliente {

    private String runCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String aniosCliente;
    CategoriaEnum estadoCliente;

    public Cliente(){
    }

    public Cliente(String runCliente, String nombreCliente, String apellidoCliente, String aniosCliente, CategoriaEnum estadoCliente) {
        this.runCliente = runCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.aniosCliente = aniosCliente;
        this.estadoCliente = estadoCliente;
    }

    public String getRunCliente() {
        return runCliente;
    }

    public void setRunCliente(String runCliente) {
        this.runCliente = runCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getAniosCliente() {
        return aniosCliente;
    }

    public void setAniosCliente(String aniosCliente) {
        this.aniosCliente = aniosCliente;
    }

    public CategoriaEnum getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(CategoriaEnum estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "runCliente='" + runCliente + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", apellidoCliente='" + apellidoCliente + '\'' +
                ", aniosCliente='" + aniosCliente + '\'' +
                ", estadoCliente=" + estadoCliente +
                '}';
    }
}
