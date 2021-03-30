package ejercicioTres;

public class ItemDeVenta {

    //Atributos
    private int id;
    private String nombre;
    private int dni;
    private String descripcion;
    private double cantidad;
    private double precioUnitario;
    private double precioTotal;

    //Constructores
    public ItemDeVenta() {
    }

    public ItemDeVenta(String paramNombre, String paramDesc, double paramCantidad, double paramPrecioUni, double paramPrecioTotal) {
        //this.id=ultimoId el id solo lo controlaría los constructores?
        this.nombre = paramNombre;
        this.descripcion = paramDesc;
        this.cantidad = paramCantidad;
        this.precioUnitario = paramPrecioUni;
        this.precioTotal = paramPrecioTotal;
    }

    //Setters
    public void setNombre(String paramNombre) {
        this.nombre = paramNombre;
    }

    public void setDescripcion(String paramDescripcion) {
        this.descripcion = paramDescripcion;
    }

    public void setCantidad(double paramCantidad) {
        this.cantidad = paramCantidad;
    }

    public void setPrecioUnitario(double paramPrecioUni) {
        this.precioUnitario = paramPrecioUni;
    }

    public void setPrecioTotal(double paramPrecioTotal) {
        this.precioTotal = paramPrecioTotal;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getCantidad() {
        return this.cantidad;
    }

    public double getPrecioUnitario() {
        return this.precioUnitario;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    //Metodos.Solicitados
    public void mostrarItem() {
        System.out.println("Nombre del producto: " + getNombre());
        System.out.println("Desc: " + getDescripcion());
        System.out.println("Cantidad: " + getCantidad());
        System.out.println("Precio Unitario: " + getPrecioUnitario());
        System.out.println("Precio Total: " + getPrecioTotal());
    }

}
