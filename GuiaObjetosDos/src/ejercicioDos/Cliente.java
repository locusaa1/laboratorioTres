package ejercicioDos;

import java.util.UUID;

public class Cliente {

    private UUID idCliente;
    private String nombre;
    private String email;
    private double descuento;

    public Cliente() {
        this.idCliente = UUID.randomUUID();
    }

    public Cliente(String paramNombre, String paramEmail, double paramDescuento) {
        this.idCliente = UUID.randomUUID();
        this.nombre = paramNombre;
        this.email = paramEmail;
        this.descuento = paramDescuento;
    }

    public void setNombre(String paramNombre) {
        this.nombre = paramNombre;
    }

    public void setEmail(String paramEmail) {
        this.email = paramEmail;
    }

    public void setDescuento(double paramDescuento) {
        this.descuento = paramDescuento;
    }

    public UUID getIdCliente() {
        return this.idCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public double getDescuento() {
        return this.descuento;
    }

    public void mostrarCliente() {
        System.out.println("idCliente: " + getIdCliente());
        System.out.println("nombre: " + getNombre());
        System.out.println("email: " + getEmail());
        System.out.println("descuento: " + getDescuento() + "%");
    }

}
