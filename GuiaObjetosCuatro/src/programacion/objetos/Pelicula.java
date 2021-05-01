package programacion.objetos;

import java.time.LocalDate;

public class Pelicula {

    private String titulo;
    private String genero;
    private LocalDate fechaDeLanzamiento;
    private int duracion;
    private String clasificacion;
    private String origen;
    private String descripcion;
    private int stock;
    private int popularidad;

    public Pelicula() {

    }

    public Pelicula(String titulo, String genero, LocalDate fecha, int duracion, String clasificaicon, String origen, int stock, String descripcion) {

        this.titulo = titulo;
        this.genero = genero;
        this.fechaDeLanzamiento = fecha;
        this.duracion = duracion;
        this.clasificacion = clasificaicon;
        this.origen = origen;
        this.descripcion = descripcion;
        this.stock = stock;
        this.popularidad = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(LocalDate fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    //String de salida de datos
    @Override
    public String toString() {

        return "Detalles de la pelicula:" + "\n" +
                "titulo: " + this.titulo + "\n" +
                "genero:" + this.genero + "\n" +
                "fechaDeLanzamiento: " + this.fechaDeLanzamiento + "\n" +
                "duracion: " + this.duracion + "\n" +
                "clasificacion: " + this.clasificacion + "\n" +
                "origen: " + this.origen + "\n" +
                "descripcion: " + this.descripcion + "\n" +
                "stock: " + this.stock + "\n" +
                "popularidad: " + this.popularidad;
    }

    //metodo que baja en uno el atributo stock
    public void disminuirStock() {
        this.stock -= 1;
    }

    //metodo que sube en uno el atributo stock
    public void aumentarStock() {
        this.stock += 1;
    }

    //metodo que aumenta en uno el atributo popularidad
    public void aumentarPopularidad() {
        this.popularidad += 1;
    }

}
