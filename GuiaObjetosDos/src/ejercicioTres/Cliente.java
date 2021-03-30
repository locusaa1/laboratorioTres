package ejercicioTres;

import java.util.UUID;

public class Cliente {

    private UUID idCliente;
    private String nombre;
    private char genero;

    public Cliente() {
        this.idCliente = UUID.randomUUID();
    }

    public Cliente(String paramNombre, char paramGenero) {
        this.idCliente = UUID.randomUUID();
        this.nombre = paramNombre;
        this.genero = paramGenero;
    }

    public void setNombre(String paramNombre) {
        this.nombre = paramNombre;
    }

    public void setGenero(char paramGenero) {
        this.genero = paramGenero;
    }

    public UUID getId() {
        return this.idCliente;
    }

    public String getNombre() {
        return this.nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void mostrarCliente(){
        System.out.println("idCliente: "+getId());
        System.out.println("nombre: "+getNombre());
        System.out.println("genero: "+getGenero());
    }
}
