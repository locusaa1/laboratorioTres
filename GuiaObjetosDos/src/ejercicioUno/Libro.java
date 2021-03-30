package ejercicioUno;

import java.util.ArrayList;

public class Libro {

    //Atributos
    private String titulo;
    private double precio;
    private int stock;
    private ArrayList<Autor> autores;

    //Constructores
    public Libro(String effective_java, int i, int i1) {
        this.autores = new ArrayList<Autor>(0);
    }

    public Libro(String paramTitulo, double paramPrecio, int paramStock, Autor paramAutor) {
        this.titulo = paramTitulo;
        this.precio = paramPrecio;
        this.stock = paramStock;
        this.autores = new ArrayList<Autor>(1);
        this.autores.add(paramAutor);
    }

    //Setters
    public void setTitulo(String paramTitulo) {
        this.titulo = paramTitulo;
    }

    public void setPrecio(double paramPrecio) {
        this.precio = paramPrecio;
    }

    public void setStock(int paramStock) {
        this.stock = paramStock;
    }

    public void setAutores(ArrayList<Autor> paramAutores) {
        this.autores = (ArrayList<Autor>) paramAutores.clone();
    }

    //Getters
    public String getTitulo() {
        return this.titulo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }

    public ArrayList<Autor> getAutores() {
        return this.autores;
    }

    //Metodos.Solicitados
    public void mostrarLibro() {
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Stock: " + getStock());
    }

    public void modificarPrecio(double modificacion) {
        setPrecio(this.precio + modificacion);
    }

    public void modificarUnidades(int modificacion) {
        setStock(this.stock + modificacion);
    }

    public void mostrarAutores() {
        for (int i = 0; i < this.autores.size(); i++) {
            autores.get(i).mostrarAutor();
            System.out.println();
        }
    }

    public void mostrarMensaje() {
        if (this.autores.size() > 1) {
            System.out.println("El libro: " + getTitulo() + ". Se vende a: " + getPrecio() + " pesos. Sus autores son:");
            System.out.println();
            mostrarAutores();
        } else {
            System.out.println("El libro: " + getTitulo() + " del autor: " + this.autores.get(0).getNombre() + " " + this.autores.get(0).getApellido() + ". Se vende a: " + getPrecio() + " pesos.");
        }
    }
}
