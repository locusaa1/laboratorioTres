package programacion.objetos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Cliente {

    private String nombre;
    private String dni;
    private String telefono;
    private String direccion;
    private ArrayList<Alquiler> ultimosAlquileres;

    public Cliente() {

        this.ultimosAlquileres = new ArrayList<>();
    }

    public Cliente(String nombre, String dni, String telefono, String direccion) {

        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.ultimosAlquileres = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Alquiler> getUltimosAlquileres() {
        return ultimosAlquileres;
    }

    public void setUltimosAlquileres(ArrayList<Alquiler> ultimosAlquileres) {
        this.ultimosAlquileres = ultimosAlquileres;
    }

    public void setUltimoAlquiler(Alquiler alquiler) {
        this.ultimosAlquileres.add(alquiler);
    }


    //String de salida de datos
    @Override
    public String toString() {

        return "Detalles del cliente: " + "\n" +
                "nombre:" + this.nombre + "\n" +
                "dni:" + this.dni + "\n" +
                "telefono:" + this.telefono + "\n" +
                "direccion:" + this.direccion;
    }

    //metodo que muestra los últimos diez alquileres del cliente
    //confirma si la cantidad de alquileres es menor a diez para no romperse
    public void mostrarUltimosAlquileres() {

        int cantidad = (this.ultimosAlquileres.size() < 10) ? this.ultimosAlquileres.size() : 10;
        for (int i = 0; i < cantidad; i++) {
            System.out.println(this.ultimosAlquileres.get(i).toString() + "\n");
        }
    }

    public void cargarClienteManual() {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el nombre...");
        this.setNombre(in.nextLine());
        System.out.println("Ingrese el dni...");
        this.setDni(in.nextLine());
        System.out.println("Ingrese el telefono...");
        this.setTelefono(in.nextLine());
        System.out.println("Ingrese la direccion...");
        this.setDireccion(in.nextLine());
    }

    public UUID bajaAlquilerCliente(String titulo) {

        Alquiler alquiler = new Alquiler();
        for (int i = 0; i < this.ultimosAlquileres.size(); i++) {
            if (this.ultimosAlquileres.get(i).getPelicula().getTitulo().compareTo(titulo)==0){
                alquiler=this.ultimosAlquileres.get(i);
                i=this.ultimosAlquileres.size();
            }
        }
        alquiler.setEstado(false);
        return alquiler.getIdAlquiler();
    }

}
