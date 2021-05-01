package programacion.objetos;

import java.time.LocalDate;
import java.util.UUID;

public class Alquiler {

    private UUID idAlquiler;
    private Pelicula pelicula;
    private Cliente cliente;
    private LocalDate fechaDeAlquiler;
    private LocalDate fechaDeDevolucion;
    private Boolean estado;

    public Alquiler() {

        this.estado = true;
    }

    public Alquiler(Pelicula pelicula, Cliente cliente, LocalDate fechaDeAlquiler, LocalDate fechaDeDevolucion) {

        this.idAlquiler = UUID.randomUUID();
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fechaDeAlquiler = fechaDeAlquiler;
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.estado = true;
    }

    public UUID getIdAlquiler(){
        return this.idAlquiler;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaDeAlquiler() {
        return fechaDeAlquiler;
    }

    public void setFechaDeAlquiler(LocalDate fechaDeAlquiler) {
        this.fechaDeAlquiler = fechaDeAlquiler;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String estadoActual() {
        return (this.getEstado()) ? "PENDIENTE" : "DEVUELTO";
    }

    //Sting de salida de datos
    @Override
    public String toString() {

        return "Detalles del alquiler:" + "\n" +
                "pelicula:" + this.pelicula.getTitulo() + "\n" +
                "fechaDeAlquiler:" + this.fechaDeAlquiler + "\n" +
                "fechaDeDevolucion:" + this.fechaDeDevolucion + "\n" +
                this.cliente.toString() + "\n" +
                "estado:" + this.estadoActual();
    }
}
